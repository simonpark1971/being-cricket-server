package com.redspark.beingcricket.beingcricketserver.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Video {

    @Id
    @GeneratedValue()
    private UUID id;
    private String playerName;
    private String comments;
    private String title;
    private String sessionDate;
    private String description;
    private String category;
    private String videoName;
    @OneToOne(cascade = CascadeType.ALL)
    private VideoFile videoFile;
    @ManyToOne(fetch = FetchType.LAZY)
    private Session session;

    public Video() {}

    public Video(String player,
                 String video,
                 String sessionDate,
                 String title,
                 String description,
                 String comments,
                 String category) {

        this.playerName = player;
        this.videoName = video;
        this.comments = comments;
        this.title = title;
        this.sessionDate = sessionDate;
        this.description = description;
        this.category = category;
        videoFile = new VideoFile();
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String notes) {
        this.comments = notes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public VideoFile getVideoFile() { return videoFile; }

    public void setVideoFile(VideoFile videoFile) { this.videoFile = videoFile; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }


}
