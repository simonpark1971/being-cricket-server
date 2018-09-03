package com.redspark.beingcricket.beingcricketserver.service;

import com.redspark.beingcricket.beingcricketserver.domain.Video;

import java.util.List;

public interface VideoService {

    void saveVideo(String playerName, Video video);

    List<Video> getVideosFor(String playerName);

    List<Video> getVideos();

    Video getVideo(String videoId);

    void deleteVideo(String videoId);
}
