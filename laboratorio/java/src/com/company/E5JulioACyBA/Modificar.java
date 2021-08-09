package com.company.E5JulioACyBA;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Modificar {

    private static int opcionTercera;
    private static final Scanner ingresarOpcionTercera = new Scanner(System.in);
    private static final Scanner ingresarDatos = new Scanner(System.in);
    private static String apellido;


    public static void ModificarProfesor(ArrayList<Profesor> profesores, String nombre){
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
                    float porcentajeDescuento = ingresarDatos.nextInt();
                    profesores.get(profesores.indexOf(profesorAux)).setPorcentajeDescuento(porcentajeDescuento);
                }
                break;
            }
        }
    }

    public static void ModificarAlumno( ArrayList<Alumno> alumnos, String nombre){
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
                    String division = ingresarDatos.nextLine();
                    alumnos.get(alumnos.indexOf(alumnoAux)).setDivision(division);
                }
                break;
            }
        }
    }

    public static void ModificarPlato( ArrayList<Platos> listaPlatos, String nombre){
        for(Platos platoAux : listaPlatos){
            if(platoAux.getNombrePlato().equals(nombre)){
                System.out.println(" 1 - Nombre \n 2 - Precio");
                opcionTercera = ingresarOpcionTercera.nextInt();
                if(opcionTercera == 1){
                    nombre = ingresarDatos.nextLine();
                    listaPlatos.get(listaPlatos.indexOf(platoAux)).setNombrePlato(nombre);
                }
                else if(opcionTercera == 2){
                    float precio = ingresarDatos.nextInt();
                    listaPlatos.get(listaPlatos.indexOf(platoAux)).setPrecio(precio);
                }
                ingresarDatos.nextLine();
            }
        }
    }

    public static  void ModificarPedido(ArrayList<Pedidos> listaPedidos, ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores,String nombre){
        for(Pedidos pedidoAux : listaPedidos){
            if(pedidoAux.getNombrePedido().equals(nombre)){
                System.out.println(" 1 - Nombre \n 2 - Fecha \n 3 - Plato \n 4 - Persona \n 5 - Hora de entrega \n 6 - cambiar a entregado");
                opcionTercera = ingresarOpcionTercera.nextInt();
                if(opcionTercera == 1){
                    nombre = ingresarDatos.nextLine();
                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setNombrePedido(nombre);
                }
                else if(opcionTercera == 2){
                    String fechaCreacion = ingresarDatos.nextLine();
                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setFechaCreacion(fechaCreacion);
                }
                else if(opcionTercera == 3){
                    System.out.println("ingrese nombre de plato: ");
                    String nombrePlatoPedido = ingresarDatos.nextLine();
                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setNombrePlatoPedido(nombrePlatoPedido);
                }
                else if(opcionTercera == 4){
                    System.out.println("1 - profesor \n 2 - alumno");
                    int indicarTipoPersona = ingresarDatos.nextInt();
                    ingresarDatos.nextLine();
                    if(indicarTipoPersona == 1) {
                        nombre = ingresarDatos.nextLine();
                        for (Profesor profesorAux : profesores) {
                            if (profesorAux.getNombre().equals(nombre)) {
                                listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setPersonaPedido(profesorAux);
                            }
                        }
                    }
                    else if(indicarTipoPersona == 2){
                        nombre = ingresarDatos.nextLine();
                        for (Alumno alumnoAux : alumnos) {
                            if (alumnoAux.getNombre().equals(nombre)) {
                                listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setPersonaPedido(alumnoAux);
                            }
                        }
                    }
                }
                else if(opcionTercera == 5){
                    String horaEntrega = ingresarDatos.nextLine();
                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setHoraEntrega(horaEntrega);
                }
                else if(opcionTercera == 6){
                    listaPedidos.get(listaPedidos.indexOf(pedidoAux)).setEntregado(true);
                }
            }
        }
    }

}
