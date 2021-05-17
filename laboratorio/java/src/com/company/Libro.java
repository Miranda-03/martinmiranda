package com.company;

public class Libro {
    String nombre;
    float precio;
    String nombreEditorial;


    public Libro(String nombre, float precio, String editorial){
        this.nombre = nombre;
        this.precio = precio;
        nombreEditorial = editorial;
    }

    public String getNombre(){
        return nombre;
    }

    public float getPrecio(){
        return precio;
    }

    public String getNombreEditorial(){
        return nombreEditorial;
    }
}
