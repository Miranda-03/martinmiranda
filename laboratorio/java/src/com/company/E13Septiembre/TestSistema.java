package com.company.E13Septiembre;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestSistema {
    @Test
    public void pasajerosQueSeHanSubidoAlgunaVez(){
        HashSet<Pasajero> historialDePasajeros = new HashSet<>();
        Pasajero p = new Pasajero();
        Pasajero p2 = new Pasajero();
        Pasajero p3 = new Pasajero();
        historialDePasajeros.add(p);
        historialDePasajeros.add(p2);
        historialDePasajeros.add(p3);
        assertTrue(historialDePasajeros.contains(p));
        assertTrue(historialDePasajeros.contains(p2));
        assertTrue(historialDePasajeros.contains(p3));
    }

    @Test
    public void pasajerosConUltimoMontoAbonado(){
        HashSet<Pasajero> historialDePasajeros = new HashSet<>();
        HashMap<com.company.E13Septiembre.Pasajero, Float> pasajerosUltimoMonto = new HashMap<>();
        Pasajero p = new Pasajero();
        Pasajero p2 = new Pasajero();
        historialDePasajeros.add(p);
        historialDePasajeros.add(p2);
        Viaje v = new Viaje();
        Viaje d = new Viaje(10.0f,"a","b");
        ArrayList<Viaje> viajes = new ArrayList<>();
        viajes.add(v);
        viajes.add(d);
        TarjetaEquis t = new TarjetaEquis(10.0f,-100.0f,120,viajes);
        Pasajero p3 = new Pasajero("a","b",t);
        historialDePasajeros.add(p3);
        float ultimoMonto = 0.f;

        for (Pasajero pasajeroAux : historialDePasajeros){
            ultimoMonto = 20;
            pasajerosUltimoMonto.put(pasajeroAux, ultimoMonto);
        }

        for(Pasajero pAux : historialDePasajeros){
            assertTrue(pasajerosUltimoMonto.containsKey(pAux));
        }



    }

    @Test
    public void 
}
