package com.company;

public abstract class ProductoAlimenticio extends ProductoDeSuper{
    private Integer cantDiasParaVencerse;
    static float DESCUENTO;

    public ProductoAlimenticio(String nombre, String origen, String codigo, Float costo, Integer cantDiasParaVencerse) {
        super(nombre, origen, codigo, costo);
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public ProductoAlimenticio(Integer cantDiasParaVencerse) {
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public ProductoAlimenticio(String nombre, String origen, String codigo, Float costo) {
        super(nombre, origen, codigo, costo);
    }

    public ProductoAlimenticio() {
    }

    public Integer getCantDiasParaVencerse() {
        return cantDiasParaVencerse;
    }

    public void setCantDiasParaVencerse(Integer cantDiasParaVencerse) {
        this.cantDiasParaVencerse = cantDiasParaVencerse;
    }

    public static float getDESCUENTO() {
        return DESCUENTO;
    }

    public static void setDESCUENTO(float DESCUENTO) {
        ProductoAlimenticio.DESCUENTO = DESCUENTO;
    }
}
