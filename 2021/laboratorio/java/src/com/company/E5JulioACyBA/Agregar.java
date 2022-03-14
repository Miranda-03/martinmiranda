package com.company.E5JulioACyBA;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Agregar {
    private static String nombre;
    private static final Scanner ingresarDatos = new Scanner(System.in);
    private static String apellido;
    private static float porcentajeDescuento;
    private static float precio;

    public static void AgregarProfesor( ArrayList<Profesor> profesores){
        System.out.print("nombre: ");
        nombre = ingresarDatos.nextLine();
        System.out.print("apellido: ");
        apellido = ingresarDatos.nextLine();
        System.out.print("porcentaje de descuento");
        porcentajeDescuento = ingresarDatos.nextFloat();
        Profesor nuevoProfesor = new Profesor(porcentajeDescuento, nombre, apellido);
        profesores.add(nuevoProfesor);
        ingresarDatos.nextLine();
    }

    public static void AgregarAlumno(ArrayList<Alumno> alumnos){
        System.out.print("nombre: ");
        nombre = ingresarDatos.nextLine();
        System.out.print("apellido: ");
        apellido = ingresarDatos.nextLine();
        System.out.print("division: ");
        String division = ingresarDatos.nextLine();
        Alumno nuevoAlumno = new Alumno(division, apellido, nombre);
        alumnos.add(nuevoAlumno);
    }

    public static void AgregarPlato(ArrayList<Platos> listaPlatos){
        System.out.print("nombre: ");
        nombre = ingresarDatos.nextLine();
        System.out.print("precio: ");
        precio = ingresarDatos.nextFloat();
        Platos nuevoPlato = new Platos(nombre, precio);
        listaPlatos.add(nuevoPlato);
        ingresarDatos.nextLine();
    }

    public static void AgregarPedido(ArrayList<Pedidos> listaPedidos, ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores, ArrayList<Platos> listaPlatos){
        Profesor ingresarProfesor = new Profesor();
        Alumno ingresarAlumno = new Alumno();
        Platos platoPedido = new Platos();
        System.out.print("nombre: ");
        nombre = ingresarDatos.nextLine();
        System.out.print("fecha: ");
        String fechaCreacion = ingresarDatos.nextLine();
        System.out.print("nombre plato");
        String nombrePlatoPedido = ingresarDatos.nextLine();
        for(Platos platoAux : listaPlatos){
            if(platoAux.getNombrePlato().equals(nombrePlatoPedido)){
                platoPedido = listaPlatos.get(listaPlatos.indexOf(platoAux));
            }
        }
        System.out.println("1 - ingresar profesor \n 2 - ingresar alumno");
        int indicarTipoPersona = ingresarDatos.nextInt();
        ingresarDatos.nextLine();
        String nombrePersona;
        if(indicarTipoPersona == 1){
            System.out.print("nombre profesor");
            nombrePersona = ingresarDatos.nextLine();
            for(Profesor profeAux : profesores){
                if(profeAux.getNombre().equals(nombrePersona)){
                    ingresarProfesor = profesores.get(profesores.indexOf(profeAux));
                }
            }
        }
        else if(indicarTipoPersona == 2){
            System.out.print("nombre alumno");
            nombrePersona = ingresarDatos.nextLine();
            for(Alumno alumnoAux : alumnos){
                if(alumnoAux.getNombre().equals(nombrePersona)){
                    ingresarAlumno = alumnos.get(alumnos.indexOf(alumnoAux));
                }
            }
        }

        System.out.print("hora de entrega: ");
        String horaEntrega = ingresarDatos.nextLine();
        System.out.print("Ingresar nombre del pedido: ");
        nombre = ingresarDatos.nextLine();
        if(indicarTipoPersona == 1){
            Pedidos nuevoPedido = new Pedidos(nombre, ingresarProfesor, platoPedido.getNombrePlato(), fechaCreacion, horaEntrega, false);
            listaPedidos.add(nuevoPedido);
        }
        else if(indicarTipoPersona == 2){

            Pedidos nuevoPedido = new Pedidos(nombre,ingresarAlumno, platoPedido.getNombrePlato(), fechaCreacion, horaEntrega, false);
            listaPedidos.add(nuevoPedido);
        }
    }
}
