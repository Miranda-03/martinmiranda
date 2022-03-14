package com.company.Examen29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cine {
    private String nombre;
    private String direccion;
    private HashSet<Sala> salas;

    public Cine(String nombre, String direccion, HashSet<Sala> salas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = salas;
    }

    public Cine() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }

    public HashSet<Integer> visitantes(){
        HashSet<Integer> idVisitantes = new HashSet<>();
        ArrayList<Integer> idPorSala;
        for(Sala sala : salas){
            idPorSala = sala.idVisitantesAlgunaVez();
            for(int y = 0; y < idPorSala.size(); y++){
                idVisitantes.add(idPorSala.get(y));
            }
        }
        return  idVisitantes;
    }

    public Integer cantidadTotalDeVisitantes(){
        Integer contador = 0;
        for(Sala sala : salas){
            contador = contador + sala.cantidadVisitantesTotal();
        }
        return contador;
    }

    public HashMap<Integer, Integer> visitantesConCantidadDeVisitas(){
        HashMap<Integer, Integer> cantVisitanteId = new HashMap<>();
        ArrayList<Visitante> visitante;
        for(Sala sala : salas){
            visitante = sala.getVisitantesAlgunaVez();
            for(int y = 0; y < visitante.size(); y++){
                cantVisitanteId.put(visitante.get(y).getId(),sala.cantVecesVisitasPorPersona(visitante.get(y)));
            }
        }
        return cantVisitanteId;
    }
    

    public static void informeActual(Sala sala){
        System.out.println(sala.toString());
    }
}

/*
1. reutilizaria la clase Sala, pondria otro atributo que sea un bool: true
   si es 2d y false si es 3d, en caso de que tenga mas atributos crearia
   otra clase que herede a Sala.

2. Pondria otro atributo en Visitante indicando la edad para saber despues
   con un metodo si es mayor o no de edad.

3. Ninguna, comparo el ultimo visitante de todas las salas y luego comparo
   la fecha entre ellos, teniendo en cuenta que el atributo sea del tipo
   correcto (Date).
 */
