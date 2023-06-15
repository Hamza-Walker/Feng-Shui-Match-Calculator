package com.codecool.fengshuimatchcalculator;

import com.codecool.fengshuimatchcalculator.service.PersonaProvider;
import com.codecool.fengshuimatchcalculator.service.PersonaProviderImpl;

class Program
{
    static void main(String[] args)
    {
        PersonaProvider personaProvider = new PersonaProviderImpl();
    }
}
