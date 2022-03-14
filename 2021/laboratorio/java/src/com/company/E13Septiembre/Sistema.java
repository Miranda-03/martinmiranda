package com.company.E13Septiembre;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {

    private HashSet<Pasajero> pasajerosPresentes = new HashSet<>();
    private HashSet<Pasajero> historialDePasajeros = new HashSet<>();
    private String linea;

    public static void main(String[] args) {

    }

    public void subePasajero(Pasajero pasajero, Viaje viaje){
        TarjetaEquis tarjetaPasajero = pasajero.getTarjeta();
        if (tarjetaPasajero.getSaldo() >= tarjetaPasajero.getSaldoNegativoMaximo()){
            System.out.print("¡Bienvenido!");
            pasajerosPresentes.add(pasajero);
            historialDePasajeros.add(pasajero);
            pasajero.getTarjeta().realizarViaje(viaje);
        }
        else{
            System.out.print("Saldo insuficiente");
        }
    }

    public void seBajaPasajero(Pasajero pasajero){
        pasajerosPresentes.remove(pasajero);
    }

    public HashSet pasajerosQueSeHanSubidoAlgunaVez(){
        return historialDePasajeros;
    }

    public HashMap pasajerosConUltimoMontoAbonado(){
        HashMap<Pasajero, Float> pasajerosUltimoMonto = new HashMap<>();
        float ultimoMonto = 0.f;

        for (Pasajero pasajeroAux : historialDePasajeros){
            ultimoMonto = pasajeroAux.getTarjeta().ultimoMontoAbonado();
            pasajerosUltimoMonto.put(pasajeroAux, ultimoMonto);
        }

        return pasajerosUltimoMonto;
    }

    public float ultimoMontoAbonadoPorPasajero(float numeroId){
        float monto = 0.f;
        HashMap<Pasajero, Float> pasajerosMonto = pasajerosConUltimoMontoAbonado();

        for (Map.Entry<Pasajero, Float> aux : pasajerosMonto.entrySet()){
            Pasajero pasajero = aux.getKey();
            if (pasajero.getTarjeta().getNumeronld() == numeroId){
                monto = aux.getValue();
                break;
            }
        }

        return monto;
    }

    public boolean seSuperaElSaldoNegativo(){
        boolean superado = false;
        Pasajero ultimoPasajero;
        for (Pasajero aux: pasajerosPresentes){
            ultimoPasajero = aux;
            if (ultimoPasajero.getTarjeta().getSaldo() < ultimoPasajero.getTarjeta().getSaldoNegativoMaximo()){
                superado = true;
            }
            else{
                superado = false;
            }
        }
        return superado;
    }
}