package com.epam.training.sportbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OutcomeOdd {
    private Outcome outcome;
    private BigDecimal value;
    private LocalDateTime validFrom;
    private LocalDateTime validUntil;
}
