package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class producto{
    private String nombre;
    private float precio;

    public producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public float getPrecio(){
        return precio;
    }
}

public class SistemaDeRegistro{
    public ArrayList<producto> productos = new ArrayList<>();

    

    public void iniciarSistema(){
        System.out.println("Sistema de registros \n \n ¿Que desea hacer? \n \n (- 1 -) Ingresar nuevo Producto \n (- 2 -) Eliminar Producto \n (- 3 -) Ver lista de productos y el importe total \n (- 4 -) Finalizar y salir");
    }
    
    public void registrarProducto(producto P1){
        productos.add(P1);
    }

    public void verLista(){
        int total = 0;
        for(int y = 0; y < productos.size(); y++){
            producto px = productos.get(y);
            System.out.println(px.getNombre() + ": " + px.getPrecio() + " \n");
            total += px.getPrecio();
        }
        System.out.println("Total: " + total);
    }

    public void EliminarProducto(String name){
        productos.remove(producto.name);
    }
}

public class Productos26Abril {

    char opcion;

    boolean bloqueo = true;

    public static void main(String[] args) {

        SistemaDeRegistro


        while(bloqueo == true){
            
            

        }
        
        producto P1 = new producto(nombre, precio);
    }
}
