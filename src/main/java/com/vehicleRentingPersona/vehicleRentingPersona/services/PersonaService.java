package com.vehicleRentingPersona.vehicleRentingPersona.services;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequestApiValidationException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequiredMissingFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;

public interface PersonaService {


    Persona addPersona(Persona persona) throws RequestApiValidationException, RequiredMissingFieldException;

}
