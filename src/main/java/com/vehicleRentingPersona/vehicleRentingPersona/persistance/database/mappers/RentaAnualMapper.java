package com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers;

import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequestApiValidationException;
import com.vehicleRentingPersona.vehicleRentingPersona.excpetions.RequiredMissingFieldException;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Direccion;
import com.vehicleRentingPersona.vehicleRentingPersona.models.Persona;
import com.vehicleRentingPersona.vehicleRentingPersona.models.RentaAnual;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface RentaAnualMapper {

    @Insert("INSERT INTO RENTA_ANUAL (PERSONA_ID, PROFESION_ID, ANIO, IS_CUENTA_PROPIA, IAE, CIF_EMPLEADOR, FECHA_INICIO_EMPLEO, IMPORTE) " +
            "VALUES (#{persona_id.persona_id}, #{profesion_id.profesion_id}, #{anio}, #{is_cuenta_propia}, #{iae}, #{cif_empleador, jdbcType=CHAR}, " +
            "#{fecha_inicio_empleo, jdbcType=DATE}, #{importe})")
    @Options(useGeneratedKeys = true, keyProperty = "renta_id", keyColumn="RENTA_ID") //que te traiga de la base de datos el autoincremental, lo coge de la DIRECCION_ID y le hace un set a direccionid
    void insertRentaAnual(RentaAnual rentaAnual);

}
