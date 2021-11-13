package com.company;

public abstract class ProductoElectrico extends  ProductoDeSuper{
    private Integer cantDiasDeGarantia;
    static float RECARGO_POR_ENVIO;

    public ProductoElectrico(String nombre, String origen, String codigo, Float costo, Integer cantDiasDeGarantia) {
        super(nombre, origen, codigo, costo);
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public ProductoElectrico(Integer cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public ProductoElectrico(String nombre, String origen, String codigo, Float costo) {
        super(nombre, origen, codigo, costo);
    }

    public ProductoElectrico() {
    }

    public Integer getCantDiasDeGarantia() {
        return cantDiasDeGarantia;
    }

    public void setCantDiasDeGarantia(Integer cantDiasDeGarantia) {
        this.cantDiasDeGarantia = cantDiasDeGarantia;
    }

    public static float getRecargoPorEnvio() {
        return RECARGO_POR_ENVIO;
    }

    public static void setRecargoPorEnvio(float recargoPorEnvio) {
        RECARGO_POR_ENVIO = recargoPorEnvio;
    }
}
