package com.redspark.beingcricket.beingcricketserver.service.impl;

import com.redspark.beingcricket.beingcricketserver.domain.PlayerInnings;
import com.redspark.beingcricket.beingcricketserver.service.StatisticsService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StatisticsServiceImpl implements StatisticsService {

    @Override
    public void addPlayerInnings(PlayerInnings innings) {
    }

    @Override
    public List<PlayerInnings> getInningsForPlayer(String playerName) {
        return null;
    }
}
