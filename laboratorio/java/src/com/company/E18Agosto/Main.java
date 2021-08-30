package com.company.E18Agosto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args) {

        final String[] opcion = new String[1];
        opcion[0] = "";

        JFrame ventana = new JFrame();
        ventana.setSize(800, 600);
        ventana.setLayout(new BorderLayout());

        JFrame ventanaArea= new JFrame();
        ventanaArea.setSize(400,300);
        ventanaArea.setLayout(null);




        JLabel TituloCubo = new JLabel();
        TituloCubo.setText("Inserte Base");
        TituloCubo.setSize(250, 25);

        JTextField insertCubo = new JTextField();
        insertCubo.setSize(100,25);
        insertCubo.setLocation(50 , 30);

        JTextField insertAltura = new JTextField();
        insertAltura.setSize(100,25);
        insertAltura.setLocation(50, 60);


        JPanel panelTitulo = new JPanel();


        JLabel titulo = new JLabel();
        titulo.setText("Cálculo de áreas");
        titulo.setSize(40, 25);
        titulo.setLocation(2  , 10);

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
        respuesta.setLocation(160,140);

        JButton botonRespuesta = new JButton();
        botonRespuesta.setSize(100, 50);
        botonRespuesta.setText("calcular");
        botonRespuesta.setLocation(130, 210);

        TituloCubo.setLocation(10, 10);

        JPanel panelGeneral= new JPanel();
        // panelGeneral.setSize(400, 300);
        ventanaArea.setName("general");
        // panelGeneral.setLocation(0, 0);
        ventanaArea.add(TituloCubo);
        ventanaArea.add(insertCubo);
        ventanaArea.add(respuesta);
        ventanaArea.add(botonRespuesta);

        JPanel panelTriangulo= new JPanel();




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
                        TituloCubo.setText("ingrese area cubo");


                        // ventanaArea.remove(panelTriangulo);

                        ventanaArea.setVisible(true);
                        opcion[0] = "cubo";

                    }
                });


        boton2.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {

                        TituloCubo.setText("ingrese area del circulo");


                        ventanaArea.setVisible(true);
                        opcion[0] = "circulo";

                    }
                });

        boton3.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        TituloCubo.setText("ingrese area de la esfera");

                        ventanaArea.setVisible(true);
                        opcion[0] = "esfera";

                    }
                });


        boton4.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        TituloCubo.setText("ingrese base y altura del triangulo");

                        ventanaArea.add(insertAltura);
                        ventanaArea.setVisible(true);
                        opcion[0] = "triangulo";

                    }
                });

        boton5.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        TituloCubo.setText("ingrese lado del cuadrado");


                        ventanaArea.setVisible(true);
                        opcion[0] = "cuadrado";

                    }
                });

        botonRespuesta.addMouseListener(

                new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if(opcion[0] == "cubo") {
                            String input = insertCubo.getText();
                            int num = Integer.parseInt(input);
                            Integer numResolv = (int) Area.Cubo(num);
                            respuesta.setText(String.valueOf(numResolv));
                        }
                        else if(opcion[0] == "circulo"){
                            String input = insertCubo.getText();
                            int num = Integer.parseInt(input);
                            Integer numResolv = (int) Area.Circulo(num);
                            respuesta.setText(String.valueOf(numResolv));
                        }
                        else if (opcion[0] == "esfera"){
                            String input = insertCubo.getText();
                            int num = Integer.parseInt(input);
                            Integer numResolv = (int) Area.Esfera(num);
                            respuesta.setText(String.valueOf(numResolv));
                        }
                        else if (opcion[0] == "triangulo"){
                            String input = insertCubo.getText();
                            String input2 = insertAltura.getText();
                            int num = Integer.parseInt(input);
                            int num2 = Integer.parseInt(input2);
                            Integer numResolv = (int) Area.Triangulo(num, num2);
                            respuesta.setText(String.valueOf(numResolv));
                        }
                        else if(opcion[0] == "cuadrado"){
                            String input = insertCubo.getText();
                            int num = Integer.parseInt(input);
                            Integer numResolv = (int) Area.Cuadrado(num);
                            respuesta.setText(String.valueOf(numResolv));
                        }
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
