package com.company.E6Octubre;

import com.company.AccesoBaseDeDatos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        AccesoBaseDeDatos bd = new AccesoBaseDeDatos("personas", "alumnos");
        bd.conectar("martin", "0103200403");
        ResultSet data  =  bd.obtenerResultado("select * from alumnos");
        while(data.next()){
            System.out.print(data.getInt("id") + " ");
            System.out.print(data.getString("Nombre") + " ");
            System.out.println(data.getInt("Edad"));
        }
    }

}
