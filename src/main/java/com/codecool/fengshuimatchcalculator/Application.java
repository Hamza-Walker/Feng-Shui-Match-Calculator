package com.codecool.fengshuimatchcalculator;

import com.codecool.fengshuimatchcalculator.service.*;
import com.codecool.fengshuimatchcalculator.ui.FengShuiMatchCalculatorUi;

class Program
{
    public static void main(String[] args)
    {
        // Create necessary components
        SignCalculatorImpl signCalculator = new SignCalculatorImpl();
        PersonaProviderImpl personaProvider = new PersonaProviderImpl();
        MatchCalculatorImpl matchCalculator = new MatchCalculatorImpl(personaProvider, signCalculator);
        FengShuiMatchCalculatorUi ui = new FengShuiMatchCalculatorUi(matchCalculator);

        // Initiate the matching algorithm
        ui.run();
    }
}
