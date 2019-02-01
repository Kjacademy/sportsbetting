package com.epam.training.sportbetting.domain;

import java.util.List;

public class Bet {
    private String description;
    private BetType type;
    private SportEvent event;
    private List<Outcome> outcomes;
}
