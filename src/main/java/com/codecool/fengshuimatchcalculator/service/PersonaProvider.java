package com.codecool.fengshuimatchcalculator.service;

import com.codecool.fengshuimatchcalculator.model.Persona;
import com.codecool.fengshuimatchcalculator.model.Sign;

public interface PersonaProvider
{
    Persona findPersona(Sign sign);
}
