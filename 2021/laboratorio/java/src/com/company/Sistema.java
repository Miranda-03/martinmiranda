package com.company;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<producto2> productos;

    public Sistema(){
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
        for (producto2 product: productos) {
            px = product;
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
        for (producto2 product2: productos) {
            px = product2;
            nombreAux = px.getNombre();
            if (nombreAux.equals(nombre)) {
                productos.remove(px);
                break;
            }
        }
    }
}
