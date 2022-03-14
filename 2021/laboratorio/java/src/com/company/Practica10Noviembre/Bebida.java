package com.company.Practica10Noviembre;

public class Bebida {

    //Bebida = bebidas neutras

    private String nombre;
    private float coeficientePositivo;
    private float coeficienteNegativo;

    public Bebida(String nombre, float coeficientePositivo, float coeficienteNegativo) {
        this.nombre = nombre;
        this.coeficientePositivo = coeficientePositivo;
        this.coeficienteNegativo = coeficienteNegativo;
    }

    public Bebida() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCoeficientePositivo() {
        return coeficientePositivo;
    }

    public void setCoeficientePositivo(float coeficientePositivo) {
        this.coeficientePositivo = coeficientePositivo;
    }

    public float getCoeficienteNegativo() {
        return coeficienteNegativo;
    }

    public void setCoeficienteNegativo(float coeficienteNegativo) {
        this.coeficienteNegativo = coeficienteNegativo;
    }

    public float coeficienteTotal(){
        return this.getCoeficientePositivo() - this.coeficienteNegativo;
    }

}
