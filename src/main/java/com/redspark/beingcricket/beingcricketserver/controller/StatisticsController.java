package com.redspark.beingcricket.beingcricketserver.controller;

import com.redspark.beingcricket.beingcricketserver.domain.PlayerInnings;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatisticsController {

    public ResponseEntity addInnings(PlayerInnings innings) {
        return new ResponseEntity(HttpStatus.OK);
    }
}
