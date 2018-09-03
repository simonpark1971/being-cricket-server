package com.redspark.beingcricket.beingcricketserver.controller;

import com.redspark.beingcricket.beingcricketserver.domain.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {

    public ResponseEntity getPlayerProfile(String playerName) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity getPlayersForCoach(String coachName) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity getPlayersInnings(String playerName) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity profileUpdate(Player playerProfile) {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
}
