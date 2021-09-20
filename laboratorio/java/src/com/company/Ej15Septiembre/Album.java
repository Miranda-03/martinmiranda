package com.company.Ej15Septiembre;

import java.util.ArrayList;
import java.util.HashSet;

public class Album {
    private String titulo;
    private ArrayList<Cancion> canciones;

    public Album(String titulo, ArrayList<Cancion> canciones) {
        this.titulo = titulo;
        this.canciones = canciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    public HashSet<Artista> artistasParticiparon(){
        HashSet<Artista> artistas= new HashSet<>();
        for (Cancion aux:canciones) {
            artistas.addAll(aux.getArtistas());

        }
        return artistas;
    }
}
