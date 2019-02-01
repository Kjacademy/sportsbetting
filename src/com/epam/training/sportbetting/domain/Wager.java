package com.epam.training.sportbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Wager {
    private OutcomeOdd odd;
    private BigDecimal amount;
    private LocalDateTime timestampCreated;
    private boolean processed;
    private boolean win;
    private Currency currency;
    private Player player;
}
