package com.company.Ej15Septiembre;

import java.util.HashSet;

public class Cancion {
    private String tituloCancion;
    private HashSet<Artista> artistas;
    private HashSet<Autor> autores;

    public Cancion(String tituloCancion, HashSet<Artista> artistas, HashSet<Autor> autores) {
        this.tituloCancion = tituloCancion;
        this.artistas = artistas;
        this.autores = autores;
    }

    public Cancion() {
        this.artistas=new HashSet<>();
    this.autores= new HashSet<>();
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public HashSet<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(HashSet<Artista> artistas) {
        this.artistas = artistas;
    }

    public HashSet<Autor> getAutores() {
        return autores;
    }

    public void setAutores(HashSet<Autor> autores) {
        this.autores = autores;
    }
}
