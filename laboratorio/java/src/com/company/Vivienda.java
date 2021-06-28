package com.company;
import java.util.HashMap;

public class Vivienda {
    protected String direccion;
    protected Duenio dueño;
    protected HashMap<String, Float> consumos = new HashMap<String, Float>();
    private static float TARIFA_VIVIENDA = 2.f;

    public Vivienda(){}

    public Vivienda(Duenio duenio, String direccion, HashMap<String, Float> consumos){
        this.dueño = duenio;
        this.direccion = direccion;
        this.consumos = consumos;
    }

    protected void AgregarConsumo(String mes, float consumo){
        if(!consumos.containsKey(mes)){
            consumos.put(mes, consumo);
        }
    }

    private float calcularConsumoVivienda(String mes){
        float consumoMes = consumos.get(mes);
        consumoMes = consumoMes * TARIFA_VIVIENDA;
        return consumoMes;
    }


}
