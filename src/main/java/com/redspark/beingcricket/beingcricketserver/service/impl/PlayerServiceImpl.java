package com.redspark.beingcricket.beingcricketserver.service.impl;

import com.redspark.beingcricket.beingcricketserver.domain.Player;
import com.redspark.beingcricket.beingcricketserver.service.PlayerService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PlayerServiceImpl implements PlayerService {

    @Override
    public List<Player> getPlayersForCoach(String name) {
        return null;
    }

    @Override
    public void savePlayerProfile(String firstName, String surname, Player playerProfile) {
    }

    @Override
    public void createPlayerProfile(String firstName, String surname, Player playerProfile) {
    }

    @Override
    public Player getPlayerProfile(String surname, String firstName) {
        return null;
    }
}
