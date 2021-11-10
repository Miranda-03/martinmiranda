package com.company.Practica10Noviembre;

public class Alcoholicas extends Bebida{

    private float cantAlcohol;

    public Alcoholicas(String nombre, float cantAlcohol) {
        super(nombre, 0, cantAlcohol * 20);
        this.cantAlcohol = cantAlcohol;
    }

    public float getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(float cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    @Override
    public float coeficienteTotal(){
            return this.getCoeficientePositivo() - (this.cantAlcohol * 20);
    }
}
