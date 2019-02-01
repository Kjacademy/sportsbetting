package com.epam.training.sportbetting.service;

import com.epam.training.sportbetting.domain.Player;
import com.epam.training.sportbetting.domain.SportEvent;
import com.epam.training.sportbetting.domain.Wager;

import java.util.List;

public interface SportsBettingService {
    void savePlayer(Player player);

    Player findPlayer();

    List<SportEvent> findAllSportEvents();

    void saveWager(Wager wager);

    List<Wager> findAllWager();

    void calculateResults();
}
