package com.company.E11Agosto;

import com.company.Persona;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Ejercicio del 12 de abril

        System.out.println(" ");


        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(800, 600);

        JLabel textoNombre = new JLabel();
        textoNombre.setText("Ingrese nombre");
        textoNombre.setSize(300, 25);
        textoNombre.setLocation(25, 25);

        JLabel textoDireccion = new JLabel();
        textoDireccion.setText("Ingrese su direccion");
        textoDireccion.setSize(300, 25);
        textoDireccion.setLocation(25, 55);

        JLabel textoEdad = new JLabel();
        textoEdad.setText("Ingrese su edad");
        textoEdad.setSize(300, 25);
        textoEdad.setLocation(25, 85);

        JLabel textoDni = new JLabel();
        textoDni.setText("Ingrese su dni");
        textoDni.setSize(300, 25);
        textoDni.setLocation(25, 115);

        JLabel textoTelefono = new JLabel();
        textoTelefono.setText("Ingrese su telefono");
        textoTelefono.setSize(300, 25);
        textoTelefono.setLocation(25, 145);

        JTextField campoDeTextoNombre = new JTextField();
        campoDeTextoNombre.setSize(200,25);
        campoDeTextoNombre.setLocation(180,25);


        JTextField campoDeTextoDireccion = new JTextField();
        campoDeTextoDireccion.setSize(200,25);
        campoDeTextoDireccion.setLocation(180,55);


        JTextField campoDeTextoEdad = new JTextField();
        campoDeTextoEdad.setSize(200,25);
        campoDeTextoEdad.setLocation(180,85);


        JTextField campoDeTextoDni = new JTextField();
        campoDeTextoDni.setSize(200,25);
        campoDeTextoDni.setLocation(180,115);


        JTextField campoDeTextoTelefono = new JTextField();
        campoDeTextoTelefono.setSize(200,25);
        campoDeTextoTelefono.setLocation(180,145);


        ventana.add(textoNombre);
        ventana.add(textoDireccion);
        ventana.add(textoEdad);
        ventana.add(textoDni);
        ventana.add(textoTelefono);
        ventana.add(campoDeTextoNombre);
        ventana.add(campoDeTextoDireccion);
        ventana.add(campoDeTextoEdad);
        ventana.add(campoDeTextoDni);
        ventana.add(campoDeTextoTelefono);
        ventana.setVisible(true);

        Scanner ingresar = new Scanner(System.in);
        Scanner ingresar2 = new Scanner(System.in);

        System.out.println("ingrese nombre:");
        String ponerNombre = ingresar.nextLine();
        System.out.println("ingrese direccion:");
        String ponerDireccion = ingresar.nextLine();
        System.out.println("ingrese edad:");
        int ponerEdad = ingresar.nextInt();
        System.out.println("ingrese dni:");
        int ponerDni = ingresar.nextInt();
        System.out.println("ingrese telefono:");
        int ponerTelefono = ingresar.nextInt();

        System.out.flush();

        System.out.println("-----------------------------------");

        int opcion;

        com.company.Persona p0 = new Persona(ponerNombre, ponerEdad, ponerDni, ponerDireccion, ponerTelefono);

        boolean block = false;



        while(block == false){
            System.out.println(p0.getNombre());
            System.out.println(p0.getEdad());
            System.out.println(p0.getDni());
            System.out.println(p0.getDireccion());
            System.out.println(p0.getTelefono());

            System.out.println(" ");

            System.out.println("¿Que desea cambiar?");

            System.out.println(" ");

            System.out.println("(- 1 -) Nombre");
            System.out.println("(- 2 -) edad");
            System.out.println("(- 3 -) dni");
            System.out.println("(- 4 -) direccion");
            System.out.println("(- 5 -) telefono");

            System.out.println(" ");

            System.out.println("Eliga la opcion o entre '0' para terminar");

            opcion = ingresar.nextInt();

            if(opcion == 0){
                block = true;
            }
            else if(opcion == 1){
                System.out.println("ingrese nuevo nombre:");
                ponerNombre = ingresar2.nextLine();
                p0.setNombre(ponerNombre);
            }
            else if(opcion == 2){
                System.out.println("ingrese nueva edad:");
                ponerEdad = ingresar2.nextInt();
                p0.setEdad(ponerEdad);
            }
            else if(opcion == 3){
                System.out.println("ingrese nuevo dni:");
                ponerDni = ingresar2.nextInt();
                p0.setDni(ponerDni);
            }
            else if(opcion == 4){
                System.out.println("ingrese nueva direccion:");
                ponerDireccion = ingresar2.nextLine();
                p0.setDireccion(ponerDireccion);
            }
            else if(opcion == 5){
                System.out.println("ingrese nuevo telefono:");
                ponerTelefono = ingresar2.nextInt();
                p0.setTelefono(ponerTelefono);
            }

            System.out.println(" ");

        }
    }
    }

