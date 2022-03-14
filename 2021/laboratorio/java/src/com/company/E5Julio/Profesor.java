package com.company.E5Julio;

public class Profesor extends Persona{
    float porcentajeDescuento = 0;
    boolean tipo = true;

    public Profesor(){
        super();
    }

    public Profesor(float porcentajeDescuento, String nombre, String apellido){
        super(nombre, apellido);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public float getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(float porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isTipo(){
        return tipo;
    }
}
