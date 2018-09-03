package com.redspark.beingcricket.beingcricketserver.controller;

import com.redspark.beingcricket.beingcricketserver.domain.Coach;
import com.redspark.beingcricket.beingcricketserver.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoachController {

    @Autowired
    private CoachService coachService;

    @CrossOrigin(origins = "*")
    @PostMapping("/addcoach")
    public ResponseEntity<?> newCoach(@RequestBody Coach coach) {
        coachService.addNewCoach(coach);
        return new ResponseEntity(HttpStatus.OK);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/getallcoaches")
    public ResponseEntity getCoaches() {
        List<Coach> coaches = coachService.getCoaches();
        return new ResponseEntity(coaches, HttpStatus.OK);
    }
}
