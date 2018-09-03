package com.redspark.beingcricket.beingcricketserver.service.impl;

import com.redspark.beingcricket.beingcricketserver.data.SessionRepository;
import com.redspark.beingcricket.beingcricketserver.domain.Session;
import com.redspark.beingcricket.beingcricketserver.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class SessionServiceImpl implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public void createSession(Session session) {
        sessionRepository.save(session);
    }

    @Override
    public List<Session> getSessions() {
        return StreamSupport.stream(sessionRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public void bookSession(String sessionId) {
        Session session = sessionRepository.findById(UUID.fromString(sessionId));
        session.setSessionStatus(Session.SessionStatus.BOOKED);
        sessionRepository.save(session);
    }

    @Override
    public void deleteSession(String sessionId) {
        Session session = sessionRepository.findById(UUID.fromString(sessionId));
        sessionRepository.delete(session);
    }

    @Override
    public void update(Session session) {
        sessionRepository.save(session);
    }
}
