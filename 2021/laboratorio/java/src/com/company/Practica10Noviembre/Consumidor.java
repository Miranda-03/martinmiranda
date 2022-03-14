package com.company.Practica10Noviembre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Consumidor {

    private String nombre;
    private String apellido;
    private Integer DNI;
    private HashMap<Bebida, Integer> cantidadBebidas;

    public Consumidor(String nombre, String apellido, Integer DNI, HashMap<Bebida, Integer> cantidadBebidas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cantidadBebidas = cantidadBebidas;
    }

    public  Consumidor(){
        cantidadBebidas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public HashMap<Bebida, Integer> getCantidadBebidas() {
        return cantidadBebidas;
    }

    public void setCantidadBebidas(HashMap<Bebida, Integer> cantidadBebidas) {
        this.cantidadBebidas = cantidadBebidas;
    }

    public float hidratacion(){
        float alcoholicas = 0, neutras = 0, azucaradas = 0 ;
        for(Map.Entry<Bebida, Integer> entry : cantidadBebidas.entrySet()){
            if(entry.getKey().getClass().equals("class com.company.Practica10Noviembre.Alcoholicas")){
                Alcoholicas alcohol = (Alcoholicas) entry.getKey();
                alcoholicas = alcoholicas + alcohol.coeficienteTotal();
            }
            else if(entry.getKey().getClass().equals("class com.company.Practica10Noviembre.Azucaradas")){
                Azucaradas azucar = (Azucaradas) entry.getKey();
                azucaradas = azucaradas + azucar.coeficienteTotal();
            }
            else{
                Bebida neutra = entry.getKey();
                neutras = neutras + neutra.coeficienteTotal();
            }
        }

        return alcoholicas + neutras + azucaradas;
    }

    public ArrayList<String> nombreBebidas(){
        ArrayList<String> nombres = new ArrayList<>();
        for(Map.Entry<Bebida, Integer> entry : cantidadBebidas.entrySet()){
            nombres.add(entry.getKey().getNombre());
        }
        return nombres;
    }
}
