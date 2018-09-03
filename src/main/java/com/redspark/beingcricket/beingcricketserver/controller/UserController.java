package com.redspark.beingcricket.beingcricketserver.controller;

import com.redspark.beingcricket.beingcricketserver.domain.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserController {

    public ResponseEntity register(Player playerProfile) {
        return new ResponseEntity(HttpStatus.OK);
    }

}
