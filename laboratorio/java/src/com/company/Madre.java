package com.company;
import java.util.HashSet;

public class Madre extends Persona {
    private String empresa;
    private HashSet<Hijo> hijos = new HashSet<>();

    public Madre(){
        super();
    }

    public Madre(String empresa, HashSet<Hijo> hijos, String nombre, int edad, int dni, String direccion, int telefono){
        super(nombre, edad, dni, direccion, telefono);
        this.empresa = empresa;
        this.hijos = hijos;
    }


    public String deMayorEdad(){
        String hijosMayores = "Son mayores de edad: ";
        for(Hijo aux : hijos){
            if(aux.esMayorDeEdad()){
                hijosMayores = hijosMayores + aux.getNombre() + ", ";
            }
        }
        return hijosMayores;
    }
}
