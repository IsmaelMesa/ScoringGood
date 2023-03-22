package com.vehicleRentingPersona.vehicleRentingPersona.models;

public class Profesion {


    private int profesion_id;
    private String descripcion;

    public Profesion(int profesion_id, String descripcion) {
        this.profesion_id = profesion_id;
        this.descripcion = descripcion;
    }

    public int getProfesion_id() {
        return profesion_id;
    }

    public void setProfesion_id(int profesion_id) {
        this.profesion_id = profesion_id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
