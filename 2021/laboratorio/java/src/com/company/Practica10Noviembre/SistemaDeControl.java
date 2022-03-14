package com.company.Practica10Noviembre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaDeControl implements Sistema{

    private HashSet<Consumidor> consumidores;

    public SistemaDeControl(HashSet<Consumidor> consumidores) {
        this.consumidores = consumidores;
    }

    public SistemaDeControl() {
    }

    @Override
    public Consumidor personaConMejorCoeficienteDeHidratacion() {
        float mejorCoeficiente = 0, Coeficiente;
        Consumidor consumidor = null;
        for (Consumidor consumidore : consumidores) {
            Coeficiente = consumidore.hidratacion();
            if(Coeficiente > mejorCoeficiente){
                mejorCoeficiente = Coeficiente;
                consumidor = consumidore;
            }
        }
        return consumidor;
    }

    @Override
    public Consumidor personaConPeorCoeficienteDeHidratacion() {
        Consumidor consumidor = personaConMejorCoeficienteDeHidratacion();
        float peorCoeficiente = consumidor.hidratacion(), Coeficiente ;
        Consumidor consumidorPeor = null;
        for (Consumidor consumidore : consumidores) {
            Coeficiente = consumidore.hidratacion();
            if(Coeficiente < peorCoeficiente){
                peorCoeficiente = Coeficiente;
                consumidorPeor = consumidore;
            }
        }
        return consumidorPeor;
    }

    @Override
    public HashSet<String> nombresDeBebidasConsumidas() {
        HashSet<String> bebidas = new HashSet<>();
        ArrayList<String> nombres = null;
        for (Consumidor consumidore : consumidores) {
            nombres = consumidore.nombreBebidas();
            for (String nombre : nombres) {
                bebidas.add(nombre);
            }
        }
        return bebidas;
    }

    public HashMap<String, Integer> nombresTodasBebidas(){
        HashMap<String, Integer> nombresBebidas = new HashMap<>();
        ArrayList<String> nombres = null;
        for (Consumidor consumidore : consumidores) {
            nombres = consumidore.nombreBebidas();
            for (String nombre : nombres) {
                if(!nombresBebidas.containsKey(nombre)){
                    nombresBebidas.put(nombre, 1);
                }
                else{
                    int cant = nombresBebidas.get(nombre);
                    nombresBebidas.put(nombre, cant+1);
                }
            }
        }
        
        return nombresBebidas;
    }

    @Override
    public String nombreDeBebidaMasConsumida() {
        HashMap<String, Integer> nombresBebidas = this.nombresTodasBebidas();
        String bebidaMasConsumida = null;
        int cantTotal = 0;
        for(Map.Entry<String, Integer> entry : nombresBebidas.entrySet()){
            if(entry.getValue() > cantTotal){
                cantTotal = entry.getValue();
                bebidaMasConsumida = entry.getKey();
            }
        }
        return bebidaMasConsumida;
    }
}
