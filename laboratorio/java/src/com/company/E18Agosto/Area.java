package com.company.E18Agosto;

public class Area {

    public static double Circulo(double radio){
        return Math.PI * radio * radio;
    }

    public static double Esfera(double radio){
        return 4 * Math.PI * radio * radio;
    }

    public static float Cuadrado(float lado){
        return lado * lado;
    }

    public static float Cubo(float lado){
        return 6 * lado * lado;
    }

    public static float Triangulo(float base, float altura){
        return (base * altura) / 2;
    }
}
