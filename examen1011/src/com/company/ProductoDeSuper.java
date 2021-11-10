package com.company;

public abstract class ProductoDeSuper implements Producto{
    private String nombre;
    private String origen;
    private String codigo;
    private Float costo;

    public ProductoDeSuper(String nombre, String origen, String codigo, Float costo) {
        this.nombre = nombre;
        this.origen = origen;
        this.codigo = codigo;
        this.costo = costo;
    }

    public ProductoDeSuper() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }
}
