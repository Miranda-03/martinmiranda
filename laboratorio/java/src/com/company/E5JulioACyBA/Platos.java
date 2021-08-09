package com.company.E5JulioACyBA;

public class Platos {
    String nombrePlato;
    float precio = 0;

    public Platos(){}

    public Platos(String nombrePlato, float precio){
        this.nombrePlato = nombrePlato;
        this.precio = precio;
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
