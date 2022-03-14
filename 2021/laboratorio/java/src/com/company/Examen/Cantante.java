package com.company.Examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Cantante extends Persona{
    String nombreArtistico;
    private HashMap<Album, Float> albumes;

    public Cantante() {
        super();
        albumes = new HashMap<>();
    }

    public Cantante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        albumes = new HashMap<>();
    }

    public Cantante(String nombre, String apellido, int edad,String nombreArtistico, HashMap<Album, Float> albumes) {
        super(nombre, apellido, edad);
        this.nombreArtistico = nombreArtistico;
        this.albumes = albumes;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public HashMap<Album, Float> getalbumes() {
        return albumes;
    }

    public void setalbumes(HashMap<Album, Float> albumes) {
        this.albumes = albumes;
    }


    public int cantidadCanciones(){
        int cantidad = albumes.size();

        return cantidad;
    }

    @Override
    public String toString(){
        String datos = this.getNombre() + "\n"  + this.getApellido() + "\n" + this.getEdad() + "\n" + this.getNombreArtistico();
        String nombreAlbum = "";
        String cancionesNombre = "";
        for(Map.Entry<Album, Float> entry : albumes.entrySet()){
            nombreAlbum = "Album :" + entry.getKey().getNombreAlbum() + "\n";
            ArrayList<Cancion> canciones = entry.getKey().getCanciones();
            for (int y = 0; y < canciones.size(); y++){
                cancionesNombre = cancionesNombre + canciones.get(y).getNombreCancion() + "\n";
            }
        }

        return datos + nombreAlbum + cancionesNombre;
    }

}


