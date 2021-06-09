package com.company;

import java.util.HashMap;

public class Cliente {

    int ID;
    HashMap<String, Integer> cantLibros = new HashMap<>();

    public Cliente(int id, HashMap<String, Integer> cantidad){
        cantLibros = cantidad;
        this.ID = id;
    }

    public int getID(){
        return ID;
    }
    public HashMap getHashMap(){
        return cantLibros;
    }

}