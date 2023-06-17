package com.codecool.fengshuimatchcalculator.service;

import java.time.LocalDate;

public class SignCalculatorImpl implements SignCalculator {

    @Override
    public String calculateZodiacSign(String birthDate) {

        // Parse the birthdate string into a LocalDate object
        LocalDate date = LocalDate.parse(birthDate);

        // Get the year of birth from the LocalDate object
        int birthYear = date.getYear();

        // Calculate the remainder when dividing the birth year by 12
        int remainder = birthYear % 12;

        // Define an array of Chinese zodiac signs
        String[] zodiacSigns = {
                "Monkey", "Rooster", "Dog", "Pig", "Rat", "Ox",
                "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Sheep"
        };

        // Return the zodiac sign based on the remainder index
        return zodiacSigns[remainder].toUpperCase();
    }
}
