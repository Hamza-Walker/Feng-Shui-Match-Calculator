package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Match;

import java.time.LocalDate;

public interface MatchCalculator {
    Match calculate(LocalDate birthdate1, LocalDate birthdate2);
}
