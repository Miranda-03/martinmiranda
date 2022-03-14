package com.company.EjercicioPractica;

import java.util.HashMap;
import java.util.Map;

public class Empleado {

    private  String nombre;
    private  String apellido;
    private  int telefono;
    private  int edad;
    private String[] dias = new String[5];

    private HashMap<Fecha, String> asistencias;

    public Empleado() {
        asistencias = new HashMap<>();
    }

    public Empleado(String nombre, String apellido, int telefono, int edad, String[] dias, HashMap<Fecha, String> asistencias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.dias = dias;
        this.asistencias = asistencias;
    }


    public void ingresoDeEmpleado(Fecha fecha, String hora){

        asistencias.put(fecha, hora);

    }



    public int porcentajeAsistencias(String mes, int dias){

        int  diasAsistidos = 0;

        for(Map.Entry<Fecha, String> entry : asistencias.entrySet()){
            if(entry.getKey().getMes().equals(mes)){
                diasAsistidos++;
            }
        }

        return 0;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public HashMap<Fecha, String> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(HashMap<Fecha, String> asistencias) {
        this.asistencias = asistencias;
    }


}
