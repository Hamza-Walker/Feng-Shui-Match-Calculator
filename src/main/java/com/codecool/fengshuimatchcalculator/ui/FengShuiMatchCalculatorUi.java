package com.codecool.fengshuimatchcalculator.ui;

import com.codecool.fengshuimatchcalculator.model.Match;
import com.codecool.fengshuimatchcalculator.service.MatchCalculator;
import com.codecool.fengshuimatchcalculator.service.SignCalculatorImpl;

import java.time.LocalDate;
import java.util.Scanner;

public class FengShuiMatchCalculatorUi {

    private final MatchCalculator matchCalculator;
    private  SignCalculatorImpl signCalculator = new SignCalculatorImpl();

    public FengShuiMatchCalculatorUi(MatchCalculator matchCalculator) {
        this.matchCalculator = matchCalculator;
    }

    public void run() {
        displayWelcomeMessage();
        LocalDate birthdate1 = getBirthDate(1);
        LocalDate birthdate2 = getBirthDate(2);

        String zodiacSign1 = signCalculator.calculateZodiacSign(String.valueOf(birthdate1));
        String zodiacSign2 = signCalculator.calculateZodiacSign(String.valueOf(birthdate2));

        System.out.println("Zodiac Sign for Person 1: " + zodiacSign1);
        System.out.println("Zodiac Sign for Person 2: " + zodiacSign2);

        Match match = matchCalculator.calculate(birthdate1, birthdate2);
        System.out.println("Feng shui match result: " + match);
    }

    private void displayWelcomeMessage() {
        System.out.println("*** FENG SHUI MATCH CALCULATOR ***");
    }

    private LocalDate getBirthDate(int person) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter birthdate for Person " + person + " (YYYY-MM-DD): ");
        String input = scanner.nextLine();
        return LocalDate.parse(input);
    }
}
