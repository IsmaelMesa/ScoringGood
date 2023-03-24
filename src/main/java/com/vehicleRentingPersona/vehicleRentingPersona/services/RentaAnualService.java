package com.vehicleRentingPersona.vehicleRentingPersona.services;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.ProfesionNotFoundException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequestApiValidationException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequiredMissingFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import com.vehicleRentingPersona.vehicleRentingPersona.models.RentaAnual;

public interface RentaAnualService {

    RentaAnual addRentaAnual(RentaAnual rentaAnual) throws ProfesionNotFoundException;



}
