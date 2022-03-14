package com.company.Ej15Septiembre;

public class Autor extends Persona{
    private String nacionalidad;

    public Autor(String nombre, String apellido, String fechaNac, String nacionalidad) {
        super(nombre, apellido, fechaNac);
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
