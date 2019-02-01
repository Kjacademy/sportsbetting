package com.epam.training.sportbetting.ui;

import com.epam.training.sportbetting.domain.OutcomeOdd;
import com.epam.training.sportbetting.domain.Player;
import com.epam.training.sportbetting.domain.SportEvent;
import com.epam.training.sportbetting.domain.Wager;

import java.io.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class ConsoleIOService implements IO {
    private final PrintStream printStream;
    private final BufferedReader reader;

    public ConsoleIOService(PrintStream printStream, InputStream inputStream) {
        this.printStream = printStream;
        this.reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    @Override
    public Player readPlayerData() {
        return null;
    }

    @Override
    public void printWelcomeMessage(Player player) {
        printStream.println("What is your name");
        readData().ifPresent(player::setName);

        printStream.println("How much money do you have (more than 0)?");

        printStream.println("What is your currency? (HUF, EUR, or USD)");
    }

    private BigDecimal readCheckedData(Predicate<BigDecimal> condition) {


    }

    private Optional<String> readData() {
        Optional<String> result;
        try {
            result = Optional.of(reader.readLine());
        } catch (IOException ie) {
            ie.printStackTrace();
            return Optional.empty();
        }

        return result;
    }

    @Override
    public void printBalance(Player player) {

    }

    @Override
    public void printOutcomeOdds(List<SportEvent> sportEvents) {

    }

    @Override
    public OutcomeOdd selectOutcomeOdd(List<SportEvent> sportEvents) {
        return null;
    }

    @Override
    public BigDecimal readWagerAmount() {
        return null;
    }

    @Override
    public void printWagerSaved(Wager wager) {

    }

    @Override
    public void printNotEnoughBalance(Player player) {

    }

    @Override
    public void printResults(Player player, List<Wager> wagers) {

    }
}
