package com.redspark.beingcricket.beingcricketserver.service;

import com.redspark.beingcricket.beingcricketserver.domain.Coach;

import java.util.List;

public interface CoachService {
    void addNewCoach(Coach coach);

    List<Coach> getCoaches();
}
