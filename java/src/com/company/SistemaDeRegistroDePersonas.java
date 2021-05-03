package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeRegistroDePersonas {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<>();
        Scanner opcIngresar = new Scanner(System.in);
        Scanner Ingresar = new Scanner(System.in);
        Scanner mod = new Scanner(System.in);
        boolean block = true;
        int opcion;
        String nombre;
        int edad;
        int dni;
        int telefono;
        String direccion;
        int DNIaux;
        String NomAux;

        while(block == true){
            System.out.println("Sistema de registros de personas \\n \\n ¿Que desea hacer? \\n \\n (- 1 -) Ingresar persona \n (- 2 -) Eliminar persona \n (- 3 -) Ver la listas de personas registradas \n(- 4 -) Ver personas mayores de edad  \n(- 5 -) Modificar persona \n (- 6 -) Finalizar y salir");
            opcion = opcIngresar.nextInt();
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
                    System.out.println(px.getNombre() + ":\n" + " " + px.getDni() + "\n" +  " " + px.getEdad() + "\n" + " " + px.getDireccion() + "\n" + " " + px.getTelefono() + "\n");

                }
            }
            else if(opcion == 4){
                System.out.println("Introduzca el nombre de la persona que quiere modificar");
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
                    if(NomAux == px.getNombre()){
                        System.out.println("Seleccione que quiere cambiar \n (- 1 -) Nombre \n (- 2 -) DNI \n (- 3 -) Edad \n (- 4 -) Direccion \n (- 5 -) Telefono");
                        opMod = mod.nextInt();
                        if(opMod == 1){
                            nombre2 = modOPC.nextLine();
                            px.setNombre(nombre2);
                        }
                        else if(opMod == 2){
                            dni2 = modOPC.nextInt();
                            px.setDni(dni2);
                        }
                        else if(opMod == 3){
                            edad2 = modOPC.nextInt();
                            px.setEdad(edad2);
                        }
                        else if(opMod == 4){
                            direccion2 = modOPC.nextLine();
                            px.setDireccion(direccion2);
                        }
                        break;
                    }
                }
            }
        }
    }
}
