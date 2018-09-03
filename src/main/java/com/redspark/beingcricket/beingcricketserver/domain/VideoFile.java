package com.redspark.beingcricket.beingcricketserver.domain;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "video_file")
public class VideoFile implements StorableFile {

    @GeneratedValue
    @Id
    private UUID videoFileId;

    @Transient
    private String sourceLocation;

    @Override
    public String getFileExtension() {
        return ".mp4";
    }

    @Override
    public String getFileName() {
        return videoFileId.toString();
    }

    @Override
    public void setSourceLocation(String location) {
        this.sourceLocation = location;
    }

    @Override
    public String getSource() {
        return this.sourceLocation + getFileName() + getFileExtension();
    }
}
