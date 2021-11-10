package com.company.Practica10Noviembre;

public class Azucaradas extends Bebida{

    private float cantAzucar;

    public Azucaradas(String nombre, float cantAzucar) {
        super(nombre, 1, cantAzucar * 10);
        this.cantAzucar = cantAzucar;
    }

    public float getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(float cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    @Override
    public float coeficienteTotal(){
        return this.getCoeficientePositivo() - (this.cantAzucar * 10);
    }
}
