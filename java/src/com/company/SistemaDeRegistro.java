package com.company;
import java.util.Scanner;
import java.util.ArrayList;


public class SistemaDeRegistro {
    private ArrayList<producto2> productos;

    public SistemaDeRegistro(){
        productos = new ArrayList<>();
    }

    public void iniciarSistema() {
        System.out.println("Sistema de registros \\n \\n ¿Que desea hacer? \\n \\n (- 1 -) Ingresar nuevo Producto \n (- 2 -) Eliminar Producto \n (- 3 -) Ver lista de productos y el importe total \n (- 4 -) Finalizar y salir");
    }

    public void registrarProducto(producto2 p) {
        productos.add(p);
    }

    public void verLista() {
        producto2 px = new producto2();
        int total = 0;
        String nom;
        float pre;
        for (int y = 0; y < (productos.size()); y++) {
            px = productos.get(y);
            nom = px.getNombre();
            pre = px.getPrecio();
            System.out.print(nom + ": " + pre + "\n");
            System.out.print("\n");
            total += pre;
        }
        System.out.println("Total: " + total);
    }

    public void eliminarProducto(String nombre){
        producto2 px = new producto2();
        String nombreAux;
        int id;
        for (int p = 0; p < productos.size(); p++) {
            px = productos.get(p);
            nombreAux = px.getNombre();
            if (nombreAux.equals(nombre)) {
                productos.remove(px);
                break;
            }
        }
    }
}

