package com.company.E13Septiembre;

public class Pasajero {

    private String nombre;
    private String apellido;
    private TarjetaEquis tarjeta;

    public Pasajero(){}

    public Pasajero(String nombre, String apellido, TarjetaEquis tarjeta){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tarjeta;
    }

    public TarjetaEquis getTarjeta() {
        return tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTarjeta(TarjetaEquis tarjeta) {
        this.tarjeta = tarjeta;
    }
}
