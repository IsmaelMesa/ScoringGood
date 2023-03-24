package com.vehicleRentingPersona.vehicleRentingPersona.services.impl;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.ProfesionNotFoundException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.RentaAnual;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.ProfesionMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers.RentaAnualMapper;
import com.vehicleRentingPersona.vehicleRentingPersona.services.RentaAnualService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RentaAnualServiceImpl implements RentaAnualService {


    private RentaAnualMapper rentaAnualMapper;
    private ProfesionMapper profesionMapper;

    public RentaAnualServiceImpl(RentaAnualMapper rentaAnualMapper, ProfesionMapper profesionMapper) {
        this.rentaAnualMapper = rentaAnualMapper;
        this.profesionMapper = profesionMapper;
    }
    @Override
    @Transactional
    public RentaAnual addRentaAnual(RentaAnual rentaAnual) throws ProfesionNotFoundException {
        //persona = this.addPersona(persona);
        this.validateProfesion(rentaAnual.getProfesion_id().getProfesion_id());
        //rentaAnual = this.addRentaAnualProfesion(rentaAnual);
        this.rentaAnualMapper.insertRentaAnual(rentaAnual);
        return rentaAnual;
    }

    private void validateProfesion(int profesionId) throws ProfesionNotFoundException {
        if (profesionMapper.existeProfesion(profesionId) == 0) {
            throw new ProfesionNotFoundException();
        }
    }
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

