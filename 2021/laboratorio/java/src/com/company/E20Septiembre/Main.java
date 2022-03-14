package com.company.E20Septiembre;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ingresarDatos = new Scanner(System.in);
        Scanner ingresarOpcion = new Scanner(System.in);

        HashSet<Programa> programas = new HashSet<>();

        String nombre;
        String apellido;
        Integer DNI;
        String fechaIngreso;
        String tipo;
        String musicalizador = null;
        ArrayList<String> estilosMusica = new ArrayList<>();
        int opcion;
        int numeroEstilos;
        String nombreEstilos;
        int hora;
        int minutos;

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

                Trabajador nuevoTrabajador = new Trabajador(nombre, apellido, DNI, fechaIngreso, tipo);

            }else if(opcion == 2) {

                nombre = ingresarDatos.nextLine();
                int numConductores = ingresarDatos.nextInt();
                String operador = ingresarDatos.nextLine();
                String categoria = ingresarDatos.nextLine();
                if(categoria.equals("musica")){
                    System.out.println("opcional");
                    musicalizador = ingresarDatos.nextLine();
                    System.out.print("numero de estilos: ");
                    numeroEstilos = ingresarDatos.nextInt();
                    for (int y = 0; y < numeroEstilos; y++){
                        nombreEstilos = ingresarDatos.nextLine();
                        estilosMusica.add(nombreEstilos);
                    }
                }
                hora = ingresarDatos.nextInt();
                minutos = ingresarDatos.nextInt();
                int horaF = ingresarDatos.nextInt();
                int minutosFinales = ingresarDatos.nextInt();
                LocalDateTime horaInicio = LocalDateTime.of(2021,1, 1, hora, minutos, 0);


                LocalDateTime horaFinal = LocalDateTime.of(2021,1, 1, horaF, minutosFinales, 0);
                int contador = 0;
                if(!programas.isEmpty()){
                    for (Programa programa : programas){
                        if(horaFinal.isAfter(programa.getHoraInicio()) || horaInicio.isBefore(programa.getHoraFinal())){
                            contador = contador + 1;
                        }
                    }
                    if(contador == programas.size()){
                        if(categoria.equals("musica")){
                            Programa nuevoPrograma = new Programa(nombre, numConductores, operador, categoria, musicalizador, estilosMusica, horaInicio, horaFinal);
                        }else{
                            Programa nuevoPrograma = new Programa(nombre, numConductores, operador, categoria, horaInicio, horaFinal);
                        }
                    }
                }
                else{
                    if(categoria.equals("musica")){
                        Programa nuevoPrograma = new Programa(nombre, numConductores, operador, categoria, musicalizador, estilosMusica, horaInicio, horaFinal);
                    }else{
                        Programa nuevoPrograma = new Programa(nombre, numConductores, operador, categoria, horaInicio, horaFinal);
                    }
                }
            }
        }
    }
}
