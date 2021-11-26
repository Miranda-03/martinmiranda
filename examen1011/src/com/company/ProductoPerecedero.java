package com.company;

public class ProductoPerecedero extends ProductoAlimenticio{

    private float temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasParaVencerse, float temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(Integer cantDiasParaVencerse, float temperaturaMinimaDeFrio) {
        super(cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(String nombre, String origen, Integer codigo, Float costo, float temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(float temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public ProductoPerecedero(String nombre, String origen, Integer codigo, Float costo, Integer cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
    }

    public ProductoPerecedero(Integer cantDiasParaVencerse) {
        super(cantDiasParaVencerse);
    }

    public ProductoPerecedero(String nombre, String origen, Integer codigo, Float costo) {
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
        Float precio = this.getCosto() + this.calcularGananciaObtenida();
        return precio - (( precio * ProductoAlimenticio.getDESCUENTO()) / 100);
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
