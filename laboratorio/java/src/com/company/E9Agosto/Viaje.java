package com.company.E9Agosto;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;

public class Viaje extends ArrayList<Viaje> {

    private float precio = 0.f;
    private String fecha;
    private String hora;

    public Viaje(){}

    public Viaje(float precio, String fecha, String hora){
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public String toString(){
        String concatenadoos = "";
            concatenadoos = "Hora: " + this.getHora() + "|" + " Fecha: " + this.getFecha() + "|" + " Precio: " + this.getPrecio();

        return concatenadoos;
    }
}
