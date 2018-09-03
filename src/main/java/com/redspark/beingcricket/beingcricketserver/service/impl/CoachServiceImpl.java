package com.redspark.beingcricket.beingcricketserver.service.impl;

import com.redspark.beingcricket.beingcricketserver.data.CoachRepository;
import com.redspark.beingcricket.beingcricketserver.domain.Coach;
import com.redspark.beingcricket.beingcricketserver.service.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class CoachServiceImpl implements CoachService {

    @Autowired
    private CoachRepository coachRepository;

    @Override
    public void addNewCoach(Coach coach) {
        coachRepository.save(coach);
    }

    @Override
    public List<Coach> getCoaches() {
        return StreamSupport.stream(coachRepository.findAll().spliterator(), false).collect(Collectors.toList());
    }
}
