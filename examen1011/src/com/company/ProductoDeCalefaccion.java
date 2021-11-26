package com.company;

public class ProductoDeCalefaccion extends ProductoElectrico{

    private float wattsDePotenciaMax;

    public ProductoDeCalefaccion(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasDeGarantia, float wattsDePotenciaMax) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.wattsDePotenciaMax = wattsDePotenciaMax;
    }

    public ProductoDeCalefaccion(Integer cantDiasDeGarantia, float wattsDePotenciaMax) {
        super(cantDiasDeGarantia);
        this.wattsDePotenciaMax = wattsDePotenciaMax;
    }

    public ProductoDeCalefaccion(String nombre, String origen, Integer codigo, Float costo, float wattsDePotenciaMax) {
        super(nombre, origen, codigo, costo);
        this.wattsDePotenciaMax = wattsDePotenciaMax;
    }

    public ProductoDeCalefaccion(float wattsDePotenciaMax) {
        this.wattsDePotenciaMax = wattsDePotenciaMax;
    }

    public ProductoDeCalefaccion(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
    }

    public ProductoDeCalefaccion(Integer cantDiasDeGarantia) {
        super(cantDiasDeGarantia);
    }

    public ProductoDeCalefaccion(String nombre, String origen, Integer codigo, Float costo) {
        super(nombre, origen, codigo, costo);
    }

    public ProductoDeCalefaccion() {
    }

    public float getWattsDePotenciaMax() {
        return wattsDePotenciaMax;
    }

    public void setWattsDePotenciaMax(float wattsDePotenciaMax) {
        this.wattsDePotenciaMax = wattsDePotenciaMax;
    }

    @Override
    public float calcularPrecioFinal() {
        float precio = this.getCosto() + this.calcularGananciaObtenida();
        return  precio + ((precio * ProductoElectrico.getRecargoPorEnvio())/100);
    }

    @Override
    public float calcularGananciaObtenida() {
        if(this.getCantDiasDeGarantia() == 365){
            return 45.f;
        }
        else if(this.getCantDiasDeGarantia() <= 60){
            return 15.f;
        }
        return 0;
    }

    @Override
    public String tipoDeProducto() {
       return "Producto Electrico de calefaccion";
    }
}
