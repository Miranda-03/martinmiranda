package com.company;

public class ProductoNoPerecedero extends ProductoAlimenticio{

    private float mgDeSodio;

    public ProductoNoPerecedero(String nombre, String origen, String codigo, Float costo, Integer cantDiasParaVencerse, float mgDeSodio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(Integer cantDiasParaVencerse, float mgDeSodio) {
        super(cantDiasParaVencerse);
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(String nombre, String origen, String codigo, Float costo, float mgDeSodio) {
        super(nombre, origen, codigo, costo);
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(float mgDeSodio) {
        this.mgDeSodio = mgDeSodio;
    }

    public ProductoNoPerecedero(String nombre, String origen, String codigo, Float costo, Integer cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
    }

    public ProductoNoPerecedero(Integer cantDiasParaVencerse) {
        super(cantDiasParaVencerse);
    }

    public ProductoNoPerecedero(String nombre, String origen, String codigo, Float costo) {
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
        return  this.getCosto() + this.calcularGananciaObtenida() + ProductoAlimenticio.getDESCUENTO();
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
        return "Producto Alimenticio";
    }
}
