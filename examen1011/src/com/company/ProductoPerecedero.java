package com.company;

public class ProductoPerecedero extends ProductoAlimenticio{

    private float temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, String codigo, Float costo, Integer cantDiasParaVencerse, float temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(Integer cantDiasParaVencerse, float temperaturaMinimaDeFrio) {
        super(cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(String nombre, String origen, String codigo, Float costo, float temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(float temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(String nombre, String origen, String codigo, Float costo, Integer cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
    }

    public ProductoPerecedero(Integer cantDiasParaVencerse) {
        super(cantDiasParaVencerse);
    }

    public ProductoPerecedero(String nombre, String origen, String codigo, Float costo) {
        super(nombre, origen, codigo, costo);
    }

    public ProductoPerecedero() {
    }

    public float getTemperaturaMinimaDeFrio() {
        return temperaturaMinimaDeFrio;
    }

    public void setTemperaturaMinimaDeFrio(float temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    @Override
    public float calcularPrecioFinal() {
        return  this.getCosto() + this.calcularGananciaObtenida() + ProductoAlimenticio.getDESCUENTO();
    }

    @Override
    public float calcularGananciaObtenida() {
        if(this.getCantDiasParaVencerse() <= 90){
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
