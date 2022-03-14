package com.company.E9Agosto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {

    private HashSet<Pasajero> pasajerosPresentes = new HashSet<>();
    private HashSet<Pasajero> historialDePasajeros = new HashSet<>();
    private String linea;

    public static void main(String[] args) {
        Viaje v = new Viaje(23.f, "jkhadf", "aojd");
        Viaje c = new Viaje(23.f, "jkhadf", "aojd");
        Viaje a = new Viaje(50.f, "jkfff", "aobbbbb");
        ArrayList<Viaje> viajes = new ArrayList<>();
        viajes.add(v);
        viajes.add(c);
        viajes.add(a);

        for (Viaje viajeAux: viajes){
            System.out.println(viajeAux.toString());
        }

        TarjetaEquis x = new TarjetaEquis(23.f, 20.f, 23.f, viajes);

        System.out.println(x.toString());

        Pasajero t = new Pasajero("Facu", "Aricoma", x);

        System.out.println(t.toString());

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