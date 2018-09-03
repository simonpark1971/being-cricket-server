package com.redspark.beingcricket.beingcricketserver.data;

import com.redspark.beingcricket.beingcricketserver.domain.Video;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

public interface VideoRepository extends CrudRepository<Video, String> {
    List<Video> findByPlayerName(String playerName);
    Video findById(UUID id);
    @Transactional
    void deleteById(UUID id);
}
