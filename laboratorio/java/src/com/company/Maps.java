package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.HashMap;

public class Maps {

    private static HashSet<String> descuentos = new HashSet<>();

    public static void setEditoriales(String edit){
        descuentos.add(edit);
    }

    public static void mostrarVenta(HashSet<Cliente> clientes, HashMap<Integer, String> info, int id){
        for(Cliente aux : clientes){
            if(aux.getID() == id){
                System.out.println(aux.getHashMap());
                System.out.println(info.get(id));
                break;
            }
        }
    }


    public static void main(String[] args) {

        HashSet<String> descuentos = new HashSet<>();
        ArrayList<Libro> libros = new ArrayList<>();
        HashMap<String,Integer> vendidos = new HashMap<>();
        HashMap<String,Integer> cantCliente = new HashMap<>();
        HashMap<Integer, String> informacionVenta = new HashMap<>();
        HashSet<Cliente> clientes = new HashSet<>();
        String infoLibros = "Libros: ";
        String nombre;
        String EditorialDescuento;
        float precio = 0.0f;
        String editorial;
        String editorialDescuento;
        boolean block = false;
        Integer cantidadLibro;
        int opcion;
        int ID;
        float PrecioTotal = 0;
        Scanner ingresar = new Scanner(System.in);

        while(true){
            editorialDescuento = ingresar.nextLine();
            if(editorialDescuento.equals("terminar")) {
                break;
            }
            else{
                setEditoriales(editorialDescuento);
            }
        }


        vendidos.put("Kapelusz", 0);
        vendidos.put("Sudamericana", 0);
        vendidos.put("Atlántida", 0);
        vendidos.put("ElAteneo", 0);
        vendidos.put("Interzona", 0);
        vendidos.put("Sur", 0);
        vendidos.put("Alianza", 0);

        System.out.print("ID de cliente: ");
        ID = ingresar.nextInt();

        while(block == false){
            System.out.println("ingrese los datos del libro");
            System.out.print("Nombre: ");
            nombre = ingresar.nextLine();
            System.out.print("Precio: ");
            precio = ingresar.nextFloat();
            ingresar.nextLine();
            System.out.print("Editorial: ");
            while(true) {
                editorial = ingresar.nextLine();
                if (!editorial.equals("Kapelusz") && !editorial.equals("Sudamericana") && !editorial.equals("Atlántida") && !editorial.equals("ElAteneo") && !editorial.equals("Interzona") && !editorial.equals("Sur") && !editorial.equals("Alianza")) {
                    System.out.print("Nombre incorrecto: ");
                }
                else{
                    break;
                }
            }
            System.out.println("Cantidad: ");
            cantidadLibro = ingresar.nextInt();


            for(String nomAux : descuentos){
                if(nomAux == nombre){
                    precio = precio/2;
                }
            }

            Libro libnew = new Libro(nombre, precio, editorial);

            libros.add(libnew);

            cantCliente.put(nombre, cantidadLibro);

            PrecioTotal = PrecioTotal + (precio * cantidadLibro);

            System.out.print("¿terminar? '0' -> si: ");
            opcion = ingresar.nextInt();
            ingresar.nextLine();
            if(opcion == 0){
                block = true;
                infoLibros = infoLibros + nombre + ". Precio Total: " + String.valueOf(PrecioTotal);
                informacionVenta.put(ID, infoLibros);
            }
            else{
                infoLibros = infoLibros + nombre + ", ";
            }
        }

        Cliente newCliente = new Cliente(ID, cantCliente);
        clientes.add(newCliente);

        mostrarVenta(clientes, informacionVenta, ID);



        Integer aux;
        for(Libro libT : libros){
           String nom = libT.getNombreEditorial();
            aux = vendidos.get(nom);
            aux = aux + 1;
            vendidos.put(nom, aux);
        }

        System.out.println(vendidos);
    }
}
