package com.redspark.beingcricket.beingcricketserver.data;

import com.redspark.beingcricket.beingcricketserver.domain.StorableFile;
import com.redspark.beingcricket.beingcricketserver.domain.Video;
import org.springframework.core.io.AbstractResource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface FileRepository<T extends StorableFile> {

    void storeFile(T file, InputStream inputStream) throws IOException;

    T retrieveFile();

    List<T> retrieveFileList();

    void setFileLocations(List<T> storableFiles);

    AbstractResource getInStream(Video video) throws FileNotFoundException;
}
