package com.redspark.beingcricket.beingcricketserver.data;

import com.redspark.beingcricket.beingcricketserver.domain.StorableFile;
import com.redspark.beingcricket.beingcricketserver.domain.Video;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.AbstractResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;

@Component
public class FileSystemFileRepository<T extends StorableFile> implements FileRepository {

    private static final String UPLOAD_DIRECTORY = "~/beingcricket/videos/";

    public FileSystemFileRepository() {
        File f = new File(UPLOAD_DIRECTORY);
        f.mkdirs();
    }

    @Override
    public void storeFile(StorableFile file, InputStream inputStream) throws IOException {
        write(file.getFileName() + file.getFileExtension(), inputStream);
    }

    @Override
    public T retrieveFile() {
        return null;
    }

    @Override
    public List<T> retrieveFileList() {
        return null;
    }

    @Override
    public void setFileLocations(List storableFiles) {
        storableFiles.forEach(file -> ((T)file).setSourceLocation("http://localhost:8081/" + UPLOAD_DIRECTORY));
    }

    @Override
    public AbstractResource getInStream(Video video) throws FileNotFoundException {
        return new FileSystemResource(new File(UPLOAD_DIRECTORY+video.getVideoFile().getFileName() + video.getVideoFile().getFileExtension()));
    }

    private void write(String fileName, InputStream in) throws IOException {
        File file = new File(UPLOAD_DIRECTORY + fileName);
        Files.copy(in, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
        IOUtils.closeQuietly(in);
    }
}
