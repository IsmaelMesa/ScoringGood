package com.vehicleRentingPersona.vehicleRentingPersona.services.impl;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequestApiValidationException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequiredMissingFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.WrongLengthFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.DireccionMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.PersonaMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
    private DireccionMapper direccionMapper;
    private PersonaMapper  personaMapper;
    public PersonaServiceImpl(PersonaMapper personaMapper, DireccionMapper direccionMapper) {
        this.personaMapper = personaMapper;
        this.direccionMapper = direccionMapper;
    }
    @Override
    @Transactional
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
