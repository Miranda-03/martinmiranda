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

        String nombre;
        String apellido;
        String division;
        float porcentajeDescuento;
        float precio;

        int opcionPrimera;
        int opcionSegunda;
        int opcionTercera;

        Scanner ingresarOpcionPrimera = new Scanner(System.in);
        Scanner ingresarOpcionSegunda = new Scanner(System.in);
        Scanner ingresarOpcionTercera = new Scanner(System.in);
        Scanner ingresarDatos = new Scanner(System.in);

        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Pedidos> listaPedidos = new ArrayList<>();


        boolean bloqueoWhile = false;

      while(!bloqueoWhile) {

          System.out.println(" 1 - Profesores \n 2 - Alumnos \n 3 - Platos \n 4 - Pedidos \n 5 - Finalizar");
          opcionPrimera = ingresarOpcionPrimera.nextInt();
          if (opcionPrimera == 5) {
              bloqueoWhile = true;
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
              }

          }
      }


    }
}
