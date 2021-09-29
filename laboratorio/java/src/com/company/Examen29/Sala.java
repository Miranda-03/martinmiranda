package com.company.Examen29;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sala {
    private Integer numeroSala;
    private Integer cantAsientos;
    private ArrayList<Visitante> visitantesAlgunaVez;
    private ArrayList<Visitante> visitantesPresentes;
    public static Integer cantMax = 50;

    public Sala(Integer numeroSala, Integer cantAsientos, ArrayList<Visitante> visitantesAlgunaVez, ArrayList<Visitante> visitantesPresentes) {
        this.numeroSala = numeroSala;
        this.cantAsientos = cantAsientos;
        this.visitantesAlgunaVez = visitantesAlgunaVez;
        this.visitantesPresentes = visitantesPresentes;
    }

    public Sala() {
        visitantesAlgunaVez = new ArrayList<>();
        visitantesPresentes = new ArrayList<>();
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(Integer cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public ArrayList<Visitante> getVisitantesAlgunaVez() {
        return visitantesAlgunaVez;
    }

    public void setVisitantesAlgunaVez(ArrayList<Visitante> visitantesAlgunaVez) {
        this.visitantesAlgunaVez = visitantesAlgunaVez;
    }

    public ArrayList<Visitante> getVisitantesPresentes() {
        return visitantesPresentes;
    }

    public void setVisitantesPresentes(ArrayList<Visitante> visitantesPresentes) {
        this.visitantesPresentes = visitantesPresentes;
    }

    public static Integer getCantMax() {
        return cantMax;
    }

    public static void setCantMax(Integer cantMax) {
        Sala.cantMax = cantMax;
    }

    public HashMap<Integer, Integer> nroDeAsientosConCantidadDePreferencias(){
        HashMap<Integer, Integer> asientoCantidad = new HashMap<>();
        int cantVecesAsiento;
        int numeroAsiento;
        for(int y = 0; y < cantMax; y++){
            for(Visitante visitante : visitantesAlgunaVez){
                numeroAsiento = visitante.getNumeroAsiento();
                if(asientoCantidad.containsKey(numeroAsiento)){
                    cantVecesAsiento = asientoCantidad.get(numeroAsiento);
                    asientoCantidad.put(numeroAsiento, cantVecesAsiento + 1);
                }
                else{
                    asientoCantidad.put(numeroAsiento,1);
                }
            }
        }

        return asientoCantidad;
    }

    public HashMap<Integer, Integer> visitantesConCantidadDeVisitas(){
        HashMap<Integer, Integer> visitasCantidad = new HashMap<>();
        int cantVecesVisito;
        int id;
        for(Visitante visitante : visitantesAlgunaVez){
                id = visitante.getId();
                if(visitasCantidad.containsKey(id)){
                    cantVecesVisito = visitasCantidad.get(id);
                    visitasCantidad.put(id, cantVecesVisito + 1);
                }
                else{
                    visitasCantidad.put(id,1);
                }
        }


        return visitasCantidad;
    }

    public Integer cantidadDeVisitantesPresentes(){
        return this.visitantesPresentes.size();
    }

    public boolean estaLlena(){
        if(cantidadDeVisitantesPresentes() == cantMax){
            return true;
        }
        return false;
    }

    public boolean hayInfiltrados(){
        return cantidadDeVisitantesPresentes() > cantMax;
    }

    public Integer asientosDisponibles(){
        if(!estaLlena()){
            return cantMax - cantidadDeVisitantesPresentes();
        }
        return 0;
    }

    public Integer cantidadVisitantesTotal(){
        return this.visitantesAlgunaVez.size();
    }

    public ArrayList<Integer> idVisitantesAlgunaVez(){
        ArrayList<Integer> ids = new ArrayList<>();
        for(Visitante visitante : visitantesAlgunaVez){
            ids.add(visitante.getId());
        }
        return ids;
    }

    public Integer cantVecesVisitasPorPersona(Visitante visitante){
        Integer idVisitante = visitante.getId();
        Integer contador = 0;
        for(int y = 0; y < visitantesAlgunaVez.size(); y++){
               if(visitantesAlgunaVez.get(y).getId().equals(idVisitante)){
                   contador++;
               }
        }
        return contador;
    }
    @Override
    public String toString(){
        return ("Numero de sala" + "\n" + this.getNumeroSala()
                + "\n" + "cantidad de asientos" + this.getCantAsientos() +"\n"
                + "capacidad maxima permitida" + Sala.getCantMax() + "\n" +
                "cantidad de visitantes presentes" + this.getVisitantesPresentes() +
                "\n" + "cantidad de asientos disponibles" + this.asientosDisponibles());
    }

}
