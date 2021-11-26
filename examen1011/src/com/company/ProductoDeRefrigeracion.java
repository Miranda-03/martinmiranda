package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class ProductoDeRefrigeracion extends ProductoElectrico{

    private float litrosDeCapacidad;

    public ProductoDeRefrigeracion(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasDeGarantia, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(Integer cantDiasDeGarantia, float litrosDeCapacidad) {
        super(cantDiasDeGarantia);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(String nombre, String origen, Integer codigo, Float costo, float litrosDeCapacidad) {
        super(nombre, origen, codigo, costo);
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(float litrosDeCapacidad) {
        this.litrosDeCapacidad = litrosDeCapacidad;
    }

    public ProductoDeRefrigeracion(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo, cantDiasDeGarantia);
    }

    public ProductoDeRefrigeracion(Integer cantDiasDeGarantia) {
        super(cantDiasDeGarantia);
    }

    public ProductoDeRefrigeracion(String nombre, String origen, Integer codigo, Float costo) {
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
        return "Producto Electrico de refrigeracion";
    }

    public HashMap<Integer,Float> productosRefrigerantesConGranCapacidad(SistemaSupermercado sistema){
        HashMap<Integer, Float> productosGrandes = new HashMap<>();
        HashSet<ProductoDeRefrigeracion> productos = sistema.obtenerProductosRefrigeracion();
        for (ProductoDeRefrigeracion producto : productos) {
            if(producto.esGrande()){
                productosGrandes.put(producto.getCodigo(), producto.getLitrosDeCapacidad());
            }
        }
        return productosGrandes;
    }

    public boolean esGrande(){
        return this.getLitrosDeCapacidad() >= 300 && super.getOrigen().equals("Argentina");
    }

}
