package com.company.Examen;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sistema {

    private ArrayList<Cantante> cantantes;

    public Sistema(){
        this.cantantes = new ArrayList<>();
    }

    public Sistema(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }

    public ArrayList<Cantante> getcantantes() {
        return cantantes;
    }

    public void setcantantes(ArrayList<Cantante> cantantes) {
        this.cantantes = cantantes;
    }



    public void calcularPrecio(Cantante cantante){
        float precioTotal;

        HashMap<Album, Float> albumes = cantante.getalbumes();

       int cantidad = cantante.cantidadCanciones();

            for(Map.Entry<Album, Float> entry : albumes.entrySet()){
                ArrayList<Cancion> canciones = entry.getKey().getCanciones();
                for (int y = 0; y < canciones.size(); y++){
                    canciones.get(y).setPrecioTotal(cantidad);
                }
            }
    }

    public void mostrarCantante3(){
        for(Cantante cantante : this.cantantes){
            if(cantante.getalbumes().size() >= 3){
                System.out.println(cantante.getNombre() + "\n");
                HashMap<Album, Float> albumes = cantante.getalbumes();
                for(Map.Entry<Album, Float> entry : albumes.entrySet()){
                    ArrayList<Cancion> canciones = entry.getKey().getCanciones();
                    for (int y = 0; y < canciones.size(); y++){
                        System.out.println(canciones.get(y).getNombreCancion() + " :" + canciones.get(y).getPrecioTotal());
                    }
                }
            }

        }
    }

    public void mostrarTodosCantantes(){
        for(Cantante cantante : this.cantantes){
            System.out.println(cantante.getNombre() + "\n");
            HashMap<Album, Float> albumes = cantante.getalbumes();
            for(Map.Entry<Album, Float> entry : albumes.entrySet()){
                ArrayList<Cancion> canciones = entry.getKey().getCanciones();
                for (int y = 0; y < canciones.size(); y++){
                    System.out.println(canciones.get(y).getNombreCancion() + " :" + canciones.get(y).getPrecioTotal());
                }
            }
        }
    }
}
