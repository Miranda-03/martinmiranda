package com.company;
import java.util.HashMap;

public class Empresa extends Vivienda{
    private String RazonSocial;
    private static float TARIFA_EMPRESA = 3.f;

    public Empresa(){
        super();
    }

    public Empresa(String RazonSocial, Duenio dueño, String direccion, HashMap<String, Float> consumos){
        super(dueño, direccion, consumos);
        this.RazonSocial = RazonSocial;
    }

    private float calcularConsumoEmpresa(String mes){
        float consumoMes = consumos.get(mes);
        consumoMes = consumoMes * TARIFA_EMPRESA;
        return consumoMes;
    }
}
