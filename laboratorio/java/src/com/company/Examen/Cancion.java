package com.company.Examen;



public class Cancion {
    private String nombreCancion;
    private static float precio = 500;
    private float precioTotal;

    public Cancion(){}

    public Cancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion, float precioTotal) {
        this.nombreCancion = nombreCancion;
        this.precioTotal = precioTotal;
    }

    public static float getPrecio() {
        return precio;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int cantidadAlbum) {
        Cancion.precio = Cancion.precio + cantidadAlbum;
    }

}
