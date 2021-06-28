package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Banco {
    String nombre;
    ArrayList<Cliente> listaCliente = new ArrayList<>();

    public Banco(){}

    public HashSet<Integer> cbusDeClientesVisitantes(){

        HashSet<Integer> listaCBU = new HashSet<>();

        for(Cliente aux: listaCliente){
            listaCBU.add(aux.getCbu());
        }

        return listaCBU;
    }

    public void imprimirCBU(HashSet<Integer> listadoCBU){
        for(Integer aux : listadoCBU){
            System.out.println(aux);
        }
    }

    public HashMap<Integer, Integer> cantidadDeVisitasPorCliente(HashSet<Integer> listadoCBU){

        Integer cantVisitas = 0;

        HashMap<Integer, Integer> visitas = new HashMap<>();

        for(Integer aux : listadoCBU){
            if(visitas.containsKey(aux) == false){
                visitas.put(aux, 0);
            }
            else{
                cantVisitas =  visitas.get(aux);
                cantVisitas = cantVisitas + 1;
                visitas.put(aux, cantVisitas);
            }
        }

        return visitas;
    }

    public void mostrarVisitas(HashMap<Integer, Integer> visitas){
        for(Map.Entry<Integer, Integer> aux : visitas.entrySet()){
            Integer clave = aux.getKey();
            Integer valor = aux.getValue();
            System.out.println("clave: " + clave + " - valor : " + valor );
        }
    }
}
