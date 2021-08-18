package com.company.E18Agosto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame ventana = new JFrame();
        ventana.setSize(800, 600);
        ventana.setLayout(new BorderLayout());

        JFrame ventanaArea= new JFrame();
        ventanaArea.setSize(400,300);
        ventanaArea.setLayout(new BorderLayout());

        JPanel panelCuboTitulo = new JPanel();
        JLabel TituloCubo = new JLabel();
        TituloCubo.setText("Inserte Base");
        panelCuboTitulo.add(TituloCubo);

        JTextField insertCubo = new JTextField();
        insertCubo.setSize(30,25);
        panelCuboTitulo.add(insertCubo);

        JPanel panelTitulo = new JPanel();


        JLabel titulo = new JLabel();;
        titulo.setText("Cálculo de áreas");
        titulo.setSize(titulo.getWidth(), 25);
        //titulo.setLocation((800 / 2 ) - (titulo.getWidth() / 2), 0);

        panelTitulo.add(titulo);

        JPanel panelSuperior = new JPanel();

        panelSuperior.setLayout(new GridLayout(1,5));

        JButton boton1 = new JButton("Cubo");
        boton1.setBackground(Color.cyan);
        JButton boton2 = new JButton("Circulo");
        boton2.setBackground(Color.green);
        JButton boton3 = new JButton("Esfera");
        boton3.setBackground(Color.pink);
        JButton boton4 = new JButton("Triangulo");
        boton4.setBackground(Color.red);
        JButton boton5 = new JButton("Cuadrado");
        boton5.setBackground(Color.yellow);

        JLabel respuesta = new JLabel();
        respuesta.setSize(790,25);
        respuesta.setLocation(30,250);
        panelSuperior.add(boton1);
        panelSuperior.add(boton2);
        panelSuperior.add(boton3);
        panelSuperior.add(boton4);
        panelSuperior.add(boton5);



        ventana.add(panelTitulo, BorderLayout.NORTH);
        ventana.add(panelSuperior,BorderLayout.CENTER);
        boton1.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {

                        ventanaArea.add(panelCuboTitulo,BorderLayout.NORTH);
                        ventanaArea.add(insertCubo, BorderLayout.CENTER);
                        ventanaArea.setVisible(true);

                    }
                });
        /*
        BorderLayout.SOUTH
        BorderLayout.WEST
        BorderLayout.EAST
        BorderLayout.CENTER
         */

        ventana.setVisible(true);

        /*
        para eliminar un componente de la ventana, utilizar el método .remove
        El mismo recibe como parámetro el elemento a eliminar.
        */

    }
}
