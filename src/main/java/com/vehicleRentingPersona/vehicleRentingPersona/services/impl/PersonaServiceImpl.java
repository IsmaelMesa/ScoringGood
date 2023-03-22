package com.vehicleRentingPersona.vehicleRentingPersona.services.impl;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequiredMissingFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.WrongLengthFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import com.vehicleRentingPersona.vehicleRentingPersona.models.RentaAnual;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.DireccionMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.PersonaMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.ProfesionMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.RentaAnualMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private DireccionMapper direccionMapper;
    private PersonaMapper  personaMapper;
    private ProfesionMapper profesionMapper;
    private RentaAnualMapper rentaAnualMapper;
    public PersonaServiceImpl(PersonaMapper personaMapper, DireccionMapper direccionMapper, ProfesionMapper profesionMapper, RentaAnualMapper rentaAnualMapper) {
        this.personaMapper = personaMapper;
        this.direccionMapper = direccionMapper;
        this.profesionMapper = profesionMapper;
        this.rentaAnualMapper = rentaAnualMapper;
    }

    @Transactional
    @Override
    public Persona addPersona(Persona persona) throws RequiredMissingFieldException, WrongLengthFieldException{
        this.validatePersonData(persona);
        persona = this.addPersonaDireccion(persona);
        this.personaMapper.insertPersona(persona);
        return persona;
    }

    private Persona addPersonaDireccion(Persona persona) {
        //System.out.println("LLamado a servicio Persona.addPersona");
        this.direccionMapper.insertDireccion(persona.getDireccion_domicilio());
        if(persona.getDireccionDomicilioSameAsNotificacion()){
            persona.setDireccion_notificacion(persona.getDireccion_domicilio());
        }else{
            this.direccionMapper.insertDireccion(persona.getDireccion_notificacion());
        }
        return persona;
    }
    private void validatePersonData(Persona persona) throws RequiredMissingFieldException, WrongLengthFieldException {
        this.validateNombre(persona);
    }
    private void validateNombre(Persona persona) throws RequiredMissingFieldException, WrongLengthFieldException {
        if(persona.getNombre()==null || persona.getNombre().isEmpty()){
            throw new RequiredMissingFieldException();
        }
        if(persona.getNombre().length() > 50){
            throw new WrongLengthFieldException();
        }
    }
}
