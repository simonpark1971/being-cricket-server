package com.redspark.beingcricket.beingcricketserver.service;

import com.redspark.beingcricket.beingcricketserver.domain.PlayerInnings;

import java.util.List;

public interface StatisticsService {

    void addPlayerInnings(PlayerInnings innings);

    List<PlayerInnings> getInningsForPlayer(String playerName);
}
