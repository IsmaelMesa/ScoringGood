package com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers;

import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface PersonaMapper {

    @Insert("INSERT INTO PERSONA (NOMBRE, APELLIDO1, APELLIDO2, DIRECCION_DOMICILIO_ID, DIRECCION_NOTIFICACION_ID, NIF, FECHA_NACIMIENTO, NACIONALIDAD) VALUES (#{nombre}, #{apellido1}, #{apellido2}, #{direccion_domicilio.direccionId}, #{direccion_notificacion.direccionId}, #{nif}, #{fecha_nacimiento, jdbcType=DATE}, #{nacionalidad})")
    @Options(useGeneratedKeys = true, keyProperty = "persona_id", keyColumn="PERSONA_ID")
    void insertPersona(Persona persona);
}
