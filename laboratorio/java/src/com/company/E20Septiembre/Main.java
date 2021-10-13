package com.company.E20Septiembre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
        Scanner ingresarOpcion = new Scanner(System.in);

        String nombre;
        String apellido;
        Integer DNI;
        String fechaIngreso;
        String tipo;
        String musicalizador;
        String[] estilos;
        int opcion;

        while(true){
            System.out.println("ingresar: ");
            System.out.println("- 1 - trabajador");
            System.out.println("- 2 - progama");
            opcion = ingresarOpcion.nextInt();
            if(opcion == 1){
                nombre = ingresarDatos.nextLine();
                apellido = ingresarDatos.nextLine();
                DNI = ingresarDatos.nextInt();
                fechaIngreso = ingresarDatos.nextLine();
                tipo = ingresarDatos.nextLine();
                System.out.println("opcional");
                musicalizador = ingresarDatos.nextLine();
                

                Trabajador nuevoTrabajador = new Trabajador(nombre, apellido, DNI, fechaIngreso, tipo);
            }
        }
    }
}
