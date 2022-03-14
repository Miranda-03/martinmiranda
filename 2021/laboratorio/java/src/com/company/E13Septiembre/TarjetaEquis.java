package com.company.E13Septiembre;

import java.util.ArrayList;

public class TarjetaEquis {

    private float saldo = 0.f;
    private float saldoNegativoMaximo = 0.f;
    private float numeronld = 0;
    private ArrayList<Viaje> viajes;

    public TarjetaEquis(){}

    public  TarjetaEquis(float saldo, float saldoNegativoMaximo, float numeronld, ArrayList<Viaje> viajes){
        this.saldo = saldo;
        this.saldoNegativoMaximo = saldoNegativoMaximo;
        this.numeronld = numeronld;
        this.viajes = viajes;
    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setSaldoNegativoMaximo(float saldoNegativoMaximo) {
        this.saldoNegativoMaximo = saldoNegativoMaximo;
    }

    public void setNumeronld(float numeronld) {
        this.numeronld = numeronld;
    }

    public void setViajes(ArrayList<Viaje> viajes) {
        this.viajes = viajes;
    }

    public void cargarSube(float monto){
        saldo = monto;
    }

    public void realizarViaje(Viaje viaje){
        saldo = saldo - viaje.getPrecio();
        viajes.add(viaje);
    }

    public float ultimoMontoAbonado(){
        Viaje ultimoViaje = viajes.get(viajes.size());
        float ultimoMonto = ultimoViaje.getPrecio();
        return ultimoMonto;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getSaldoNegativoMaximo() {
        return saldoNegativoMaximo;
    }

    public float getNumeronld() {
        return numeronld;
    }

    public ArrayList<Viaje> getViajes() {
        return viajes;
    }
}
