package com.redspark.beingcricket.beingcricketserver.controller;

import com.redspark.beingcricket.beingcricketserver.domain.Session;
import com.redspark.beingcricket.beingcricketserver.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SessionController {

    @Autowired
    private SessionService sessionService;


    @CrossOrigin(origins = "*")
    @GetMapping("/getallsessions")
    public ResponseEntity getSessions() {
        List<Session> sessions = sessionService.getSessions();
        return new ResponseEntity(sessions, HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/cancelSession")
    public ResponseEntity cancelSession(@RequestParam("id") String sessionId) {
        sessionService.deleteSession(sessionId);
        return new ResponseEntity(sessionService.getSessions(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/addsession", consumes = "application/json")
    public ResponseEntity createSession(@RequestBody Session session) {
        sessionService.createSession(session);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/booksession", consumes = "application/json")
    public ResponseEntity bookSession(@RequestBody Session session) {
        sessionService.bookSession(session.getId().toString());
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @PostMapping(value = "/updatesession", consumes = "application/json")
    public ResponseEntity updateSession(@RequestBody Session session) {
        sessionService.update(session);
        return new ResponseEntity(HttpStatus.OK);
    }
}
