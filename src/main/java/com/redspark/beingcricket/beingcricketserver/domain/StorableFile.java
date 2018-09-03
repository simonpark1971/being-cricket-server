package com.redspark.beingcricket.beingcricketserver.domain;

public interface StorableFile {

    String getFileExtension();

    String getFileName();

    void setSourceLocation(String location);

    String getSource();
}
