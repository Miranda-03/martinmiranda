package com.company.Examen;

import java.util.ArrayList;

public class Album {
    String nombreAlbum;
    private ArrayList<Cancion> canciones;

    public Album(){
        canciones = new ArrayList<>();
    }

    public Album(String nombreAlbum, ArrayList<Cancion> canciones) {
        this.nombreAlbum = nombreAlbum;
        this.canciones = canciones;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int numeroCanciones(){
        return  canciones.size();
    }
}
