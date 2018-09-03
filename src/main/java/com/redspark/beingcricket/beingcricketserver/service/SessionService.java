package com.redspark.beingcricket.beingcricketserver.service;

import com.redspark.beingcricket.beingcricketserver.domain.Session;

import java.util.List;

public interface SessionService {

    void createSession(Session session);

    List<Session> getSessions();

    void bookSession(String sessionId);

    void deleteSession(String sessionId);

    void update(Session session);
}
