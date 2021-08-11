package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Alumno extends Persona{
    private String curso;
    private HashMap<String, ArrayList<Float>> notasPorMateria;

    public Alumno(){}

    public Alumno(String curso, HashMap<String, ArrayList<Float>> notasPorMateria){
        this.curso = curso;
        this.notasPorMateria = notasPorMateria;
    }

    public void AgregarNota(String materia, float nota){
        ArrayList<Float> notas =  notasPorMateria.get(materia);
        notas.add(nota);
        notasPorMateria.replace(materia, notas);
    }

    public void mayorNota(){
        float mayorNota = 0;
        for(Map.Entry<String, ArrayList<Float>> aux : notasPorMateria.entrySet()){
            ArrayList<Float> notasAux = aux.getValue();
            mayorNota = notasAux.get(0);
            String materiaAux = aux.getKey();
            for(float numAux : notasAux){
                if(numAux > mayorNota){
                    mayorNota = numAux;
                }
            }
            System.out.println("La nota mas alta de la materia " + materiaAux + " es: " + mayorNota);
        }
    }

    public void menorNota(){
        float menorNota = 0;
        for(Map.Entry<String, ArrayList<Float>> aux : notasPorMateria.entrySet()){
            ArrayList<Float> notasAux = aux.getValue();
            menorNota = notasAux.get(0);
            String materiaAux = aux.getKey();
            for(float numAux : notasAux){
                if(numAux < menorNota){
                    menorNota = numAux;
                }
            }
            System.out.println("La nota mas baja de la materia " + materiaAux + " es: " + menorNota);
        }
    }

    public void promedio(){
        float promedio = 0;
        int cantDeNotas = 0;
        for(Map.Entry<String, ArrayList<Float>> aux : notasPorMateria.entrySet()){
            ArrayList<Float> notasAux = aux.getValue();
            String materiaAux = aux.getKey();
            for(float numAux : notasAux){
                promedio = promedio + numAux;
                cantDeNotas++;
            }
            promedio = promedio/cantDeNotas;
            System.out.println("El promedio de la materia " + materiaAux + " es: " + promedio);
        }
    }

    public void agregarMateria(String nombreDeMateria){
        ArrayList<Float> notas = new ArrayList<>();
        notasPorMateria.put(nombreDeMateria, notas);
    }

}
