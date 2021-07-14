package com.company.E5Julio;

public class Alumno extends Persona{
    protected String division;
    protected boolean tipo = false;

    public Alumno(){
        super();
    }

    public Alumno(String division, String nombre, String apellido){
        super(nombre, apellido);
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public boolean getTipo(){
        return tipo;
    }
}
