package com.vehicleRentingPersona.vehicleRentingPersona.models;

import java.util.Date;

public class Persona {

    private int persona_id;
    private String nombre;
    private String apellido1;

    private String apellido2;
    private Direccion direccion_domicilio;

    private Boolean direccionDomicilioSameAsNotificacion = true;
    private Direccion direccion_notificacion;
    private String nif;
    private Date fecha_nacimiento;

    private String nacionalidad;
    private int scoring;
    private Date fecha_scoring;
    //private List<Telefono> telefonos;


    public Persona(int persona_id, String nombre, String apellido1, String apellido2, Direccion direccion_domicilio, Boolean direccionDomicilioSameAsNotificacion, Direccion direccion_notificacion, String nif, Date fecha_nacimiento, String nacionalidad, int scoring, Date fecha_scoring) {
        this.persona_id = persona_id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion_domicilio = direccion_domicilio;
        this.direccionDomicilioSameAsNotificacion = direccionDomicilioSameAsNotificacion;
        this.direccion_notificacion = direccion_notificacion;
        this.nif = nif;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.scoring = scoring;
        this.fecha_scoring = fecha_scoring;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public Direccion getDireccion_domicilio() {
        return direccion_domicilio;
    }

    public void setDireccion_domicilio(Direccion direccion_domicilio) {
        this.direccion_domicilio = direccion_domicilio;
    }

    public Boolean getDireccionDomicilioSameAsNotificacion() {
        return direccionDomicilioSameAsNotificacion;
    }

    public void setDireccionDomicilioSameAsNotificacion(Boolean direccionDomicilioSameAsNotificacion) {
        this.direccionDomicilioSameAsNotificacion = direccionDomicilioSameAsNotificacion;
    }

    public Direccion getDireccion_notificacion() {
        return direccion_notificacion;
    }

    public void setDireccion_notificacion(Direccion direccion_notificacion) {
        this.direccion_notificacion = direccion_notificacion;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    public Date getFecha_scoring() {
        return fecha_scoring;
    }

    public void setFecha_scoring(Date fecha_scoring) {
        this.fecha_scoring = fecha_scoring;
    }
}
