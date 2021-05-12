package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;

public class HashSet_eje {
    /*public static void main(String[] args) {
        Scanner ingresarNum = new Scanner(System.in);
        HashSet<Integer> numerosNoRepetidos = new HashSet<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean block = true;
        int num = 0;
        System.out.println("hola mundo");
        while(block == true) {
            num = ingresarNum.nextInt();
            if(num == 0){
                block = false;
            }
            else{
                numerosNoRepetidos.add(num);
                numeros.add(num);
            }
        }
        for(Integer y : numeros){
            System.out.print(y + " ");
        }
        System.out.println(" ");
        for (Integer numerosNoRepetido : numerosNoRepetidos) {
            System.out.print(numerosNoRepetido + " ");
        }
    }*/

    public static void main(String[] args) {
        Scanner ingresarNum = new Scanner(System.in);
        HashSet<Integer> numerosNoRepetidos = new HashSet<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        boolean block = true;
        int num = 0;
        int num2 = 0;
        System.out.println("ingrese numeros");
        while(block == true){
            System.out.println("ingrese num");
            num = ingresarNum.nextInt();
            System.out.println("ingrese num2");
            num2 = ingresarNum.nextInt();
            if (num == 0 || num2 == 0){
                block = false;
            }
            else{
                numeros.add(num);
                numeros2.add(num2);
                numerosNoRepetidos.add(num2);
            }

        }
        boolean igual = true;
        for (Integer numero : numeros) {
            if(numerosNoRepetidos.contains(numero) == false){
                igual = false;
            }
        }

        if(igual == false){
            System.out.println("No son iguales");
        }
        else{
            System.out.println("Son iguales");
        }
    }
}
