package com.epam.training.sportbetting.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class SportEvent {
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private List<Bet> bets;
    private Result result;

    public SportEvent(String title, LocalDateTime startDate, LocalDateTime endDate, Result result) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.result = result;
        this.bets = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Result getResult() {
        return result;
    }

    public void addBet(Bet bet) {
        bets.add(bet);
    }
}
