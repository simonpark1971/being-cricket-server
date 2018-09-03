package com.redspark.beingcricket.beingcricketserver.data;

import com.redspark.beingcricket.beingcricketserver.domain.Session;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface SessionRepository extends CrudRepository<Session, String> {

    Session findById(UUID uuid);
}
