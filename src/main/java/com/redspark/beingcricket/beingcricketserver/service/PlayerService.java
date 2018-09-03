package com.redspark.beingcricket.beingcricketserver.service;

import com.redspark.beingcricket.beingcricketserver.domain.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getPlayersForCoach(String name);

    void savePlayerProfile(String firstName, String surname, Player playerProfile);

    void createPlayerProfile(String firstName, String surname, Player playerProfile);

    Player getPlayerProfile(String surname, String firstName);
}
