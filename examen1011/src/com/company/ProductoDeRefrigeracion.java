package com.company;

public class ProductoDeRefrigeracion extends ProductoElectrico{

    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, String codigo, Float costo, Integer cantDiasDeGarantia, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(Integer cantDiasDeGarantia, float litrosDeCapacidad) {
        super(cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(String nombre, String origen, String codigo, Float costo, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(String nombre, String origen, String codigo, Float costo, Integer cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
    }

    public ProductoDeRefrigeracion(Integer cantDiasDeGarantia) {
        super(cantDiasDeGarantia);
    }

    public ProductoDeRefrigeracion(String nombre, String origen, String codigo, Float costo) {
        super(nombre, origen, codigo, costo);
    }

    public ProductoDeRefrigeracion() {
    }

    public float getLitrosDeCapacidad() {
        return litrosDeCapacidad;
    }

    public void setLitrosDeCapacidad(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    @Override
    public float calcularPrecioFinal() {
        return  this.getCosto() + this.calcularGananciaObtenida() + ProductoElectrico.getRecargoPorEnvio();
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
        return "Producto Electrico";
    }
}
