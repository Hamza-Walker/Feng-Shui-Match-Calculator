package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Persona;
import com.codecool.fengshuimatchcalculator.model.Sign;

import java.util.Arrays;
import java.util.List;

public class PersonaProviderImpl implements PersonaProvider {

    private final List<Persona> personas = Arrays.asList(
            new Persona(Sign.RAT, new Sign[]{Sign.DRAGON, Sign.MONKEY, Sign.RAT}, new Sign[]{Sign.HORSE, Sign.GOAT}),
            new Persona(Sign.OX, new Sign[]{Sign.SNAKE, Sign.ROOSTER, Sign.OX}, new Sign[]{Sign.GOAT, Sign.HORSE}),
            new Persona(Sign.TIGER, new Sign[]{Sign.HORSE, Sign.DOG, Sign.TIGER}, new Sign[]{Sign.MONKEY, Sign.SNAKE}),
            new Persona(Sign.RABBIT, new Sign[]{Sign.PIG, Sign.GOAT, Sign.RABBIT}, new Sign[]{Sign.ROOSTER, Sign.DRAGON}),
            new Persona(Sign.DRAGON, new Sign[]{Sign.RAT, Sign.MONKEY, Sign.DRAGON}, new Sign[]{Sign.DOG, Sign.RABBIT}),
            new Persona(Sign.SNAKE, new Sign[]{Sign.OX, Sign.ROOSTER, Sign.SNAKE}, new Sign[]{Sign.PIG, Sign.TIGER}),
            new Persona(Sign.HORSE, new Sign[]{Sign.DOG, Sign.TIGER, Sign.HORSE}, new Sign[]{Sign.RAT, Sign.OX}),
            new Persona(Sign.GOAT, new Sign[]{Sign.RABBIT, Sign.PIG, Sign.GOAT}, new Sign[]{Sign.OX, Sign.RAT}),
            new Persona(Sign.MONKEY, new Sign[]{Sign.DRAGON, Sign.RAT, Sign.MONKEY}, new Sign[]{Sign.TIGER, Sign.PIG}),
            new Persona(Sign.ROOSTER, new Sign[]{Sign.OX, Sign.SNAKE, Sign.ROOSTER}, new Sign[]{Sign.RABBIT, Sign.DOG}),
            new Persona(Sign.DOG, new Sign[]{Sign.TIGER, Sign.HORSE, Sign.DOG}, new Sign[]{Sign.DRAGON, Sign.ROOSTER}),
            new Persona(Sign.PIG, new Sign[]{Sign.RABBIT, Sign.GOAT, Sign.PIG}, new Sign[]{Sign.SNAKE, Sign.MONKEY})
    );

    @Override
    public Persona findPersona(Sign sign) {
        for (Persona zodiacPersona : personas) {
            if (zodiacPersona.Sign() == sign) {
                return zodiacPersona;
            }
        }

        throw new RuntimeException("Sign: " + sign + " not found");
    }
}

