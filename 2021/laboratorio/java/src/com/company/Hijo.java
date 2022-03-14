package com.company;

public class Hijo extends Persona{
    private String escuela;
    private String juego;

    public Hijo(){
        super();
    }

    public Hijo(String escuela, String juego, String nombre, int edad, int dni, String direccion, int telefono){
        super(nombre, edad, dni, direccion, telefono);
        this.escuela = escuela;
        this.juego = juego;
    }
}
