package com.epam.training.sportbetting.domain;

import java.time.LocalDateTime;

public class FootballSportEvent extends SportEvent {

    public FootballSportEvent(String title, LocalDateTime startDate, LocalDateTime endDate) {
        super(title, startDate, endDate, result);
    }
}
