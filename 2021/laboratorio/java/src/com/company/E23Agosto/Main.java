package com.company.E23Agosto;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class Main{
    public static void main(String[] args) {

        JFrame ventana = new JFrame();
        ventana.setLayout(new BorderLayout());
        ventana.setSize(500, 500);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar barraDeMenu = new JMenuBar();
        ventana.setJMenuBar(barraDeMenu);

        JMenu opciones = new JMenu("Opciones");
        barraDeMenu.add(opciones);

        JMenuItem JuegoNuevo = new JMenuItem("Juego Nuevo");
        opciones.add(JuegoNuevo);

        JMenuItem cargarResultado = new JMenuItem("Cargar resultado");
        opciones.add(cargarResultado);

        JMenuItem salir = new JMenuItem("Salir");
        opciones.add(salir);

        salir.addActionListener(e -> {
            ventana.setVisible(false);
            ventana.dispose();
        });

        JPanel panelPuntaje = new JPanel();
        panelPuntaje.setVisible(false);
        panelPuntaje.setSize(80, 80);
        panelPuntaje.setLocation(170, 170);
        JLabel puntaje1 = new JLabel();
        JLabel puntaje2 = new JLabel();
        panelPuntaje.add(puntaje1);
        panelPuntaje.add(puntaje2);





        JLabel panelBotones = new JLabel();
        panelBotones.setLayout(new GridLayout(3,3));

        JButton boton1 = new JButton("");
        boton1.setLocation(1,1);

        JButton boton2 = new JButton("");
        boton2.setLocation(1,2);

        JButton boton3 = new JButton("");
        boton2.setLocation(1,3);

        JButton boton4 = new JButton("");
        boton2.setLocation(2,1);

        JButton boton5 = new JButton("");
        boton2.setLocation(2,2);

        JButton boton6 = new JButton("");
        boton2.setLocation(2,3);

        JButton boton7 = new JButton("");
        boton2.setLocation(3,1);

        JButton boton8 = new JButton("");
        boton2.setLocation(3,2);

        JButton boton9 = new JButton("");
        boton2.setLocation(3,3);


        JuegoNuevo.addActionListener(e ->{
            boton1.setText("");
            boton2.setText("");
            boton3.setText("");
            boton4.setText("");
            boton5.setText("");
            boton6.setText("");
            boton7.setText("");
            boton8.setText("");
            boton9.setText("");
        });

        ArrayList<JButton> botones = new ArrayList<>();
        botones.add(boton1);
        botones.add(boton2);
        botones.add(boton3);
        botones.add(boton4);
        botones.add(boton5);
        botones.add(boton6);
        botones.add(boton7);
        botones.add(boton8);
        botones.add(boton9);


        panelBotones.add(boton1);
        panelBotones.add(boton2);
        panelBotones.add(boton3);
        panelBotones.add(boton4);
        panelBotones.add(boton5);
        panelBotones.add(boton6);
        panelBotones.add(boton7);
        panelBotones.add(boton8);
        panelBotones.add(boton9);

        ventana.add(panelPuntaje);
        ventana.add(panelBotones,BorderLayout.CENTER);
        ventana.setVisible(true);

        AtomicInteger puntajeX= new AtomicInteger();
        AtomicInteger puntajeO= new AtomicInteger();

        cargarResultado.addActionListener(e ->{
            puntaje1.setText(String.valueOf(puntajeX.get()));
            puntaje2.setText(String.valueOf(puntajeO.get()));
            panelPuntaje.setVisible(true);
        });

        final boolean[] turno = {false};
        int numeroTurnos = 9;

        boton1.addActionListener(e -> {
            if (!turno[0]) {
                boton1.setText("x");
                turno[0] = true;
            } else {
                boton1.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }
        });

        boton2.addActionListener(e -> {
            if (!turno[0]) {
                boton2.setText("x");
                turno[0] = true;
            } else {
                boton2.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }            });

        boton3.addActionListener(e -> {
            if (!turno[0]) {
                boton3.setText("x");
                turno[0] = true;
            } else {
                boton3.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }            });

        boton4.addActionListener(e -> {
            if (!turno[0]) {
                boton4.setText("x");
                turno[0] = true;
            } else {
                boton4.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }             });

        boton5.addActionListener(e -> {
            if (!turno[0]) {
                boton5.setText("x");
                turno[0] = true;
            } else {
                boton5.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }              });

        boton6.addActionListener(e -> {
            if (!turno[0]) {
                boton6.setText("x");
                turno[0] = true;
            } else {
                boton6.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }              });

        boton7.addActionListener(e -> {
            if (!turno[0]) {
                boton7.setText("x");
                turno[0] = true;
            } else {
                boton7.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }              });

        boton8.addActionListener(e -> {
            if (!turno[0]) {
                boton8.setText("x");
                turno[0] = true;
            } else {
                boton8.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }              });

        boton9.addActionListener(e -> {
            if (!turno[0]) {
                boton9.setText("x");
                turno[0] = true;
            } else {
                boton9.setText("o");
                turno[0] = false;
            }
            int punto =check(botones, ventana, puntajeX.get(), puntajeO.get());
            if(punto == 1){
                puntajeX.addAndGet(1);
            }else if(punto == 2){
                puntajeO.addAndGet(1);
            }              });



        cargarResultado.addActionListener(e ->{
            System.out.println(puntajeX + "    " + puntajeO);
        });


    }
    public static int check(ArrayList<JButton> botones, JFrame ventana, int puntajeX, int puntajeO) {


        for (int i = 0; i < 3; i++) {
            if (botones.get(i).getText() == "x" && botones.get(i + 1).getText() == "x" && botones.get(i + 2).getText() == "x") {
                return 1;
            } else if (botones.get(i).getText() == "o" && botones.get(i + 1).getText() == "o" && botones.get(i + 2).getText() == "o") {
                return 2;

            }
        }

        for (int i = 0; i < 3; i++) {
            if (botones.get(i).getText() == "x" && botones.get(i + 3).getText() == "x" && botones.get(i + 6).getText() == "x") {
                return 1     ;
            } else if (botones.get(i).getText() == "o" && botones.get(i + 3).getText() == "o" && botones.get(i + 6).getText() == "o") {
                return 2;
            }
        }


        if (botones.get(0).getText() == "x" && botones.get(4).getText() == "x" && botones.get(8).getText() == "x") {
            return 1;
        } else if (botones.get(2).getText() == "x" && botones.get(4).getText() == "x" && botones.get(6).getText() == "x") {
            return 1;
        }

        if (botones.get(0).getText() == "o" && botones.get(4).getText() == "o" && botones.get(8).getText() == "o") {
            return 2;
        } else if (botones.get(2).getText() == "o" && botones.get(4).getText() == "o" && botones.get(6).getText() == "o") {
            return 2;
        }



        return 0;

    }
}