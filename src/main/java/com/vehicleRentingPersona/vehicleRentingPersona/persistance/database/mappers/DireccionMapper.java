package com.vehicleRentingPersona.vehicleRentingPersona.persistance.database.mappers;

import com.vehicleRentingPersona.vehicleRentingPersona.models.Direccion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface DireccionMapper {

    //los valores de insert los coge del insertDireccion que se le pasa como parametro una direccion y lo coge de ahi
    @Insert("INSERT INTO DIRECCION (TIPO_VIA_ID, NOMBRE_CALLE, NUM, PISO, PUERTA, ESCALERA, OTRO_DATO, COD_POSTAL, MUNICIPIO, COD_PROVINCIA) VALUES (#{tipo_via_id}, #{nombre_calle}, #{num}, #{piso, jdbcType=CHAR}, null, null, null, #{cod_postal, jdbcType=CHAR}, #{municipio}, #{cod_provincia})")
    @Options(useGeneratedKeys = true, keyProperty = "direccionId", keyColumn="DIRECCION_ID") //que te traiga de la base de datos el autoincremental, lo coge de la DIRECCION_ID y le hace un set a direccionid
    void insertDireccion(Direccion direccion);
}
