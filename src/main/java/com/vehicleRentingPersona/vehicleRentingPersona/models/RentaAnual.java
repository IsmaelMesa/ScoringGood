package com.vehicleRentingPersona.vehicleRentingPersona.models;

import java.util.Date;

public class RentaAnual {

    private int renta_id;
    private Persona persona_id;
    private Profesion profesion_id;
    private int anio;

    private int importe;
    private Boolean is_cuenta_propia;
    private String iae;
    private String cif_empleador;
    private Date fecha_inicio_empleo;

    public RentaAnual(int renta_id, Persona personaId, Profesion profesionId, int anio, int importe, Boolean is_cuenta_propia, String iae, String cif_empleador, Date fecha_inicio_empleo) {
        this.renta_id = renta_id;
        persona_id = personaId;
        profesion_id = profesionId;
        this.anio = anio;
        this.importe = importe;
        this.is_cuenta_propia = is_cuenta_propia;
        this.iae = iae;
        this.cif_empleador = cif_empleador;
        this.fecha_inicio_empleo = fecha_inicio_empleo;
    }

    public int getRenta_id() {
        return renta_id;
    }

    public void setRenta_id(int renta_id) {
        this.renta_id = renta_id;
    }

    public Persona getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(Persona persona_id) {
        this.persona_id = persona_id;
    }

    public Profesion getProfesion_id() {
        return profesion_id;
    }

    public void setProfesion_id(Profesion profesion_id) {
        this.profesion_id = profesion_id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Boolean getIs_cuenta_propia() {
        return is_cuenta_propia;
    }

    public void setIs_cuenta_propia(Boolean is_cuenta_propia) {
        this.is_cuenta_propia = is_cuenta_propia;
    }

    public String getIae() {
        return iae;
    }

    public void setIae(String iae) {
        this.iae = iae;
    }

    public String getCif_empleador() {
        return cif_empleador;
    }

    public void setCif_empleador(String cif_empleador) {
        this.cif_empleador = cif_empleador;
    }

    public Date getFecha_inicio_empleo() {
        return fecha_inicio_empleo;
    }

    public void setFecha_inicio_empleo(Date fecha_inicio_empleo) {
        this.fecha_inicio_empleo = fecha_inicio_empleo;
    }
}
