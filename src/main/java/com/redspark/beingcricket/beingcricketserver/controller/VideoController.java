package com.redspark.beingcricket.beingcricketserver.controller;

import com.redspark.beingcricket.beingcricketserver.data.FileSystemFileRepository;
import com.redspark.beingcricket.beingcricketserver.domain.Video;
import com.redspark.beingcricket.beingcricketserver.domain.VideoFile;
import com.redspark.beingcricket.beingcricketserver.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.AbstractResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class VideoController {

    @Autowired
    private VideoService videoService;

    @Autowired
    private FileSystemFileRepository<VideoFile> fileSystemFileRepository;

    @CrossOrigin(origins = "*")
    @GetMapping("/getvideos")
    public ResponseEntity getVideos(@RequestParam("playerName")String playerName) {
        return new ResponseEntity(videoService.getVideosFor(playerName), HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getallvideos")
    public ResponseEntity getVideos() {
        List<Video> allVideos = videoService.getVideos();
        fileSystemFileRepository.setFileLocations(allVideos.stream().map(Video::getVideoFile).collect(Collectors.toList()));
        return new ResponseEntity(allVideos, HttpStatus.OK);
    }

    public ResponseEntity getVideo(String playerName, String videoName) {
        return null;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/upload")
    public ResponseEntity<?> uploadFile(@RequestParam("file") MultipartFile uploadFile,
                                        @RequestParam("title") String title,
                                        @RequestParam("category") String category,
                                        @RequestParam("playerName") String playerName,
                                        @RequestParam("comments") String comments) {

        Video video = toVideo(title, playerName, category, comments);
        videoService.saveVideo(playerName, video);

        try {
            fileSystemFileRepository.storeFile(video.getVideoFile(), uploadFile.getInputStream());
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return new ResponseEntity("Successfully uploaded - " +
                uploadFile.getOriginalFilename(), new HttpHeaders(), HttpStatus.OK);

    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/download")
    public ResponseEntity<?> download(@RequestParam("id") String videoId) throws IOException {
        Video video = videoService.getVideo(videoId);
        AbstractResource res = (fileSystemFileRepository.getInStream(video));
        byte[] content = new byte[(int)res.contentLength()];
        res.getInputStream().read(content);
        return ResponseEntity.ok()
                .contentLength(content.length)
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(content);
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/deletevideo")
    public ResponseEntity<?> delete(@RequestParam("id") String videoId) {
       videoService.deleteVideo(videoId);
       return new ResponseEntity(HttpStatus.OK);
    }

    private Video toVideo(String title, String playerName, String category, String comments) {
        Video newVideo = new Video(playerName, null, null, title, null, null, category);
        return newVideo;
    }

}
