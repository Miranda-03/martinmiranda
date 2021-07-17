package com.company.E5Julio;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Persona personaPedido;
        String nombrePlatoPedido;
        String fechaCreacion;
        String horaEntrega;
        boolean entregado = false;
        String nombrePersona;

        String nombre;
        String apellido;
        String division;
        float porcentajeDescuento;
        float precio;

        int opcionPrimera;
        int opcionSegunda;
        int opcionTercera;
        int indicarTipoPersona;
        float precioPlatoPedido;

        Scanner ingresarOpcionPrimera = new Scanner(System.in);
        Scanner ingresarOpcionSegunda = new Scanner(System.in);
        Scanner ingresarOpcionTercera = new Scanner(System.in);
        Scanner ingresarDatos = new Scanner(System.in);

        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Pedido> listaPedidos = new ArrayList<>();
        ArrayList<Platos> listaPlatos = new ArrayList<>();


        boolean bloqueoWhile = false;

        Profesor profesorAuxDescuento = new Profesor();

        while(!bloqueoWhile) {

            System.out.println(" 1 - Profesores \n 2 - Alumnos \n 3 - Platos \n 4 - Pedidos \n 5 - Mostrar pedidios \n 6 - Finalizar");
            opcionPrimera = ingresarOpcionPrimera.nextInt();
            if (opcionPrimera == 6) {
                bloqueoWhile = true;
            }
            else if(opcionPrimera == 5){
                for(Pedido pedidoAux : listaPedidos){
                    if((pedidoAux.getPersona()).getClass().getSimpleName() == "Profesor"){
                        Profesor p = (Profesor) pedidoAux.getPersona();
                        float descuentoPlatoPedido = p.getPorcentajeDescuento();
                        precioPlatoPedido = (pedidoAux.getPlato()).getPrecio();
                        precioPlatoPedido = precioPlatoPedido - ((precioPlatoPedido * descuentoPlatoPedido) / 100);
                    }
                }
            }
            else {
                System.out.println(" 1 - Modificar \n 2 - Agregar \n 3 - Eliminar");
                opcionSegunda = ingresarOpcionSegunda.nextInt();

                if (opcionSegunda == 1) {
                    System.out.println("ingrese el nombre: ");
                    nombre = ingresarDatos.nextLine();

                    if (opcionPrimera == 1) {
                        for (Profesor profesorAux : profesores) {
                            if (profesorAux.getNombre().equals(nombre)) {
                                System.out.println(" 1 - Nombre \n 2 - Apellido \n 3 - porcentaje de descuento");
                                opcionTercera = ingresarOpcionTercera.nextInt();
                                if (opcionTercera == 1) {
                                    nombre = ingresarDatos.nextLine();
                                    profesores.get(profesores.indexOf(profesorAux)).setNombre(nombre);
                                } else if (opcionTercera == 2) {
                                    apellido = ingresarDatos.nextLine();
                                    profesores.get(profesores.indexOf(profesorAux)).setApellido(apellido);
                                } else if (opcionTercera == 3) {
                                    porcentajeDescuento = ingresarDatos.nextInt();
                                    profesores.get(profesores.indexOf(profesorAux)).setPorcentajeDescuento(porcentajeDescuento);
                                }
                                break;
                            }
                        }
                    }
                    else if(opcionPrimera == 2){
                        for(Alumno alumnoAux : alumnos){
                            if(alumnoAux.getNombre().equals(nombre)){
                                System.out.println(" 1 - Nombre \n 2 - Apellido \n 3 - division");
                                opcionTercera = ingresarOpcionTercera.nextInt();
                                if (opcionTercera == 1) {
                                    nombre = ingresarDatos.nextLine();
                                    alumnos.get(alumnos.indexOf(alumnoAux)).setNombre(nombre);
                                } else if (opcionTercera == 2) {
                                    apellido = ingresarDatos.nextLine();
                                    alumnos.get(alumnos.indexOf(alumnoAux)).setApellido(apellido);
                                } else if (opcionTercera == 3) {
                                    division = ingresarDatos.nextLine();
                                    alumnos.get(alumnos.indexOf(alumnoAux)).setDivision(division);
                                }
                                break;
                            }
                        }
                    }
                    else if(opcionPrimera == 3){
                        for(Platos platoAux : listaPlatos){
                            if(platoAux.getNombre().equals(nombre)){
                                System.out.println(" 1 - Nombre \n 2 - Precio");
                                opcionTercera = ingresarOpcionTercera.nextInt();
                                if(opcionTercera == 1){
                                    nombre = ingresarDatos.nextLine();
                                    listaPlatos.get(listaPlatos.indexOf(platoAux)).setNombre(nombre);
                                }
                                else if(opcionTercera == 2){
                                    precio = ingresarDatos.nextInt();
                                    listaPlatos.get(listaPlatos.indexOf(platoAux)).setPrecio(precio);
                                }
                            }
                        }
                    }
                    else if(opcionPrimera == 4){
                        for(Pedido pedidoAux : listaPedidos){
                            if(pedidoAux.getNombrePedido().equals(nombre)){
                                System.out.println(" 1 - Nombre \n 2 - Fecha \n 3 - Plato \n 4 - Persona \n 5 - Hora de entrega \n 6 - cambiar a entregado");
                                opcionTercera = ingresarOpcionTercera.nextInt();
                                if(opcionTercera == 1){
                                    nombre = ingresarDatos.nextLine();
                                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setNombrePedido(nombre);
                                }
                                else if(opcionTercera == 2){
                                    fechaCreacion = ingresarDatos.nextLine();
                                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setFecha(fechaCreacion);
                                }
                                else if(opcionTercera == 3){
                                    System.out.println("ingrese nombre de plato: ");
                                    nombrePlatoPedido = ingresarDatos.nextLine();
                                    for(Platos platoAux : listaPlatos){
                                        if(platoAux.getNombre().equals(nombrePlatoPedido)){
                                            listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setPlato(platoAux);
                                        }
                                    }
                                }
                                else if(opcionTercera == 4){
                                    System.out.println("1 - profesor \n 2 - alumno");
                                    indicarTipoPersona = ingresarDatos.nextInt();
                                    if(indicarTipoPersona == 1) {
                                        nombre = ingresarDatos.nextLine();
                                        for (Profesor profesorAux : profesores) {
                                            if (profesorAux.getNombre().equals(nombre)) {
                                                listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setPersona(profesorAux);
                                            }
                                        }
                                    }
                                    else if(indicarTipoPersona == 2){
                                        nombre = ingresarDatos.nextLine();
                                        for (Alumno alumnoAux : alumnos) {
                                            if (alumnoAux.getNombre().equals(nombre)) {
                                                listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setPersona(alumnoAux);
                                            }
                                        }
                                    }
                                }
                                else if(opcionTercera == 5){
                                    horaEntrega = ingresarDatos.nextLine();
                                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setHoraEntrega(horaEntrega);
                                }
                                else if(opcionTercera == 6){
                                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setEntrego(true);
                                }
                            }
                        }
                    }
                }
                else if(opcionSegunda == 2){
                    if(opcionPrimera == 1){
                        System.out.print("nombre: ");
                        nombre = ingresarDatos.nextLine();
                        System.out.print("apellido: ");
                        apellido = ingresarDatos.nextLine();
                        System.out.print("porcentaje de descuento");
                        porcentajeDescuento = ingresarDatos.nextFloat();
                        Profesor nuevoProfesor = new Profesor(porcentajeDescuento, apellido, nombre);
                        profesores.add(nuevoProfesor);
                    }
                    else if(opcionPrimera == 2){
                        System.out.print("nombre: ");
                        nombre = ingresarDatos.nextLine();
                        System.out.print("apellido: ");
                        apellido = ingresarDatos.nextLine();
                        System.out.print("division: ");
                        division = ingresarDatos.nextLine();
                        Alumno nuevoAlumno = new Alumno(division, apellido, nombre);
                        alumnos.add(nuevoAlumno);
                    }
                    else if(opcionPrimera == 3){
                        System.out.print("nombre: ");
                        nombre = ingresarDatos.nextLine();
                        System.out.print("precio: ");
                        precio = ingresarDatos.nextFloat();
                        Platos nuevoPlato = new Platos(nombre, precio);
                        listaPlatos.add(nuevoPlato);
                    }
                    else if(opcionPrimera == 4){
                        Profesor ingresarProfesor = new Profesor();
                        Alumno ingresarAlumno = new Alumno();
                        Platos platoPedido = new Platos();
                        System.out.print("nombre: ");
                        nombre = ingresarDatos.nextLine();
                        System.out.print("fecha: ");
                        fechaCreacion = ingresarDatos.nextLine();
                        System.out.print("nombre plato");
                        nombrePlatoPedido = ingresarDatos.nextLine();
                        for(Platos platoAux : listaPlatos){
                            if(platoAux.getNombre().equals(nombrePlatoPedido)){
                                platoPedido = listaPlatos.get(listaPlatos.indexOf(platoAux));
                            }
                        }
                        System.out.println("1 - ingresar profesor \n 2 - ingresar alumno");
                        indicarTipoPersona = ingresarDatos.nextInt();
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
                        horaEntrega = ingresarDatos.nextLine();
                        if(indicarTipoPersona == 1){
                            Pedido nuevoPedido = new Pedido(nombre, fechaCreacion, platoPedido, ingresarProfesor, horaEntrega, false);
                            listaPedidos.add(nuevoPedido);
                        }
                        else if(indicarTipoPersona == 2){
                            Pedido nuevoPedido = new Pedido(nombre, fechaCreacion, platoPedido, ingresarAlumno, horaEntrega, false);
                            listaPedidos.add(nuevoPedido);
                        }

                    }
                }
                else if(opcionSegunda == 3){
                    nombre = ingresarDatos.nextLine();
                    if(opcionPrimera == 1){
                        for(Profesor profeAux : profesores){
                            if(profeAux.getNombre().equals(nombre)){
                                profesores.remove(profesores.indexOf(profeAux));
                            }
                        }
                    }
                    else if(opcionPrimera == 2){
                        for(Alumno alumnoAux : alumnos){
                            if(alumnoAux.getNombre().equals(nombre)){
                                alumnos.remove(alumnos.indexOf(alumnoAux));
                            }
                        }
                    }
                    else if(opcionPrimera == 3){
                        for(Platos platoAux : listaPlatos){
                            if(platoAux.getNombre().equals(nombre)){
                                listaPlatos.remove(listaPlatos.indexOf(platoAux));
                            }
                        }
                    }
                    else if(opcionPrimera == 4){
                        for(Pedido pedidoAux : listaPedidos){
                            if(pedidoAux.getNombrePedido().equals(nombre)){
                                listaPedidos.remove(listaPedidos.indexOf(pedidoAux));
                            }
                        }
                    }
                }

            }

        }

    }
}

