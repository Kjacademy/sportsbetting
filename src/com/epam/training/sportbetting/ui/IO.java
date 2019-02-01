package com.epam.training.sportbetting.ui;

import com.epam.training.sportbetting.domain.OutcomeOdd;
import com.epam.training.sportbetting.domain.Player;
import com.epam.training.sportbetting.domain.SportEvent;
import com.epam.training.sportbetting.domain.Wager;

import java.math.BigDecimal;
import java.util.List;

public interface IO {
    Player readPlayerData();

    void printWelcomeMessage(Player player);

    void printBalance(Player player);

    void printOutcomeOdds(List<SportEvent> sportEvents);

    OutcomeOdd selectOutcomeOdd(List<SportEvent> sportEvents);

    BigDecimal readWagerAmount();

    void printWagerSaved(Wager wager);

    void printNotEnoughBalance(Player player);

    void printResults(Player player, List<Wager> wagers);
}
