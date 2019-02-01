package com.epam.training.sportbetting.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
    private static AtomicInteger accountNumbers = new AtomicInteger();
    private String name;
    private final int accountNumber;
    private BigDecimal balance;
    private LocalDate birth;
    private Currency currency;

    public Player() {
        this.accountNumber = accountNumbers.getAndIncrement();
    }

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public Player setBalance(BigDecimal balance) {
        this.balance = balance;
        return this;
    }

    public Player setBirth(LocalDate birth) {
        this.birth = birth;
        return this;
    }

    public Player setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }
}
