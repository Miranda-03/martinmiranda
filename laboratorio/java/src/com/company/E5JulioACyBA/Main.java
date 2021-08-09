package com.company.E5JulioACyBA;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String nombre;
        String nombrePlato;
        String apellido;
        String division;
        float porcentajeDescuento;
        float precio;

        int opcionPrimera;
        int opcionSegunda;
        float precioPlatoPedido = 0;

        Scanner ingresarOpcionPrimera = new Scanner(System.in);
        Scanner ingresarOpcionSegunda = new Scanner(System.in);
        Scanner ingresarDatos = new Scanner(System.in);

        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Pedidos> listaPedidos = new ArrayList<>();
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
                for(Pedidos pedidoAux : listaPedidos){
                    if((pedidoAux.getPersonaPedido()).getClass().getSimpleName() == "Profesor"){
                        Profesor p = (Profesor) pedidoAux.getPersonaPedido();
                        float descuentoPlatoPedido = p.getPorcentajeDescuento();
                        nombrePlato = pedidoAux.getNombrePlatoPedido();
                        for(Platos platoAux : listaPlatos){
                            if(platoAux.getNombrePlato().equals(nombrePlato)){
                                precioPlatoPedido = platoAux.getPrecio();
                                break;
                            }
                        }
                        precioPlatoPedido = precioPlatoPedido - ((precioPlatoPedido * descuentoPlatoPedido) / 100);
                    }
                    else{
                        nombrePlato = pedidoAux.getNombrePlatoPedido();
                        for(Platos platoAux : listaPlatos){
                            if(platoAux.getNombrePlato().equals(nombrePlato)){
                                precioPlatoPedido = platoAux.getPrecio();
                                break;
                            }
                        }
                    }

                    for(Pedidos pedido : listaPedidos){
                        System.out.println(pedido.getPersonaPedido().getNombre());
                        System.out.println(pedido.getFechaCreacion());
                        System.out.println(pedido.getNombrePlatoPedido());
                        System.out.println(pedido.getHoraEntrega());
                        System.out.println(precioPlatoPedido);
                        System.out.println("\n");
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
                        Modificar.ModificarProfesor(profesores, nombre);
                    }
                    else if(opcionPrimera == 2){
                       Modificar.ModificarAlumno(alumnos, nombre);
                    }
                    else if(opcionPrimera == 3){
                       Modificar.ModificarPlato(listaPlatos, nombre);
                    }
                    else if(opcionPrimera == 4){
                        Modificar.ModificarPedido(listaPedidos, alumnos, profesores, nombre);
                    }
                }
                else if(opcionSegunda == 2){
                    if(opcionPrimera == 1){
                        Agregar.AgregarProfesor(profesores);
                    }
                    else if(opcionPrimera == 2){
                       Agregar.AgregarAlumno(alumnos);
                    }
                    else if(opcionPrimera == 3){
                        Agregar.AgregarPlato(listaPlatos);
                    }
                    else if(opcionPrimera == 4){
                        Agregar.AgregarPedido(listaPedidos, alumnos, profesores, listaPlatos);

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
                            if(platoAux.getNombrePlato().equals(nombre)){
                                listaPlatos.remove(listaPlatos.indexOf(platoAux));
                            }
                        }
                    }
                    else if(opcionPrimera == 4){
                        for(Pedidos pedidoAux : listaPedidos){
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