package com.company;

public class Persona {
    public String nombre;
    public int DNI;

    public Persona(){}

    public String getNombre(){
        return nombre;
    }

    public int getDNI(){
        return DNI;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDNI(int DNI){
        this.DNI = DNI;
    }

}
