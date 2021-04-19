package com.company;
import java.util.Scanner;

public class Main {

    String nombre;
    float precio
    float precioTotal = 0;
    String productosTotal = "Productos:";

    Scanner ingresar = new Scanner(System.in);

    public static void main(String[] args){

       while(true){
           nombre = ingresar.nextLine();
           precio = ingresar.nextFloat();
           precioS = String.valueOf(precio);
           precioTotal = precioTotal + precio;
           productosTotal = productosTotal + ( " " + nombre + ": " + precioS);
           producto pro1 = new producto(nombre, precio);
           System.out.println(productosTotal + " " + precioS);
       }
    }



}