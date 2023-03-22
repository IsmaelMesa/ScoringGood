package com.vehicleRentingPersona.vehicleRentingPersona.services.impl;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequiredMissingFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.WrongLengthFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import com.vehicleRentingPersona.vehicleRentingPersona.models.RentaAnual;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.DireccionMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.PersonaMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.ProfesionMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.RentaAnualMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.services.RentaAnualService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentaAnualServiceImpl implements RentaAnualService {


    private RentaAnualMapper rentaAnualMapper;

    public RentaAnualServiceImpl(RentaAnualMapper rentaAnualMapper) {
        this.rentaAnualMapper = rentaAnualMapper;
    }

    @Transactional
    @Override
    public RentaAnual addRentaAnual(RentaAnual rentaAnual) throws RequiredMissingFieldException, WrongLengthFieldException {
        //persona = this.addPersona(persona);
        //rentaAnual = this.addRentaAnualPersona(rentaAnual);
        //rentaAnual = this.addRentaAnualProfesion(rentaAnual);
        this.rentaAnualMapper.insertRentaAnual(rentaAnual);
        return rentaAnual;
    }


/*    private void validateProfesionId(RentaAnual rentaAnual){

    }*/
    //private RentaAnual addRentaAnualPersona(RentaAnual rentaAnual){
    //    this.personaMapper.insertPersona(rentaAnual.getPersona_id());
    //    return rentaAnual;
    //}

/*    private RentaAnual addRentaAnualProfesion(RentaAnual rentaAnual){
        this.profesionMapper.insertProfesion(rentaAnual.getProfesion_id());
        return rentaAnual;
    }*/


}
