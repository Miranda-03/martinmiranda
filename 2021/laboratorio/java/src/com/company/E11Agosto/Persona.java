package com.company.E11Agosto;

import java.util.Objects;

public class Persona {

    private String nombre;
    private int edad;
    private int dni;
    private String direccion;
    private int telefono;

    public Persona(){}

    public Persona(String nombre){
        this.nombre = nombre;
        edad= 35;
        dni= 234543;
        direccion = "Rivadavia 2314";
        telefono = 33430203;
    }

    public Persona(String nombre, int edad, int dni, String direccion, int telefono){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //metodos
    //gettersdez


    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getDni() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    //setters

    public void setNombre(String nuevoNombre){
        nombre= nuevoNombre;
    }

    public void  setEdad(int nuevaEdad){
        edad= nuevaEdad;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //metodos

    public boolean esMayorDeEdad(){
        return edad > 18;
    }

    public boolean sonLaMismaPersona(Persona p2){
        if(this.nombre == p2.nombre && this.edad == p2.edad && this.dni == p2.dni && Objects.equals(this.direccion, p2.direccion) && this.telefono == p2.telefono){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean tienenLaMismaEdad(Persona p2){
        return edad == p2.edad;
    }
}

