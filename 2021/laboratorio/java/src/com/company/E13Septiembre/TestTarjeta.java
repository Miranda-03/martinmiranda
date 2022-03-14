package com.company.E13Septiembre;

import com.company.E14Julio.TarjetaEquis;
import com.company.E14Julio.Viaje;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class TestTarjeta {
    @Test
    public  void cargarSube(){
        ArrayList<Viaje> viajes = new ArrayList<>();
        TarjetaEquis t = new TarjetaEquis(10.0f,-100.0f,120,viajes);
        float saldo= t.getSaldo()+ 200;
        t.setSaldo(saldo);
        assertEquals(t.getSaldo(), saldo, 0);
    }

    @Test
    public void ultimoMontoAbonado(){
        Viaje v = new Viaje();
        Viaje d = new Viaje(10.0f,"a","b");
        ArrayList<Viaje> viajes = new ArrayList<>();
        viajes.add(v);
        viajes.add(d);
        TarjetaEquis t = new TarjetaEquis(10.0f,-100.0f,120,viajes);
        float ultimoMonto =  viajes.get(1).getPrecio();
        assertEquals(ultimoMonto, 10,0);
    }
}
