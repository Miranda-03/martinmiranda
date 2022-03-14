package com.company;
import java.util.Scanner;

 class producto{
    private String nombre;
    private float precio;

    public producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }
}


public class ejercicio19abril {

 

    public static void main(String[] args){


        String nombre;
        float precio;
        float precioTotal = 0;
        String precioS;
        String productosTotal = "Productos:\n";
        char opcion = 'y';
    
        Scanner ingresar = new Scanner(System.in);

        Boolean bloqueo = true;

       while(opcion == 'y'){
           System.out.println("Nombre del producto: ");
           nombre = ingresar.nextLine();
           System.out.println("Precio del producto: ");
           precio = ingresar.nextFloat();
           precioS = String.valueOf(precio);
           precioTotal = precioTotal + precio;
           productosTotal = productosTotal + ( " " + nombre + ": " + precioS + "\n");
           producto pro1 = new producto(nombre, precio);
           nombre = ingresar.nextLine();// Scanner para que la linea 23 no tome el valor de la linea 25 
           System.out.println(productosTotal);
           System.out.println("Total: " + precioTotal + "\n");
           System.out.print("Para introduzir otro producto pulse 'y': ");
           opcion = ingresar.next().charAt(0);
           nombre = ingresar.nextLine();// Mismo proposito que en la linea 31
       }
       System.out.println("Total a pagar: " + precioTotal + "\n");
    }



}