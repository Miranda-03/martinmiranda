package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList<>();
        Scanner opcIngresar = new Scanner(System.in);
        Scanner Ingresar = new Scanner(System.in);
        Scanner mod = new Scanner(System.in);
        Scanner nombreMod = new Scanner(System.in);
        boolean block = true;
        int opcion;
        String nombre;
        int edad;
        int dni;
        int telefono;
        String direccion;
        int DNIaux;
        String NomAux = new String();


        while(block == true){
            System.out.println("Sistema de registros de personas \n \n ¿Que desea hacer? \n \n (- 1 -) Ingresar persona \n (- 2 -) Eliminar persona \n (- 3 -) Ver la listas de personas registradas \n (- 4 -) Ver personas mayores de edad  \n (- 5 -) Modificar persona \n (- 6 -) Finalizar y salir");
            opcion = Ingresar.nextInt();
            Ingresar.nextLine();
            if(opcion == 1){
                System.out.println("ingrese nombre:");
                nombre = Ingresar.nextLine();
                System.out.println("ingrese direccion:");
                direccion = Ingresar.nextLine();
                System.out.println("ingrese edad:");
                edad = Ingresar.nextInt();
                System.out.println("ingrese dni:");
                dni = Ingresar.nextInt();
                System.out.println("ingrese telefono:");
                telefono = Ingresar.nextInt();
                Persona PS = new Persona(nombre, edad, dni, direccion, telefono);
                personas.add(PS);
            }
            else if(opcion == 2){
                System.out.print("Introduzca el DNI de la persona a eliminar: ");
                DNIaux = Ingresar.nextInt();
                Persona px = new Persona();
                for(int y = 0; y < personas.size(); y++){
                    px = personas.get(y);
                    if(DNIaux == px.getDni()){
                        personas.remove(px);
                        System.out.println(px.getNombre() + "fue eliminado");
                        break;
                    }
                }
            }
            else if(opcion == 3){
                Persona px = new Persona();
                for(int t = 0; t < personas.size(); t++){
                    px = personas.get(t);
                    System.out.println(px.getNombre() + ":\n" + " DNI: " + px.getDni() + "\n" +  " Edad: " + px.getEdad() + "\n" + " Direccion: " + px.getDireccion() + "\n" + " Telefono: " + px.getTelefono() + "\n");

                }
            }
            else if(opcion == 5){
                System.out.print("Introduzca el nombre de la persona que quiere modificar: ");
                NomAux = nombreMod.nextLine();
                Persona px = new Persona();
                int opMod;


                String nombre2;
                int edad2;
                int dni2;
                int telefono2;
                String direccion2;


                Scanner modOPC = new Scanner(System.in);

                for(int y = 0; y < personas.size(); y++){
                    px = personas.get(y);

                    if(NomAux.equals(px.getNombre())){
                        System.out.println("Seleccione que quiere cambiar \n (- 1 -) Nombre \n (- 2 -) DNI \n (- 3 -) Edad \n (- 4 -) Direccion \n (- 5 -) Telefono");
                        opMod = mod.nextInt();
                        if(opMod == 1){
                            System.out.print("Nuevo nombre: ");
                            nombre2 = modOPC.nextLine();
                            px.setNombre(nombre2);
                        }
                        else if(opMod == 2){
                            System.out.print("Nuevo DNI: ");
                            dni2 = modOPC.nextInt();
                            px.setDni(dni2);
                        }
                        else if(opMod == 3){
                            System.out.print("Nueva edad: ");
                            edad2 = modOPC.nextInt();
                            px.setEdad(edad2);
                        }
                        else if(opMod == 4){
                            System.out.print("Nueva direccion: ");
                            direccion2 = modOPC.nextLine();
                            px.setDireccion(direccion2);
                        }
                        else if(opMod == 5){
                            System.out.print("Nuevo telefono: ");
                            telefono2 = modOPC.nextInt();
                            px.setTelefono(telefono2);
                        }

                        personas.set(y, px);

                        break;
                    }
                }
            }
            else if(opcion == 4){
                Persona px = new Persona();
                boolean mayor;

                for(int p = 0; p < personas.size(); p++){
                    px = personas.get(p);
                    mayor = px.esMayorDeEdad();
                    if(mayor == true){
                        System.out.println(px.getNombre() + ":\n" + " " + px.getDni() + "\n" +  " " + px.getEdad() + "\n" + " " + px.getDireccion() + "\n" + " " + px.getTelefono() + "\n");
                    }
                }
            }
            else if(opcion == 6){
                break;
            }
        }
    }
}
