package com.company.E27Septiembre;

public class Producto {
    private Integer codigo;
    private String nombre;
    private int stock;
    private float precio;
    private static float descuento = 30;

    public Producto(){}

    public Producto(Integer codigo, String nombre, int stock, float precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static float getDescuento() {
        return descuento;
    }

    public static void setDescuento(float descuento) {
        Producto.descuento = descuento;
    }

    public float PrecioDescuento(){
        return (this.precio * descuento)/100;
    }

    public static void imprimirInformacion(Producto producto){
        System.out.println(producto.getCodigo() + "\n" + producto.getNombre() +"\n" + producto.getStock() + "\n" + producto.getPrecio());
    }


}
