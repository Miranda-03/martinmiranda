package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        ArrayList<Libro> libros = new ArrayList<>();
        HashMap<String,Integer> vendidos = new HashMap<>();
        String nombre;
        float precio = 0.0f;
        String editorial;
        boolean block = false;
        int opcion;
        Scanner ingresar = new Scanner(System.in);

        vendidos.put("Kapelusz", 0);
        vendidos.put("Sudamericana", 0);
        vendidos.put("Atlántida", 0);
        vendidos.put("ElAteneo", 0);
        vendidos.put("Interzona", 0);
        vendidos.put("Sur", 0);
        vendidos.put("Alianza", 0);

        while(block == false){
            System.out.println("ingrese los datos del libro");
            System.out.println("Nombre:");
            nombre = ingresar.nextLine();
            System.out.println("Precio:");
            precio = ingresar.nextFloat();
            ingresar.nextLine();
            System.out.println("Editorial:");
            editorial = ingresar.nextLine();

            Libro libnew = new Libro(nombre, precio, editorial);

            libros.add(libnew);

            System.out.println("¿terminar?");
            opcion = ingresar.nextInt();
            if(opcion == 0){
                break;
            }
        }

        Integer aux = new Integer();
        for(Libro libT : libros){
            if(libT.getNombreEditorial() == "Kapelusz"){
            }
        }



    }
}
