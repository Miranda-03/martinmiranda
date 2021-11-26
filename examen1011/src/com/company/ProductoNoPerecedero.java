package com.company;

import java.util.HashSet;

public class ProductoNoPerecedero extends ProductoAlimenticio{

    private float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasParaVencerse, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(Integer cantDiasParaVencerse, float mgDeSodio) {
        super(cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(String nombre, String origen, Integer codigo, Float costo, float mgDeSodio) {
        super(nombre, origen, codigo, costo);
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(float mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
    }

    public ProductoNoPerecedero(Integer cantDiasParaVencerse) {
        super(cantDiasParaVencerse);
    }

    public ProductoNoPerecedero(String nombre, String origen, Integer codigo, Float costo) {
        super(nombre, origen, codigo, costo);
    }

    public ProductoNoPerecedero() {
    }

    public float getMgDeSodio() {
        return mgDeSodio;
    }

    public void setMgDeSodio(float mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }

    @Override
    public float calcularPrecioFinal() {
        Float precio = this.getCosto() + this.calcularGananciaObtenida();
        return precio - (( precio * ProductoAlimenticio.getDESCUENTO()) / 100);
    }

    @Override
    public float calcularGananciaObtenida() {
        if(getCantDiasParaVencerse() <= 90){
            return 10.f;
        }
        else if(this.getCantDiasParaVencerse() >= 90){
            return 25.f;
        }
        return 0;
    }

    @Override
    public String tipoDeProducto() {
        return "Producto Alimenticio no perecedero";
    }

    public HashSet<String> aptosParaHipertensos(SistemaSupermercado sistema){
        HashSet<String> productosAptos = new HashSet<>();
        HashSet<ProductoNoPerecedero> productos = sistema.obtenerProductosNoPerecederos();
        for (ProductoNoPerecedero producto : productos) {
            if(producto.nivelSodioApto()){
                productosAptos.add(producto.getNombre());
            }
        }
        return productosAptos;
    }

    public boolean nivelSodioApto(){
        return this.getMgDeSodio() <= 1500;
    }



}
