package com.company;
import java.util.Scanner;
import java.util.ArrayList;




public class Productos26Abril {


    public static void main(String[] args) {

        int opcion;
        boolean bloqueo = true;
        String nombre;
        String nombreEliminar;
        float precio;

        Scanner ingresar = new Scanner(System.in);

        SistemaDeRegistro nuevoSistema = new SistemaDeRegistro();
        while (bloqueo == true){
            nuevoSistema.iniciarSistema();
            opcion = ingresar.nextInt();

            if (opcion == 1){
                producto2 px = new producto2();
                nombre = ingresar.nextLine();
                System.out.println("Nombre del producto: ");
                nombre = ingresar.nextLine();
                System.out.println("Precio del producto: ");
                precio = ingresar.nextFloat();
                px.setNombre(nombre);
                px.setPrecio(precio);
                nuevoSistema.registrarProducto(px);
            }
            else if(opcion == 2){
                nombreEliminar = ingresar.nextLine();
                System.out.println("ingrese nombre del producto a eliminar");
                nombreEliminar = ingresar.nextLine();
                nuevoSistema.eliminarProducto(nombreEliminar);
            }
            else if(opcion == 3){
                nuevoSistema.verLista();
            }
            else if(opcion == 4){
                bloqueo = false;
            }
        }

    }
}
