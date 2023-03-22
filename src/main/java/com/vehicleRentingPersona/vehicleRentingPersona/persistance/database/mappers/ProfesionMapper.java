package com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers;

import com.vehicleRentingPersona.vehicleRentingPersona.models.Profesion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ProfesionMapper {


    @Select("SELECT PERSONA_ID FROM PROFESION")
    void existeProfesion(int id);

}
