package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Match;
import com.codecool.fengshuimatchcalculator.model.Persona;
import com.codecool.fengshuimatchcalculator.model.Sign;

import java.time.LocalDate;
import java.util.Arrays;

public class MatchCalculatorImpl implements MatchCalculator {
    private PersonaProvider personaProvider;
    private SignCalculator signCalculator;

    public MatchCalculatorImpl(PersonaProvider personaProvider, SignCalculator signCalculator) {
        this.personaProvider = personaProvider;
        this.signCalculator = signCalculator;
    }

    @Override
    public Match calculate(LocalDate birthdate1, LocalDate birthdate2) {
        // Get the Chinese zodiac signs based on the birth dates
        Sign sign1 = Sign.valueOf(signCalculator.calculateZodiacSign(birthdate1.toString()));
        Sign sign2 = Sign.valueOf(signCalculator.calculateZodiacSign(birthdate2.toString()));

        // Retrieve the Persona objects from the PersonaProvider
        Persona persona1 = personaProvider.findPersona(sign1);
        Persona persona2 = personaProvider.findPersona(sign2);

        // Calculate the match outcome based on the Persona objects
        if (Arrays.asList(persona1.goodMatches()).contains(sign2) &&
                Arrays.asList(persona2.goodMatches()).contains(sign1)) {
            return Match.Good;
        } else if (Arrays.asList(persona1.badMatches()).contains(sign2) ||
                Arrays.asList(persona2.badMatches()).contains(sign1)) {
            return Match.Bad;
        } else {
            return Match.Average;
        }

    }

}
