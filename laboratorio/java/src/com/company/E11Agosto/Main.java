package com.company.E11Agosto;

import com.company.Persona;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //Ejercicio del 12 de abril



        System.out.println(" ");


        JFrame ventana = new JFrame();
        ventana.setLayout(null);
        ventana.setSize(800, 400);


        JLabel textoNombre = new JLabel();
        textoNombre.setText("Ingrese nombre");
        textoNombre.setSize(300, 25);
        textoNombre.setLocation(25, 25);
        textoNombre.setForeground(Color.cyan);

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
        campoDeTextoDni.setBackground(Color.red);

        JButton boton = new JButton("Introducir");
        boton.setSize(160, 33);
        boton.setLocation(25,200);

        JLabel respuesta = new JLabel();
        respuesta.setSize(790,25);
        respuesta.setLocation(30,250);

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
        ventana.add(boton);
        ventana.add(respuesta);
        ventana.setVisible(true);

         Persona p0 = new Persona();


        boton.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String ponerNombre = campoDeTextoNombre.getText();
                        String Edad = campoDeTextoEdad.getText();
                        Integer ponerEdad = Integer.parseInt(Edad);
                        String Dni = campoDeTextoDni.getText();
                        Integer ponerDni = Integer.parseInt(Dni);
                        String ponerDireccion = campoDeTextoDireccion.getText();
                        String telefono = campoDeTextoTelefono.getText();
                        Integer ponerTelefono = Integer.parseInt(telefono);

                         p0.setNombre(ponerNombre);
                         p0.setEdad(ponerEdad);
                         p0.setDni(ponerDni);
                         p0.setDireccion(ponerDireccion);
                         p0.setTelefono(ponerTelefono);

                         respuesta.setText("Nombre: " + p0.getNombre() + " | Edad: " + p0.getEdad()+ " | DNI: " + p0.getDni() + " | Direccion: "
                         + p0.getDireccion() + " | Telefono: " + p0.getTelefono());
                    }
                });


        System.out.println("-----------------------------------");


    }
    }

