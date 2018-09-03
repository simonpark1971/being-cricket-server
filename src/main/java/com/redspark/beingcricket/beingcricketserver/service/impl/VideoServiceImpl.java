package com.redspark.beingcricket.beingcricketserver.service.impl;

import com.redspark.beingcricket.beingcricketserver.data.VideoRepository;
import com.redspark.beingcricket.beingcricketserver.domain.Video;
import com.redspark.beingcricket.beingcricketserver.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoRepository videoRepository;

    @Override
    public void saveVideo(String playerName, Video video) {
        videoRepository.save(video);
    }

    @Override
    public List<Video> getVideosFor(String playerName) {
        return videoRepository.findByPlayerName(playerName);
    }

    @Override
    public List<Video> getVideos() {
        return StreamSupport.stream(videoRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Video getVideo(String videoId) {
        return videoRepository.findById(UUID.fromString(videoId));
    }

    @Override
    public void deleteVideo(String videoId) {
        videoRepository.deleteById(UUID.fromString(videoId));
    }
}
