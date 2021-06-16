package com.company;

public class Area {

    public static double Circulo(double radio){
        double area = Math.PI * radio * radio;
        return area;
    }

    public static double Esfera(double radio){
        double area = 4 * Math.PI * radio * radio;
        return area;
    }

    public static float Cuadrado(float lado){
        float area = lado * lado;
        return area;
    }

    public static float Cubo(float lado){
        float area = 6 * lado * lado;
        return area;
    }

    public static float Triangulo(float base, float altura){
        float area = (base * altura) / 2;
        return area;
    }
}
