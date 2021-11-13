package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class SistemaSupermercado implements SistemaDeVentas
{
    private String nombre;
    private HashSet<ProductoDeSuper> productosVenta;
    private HashMap<String, Integer> productosOrdenados;

    public SistemaSupermercado(String nombre, HashSet<ProductoDeSuper> productosVenta, HashMap<String, Integer> productosOrdenados) {
        this.nombre = nombre;
        this.productosVenta = productosVenta;
        this.productosOrdenados = productosOrdenados;
    }

    public SistemaSupermercado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<ProductoDeSuper> getProductosVenta() {
        return productosVenta;
    }

    public void setProductosVenta(HashSet<ProductoDeSuper> productosVenta) {
        this.productosVenta = productosVenta;
    }

    public HashMap<String, Integer> getProductosOrdenados() {
        return productosOrdenados;
    }

    public void setProductosOrdenados(HashMap<String, Integer> productosOrdenados) {
        this.productosOrdenados = productosOrdenados;
    }

    @Override
    public float gananciaTotalObtenida() {
        return 0;
    }

    @Override
    public float ingresosTotales() {
        return 0;
    }

    @Override
    public int cantidadDeProductosVendidos() {
        return 0;
    }

    public void agregarProductoVendido() throws InputMismatchException {

            int opcion;
            Scanner ingresarDatos = new Scanner(System.in);
            Scanner ingresarOpcion = new Scanner(System.in);
            String nombre = ingresarDatos.nextLine();
            String origen = ingresarDatos.nextLine();
            String codigo = ingresarDatos.nextLine();
            float costo = ingresarDatos.nextFloat();
            // opcion 1 : alimentos ; 2 : electricos
            opcion = ingresarOpcion.nextInt();
            if(opcion == 1){
                Integer cantDiasParaVencerse = ingresarDatos.nextInt();
                float DESCUENTO = ingresarDatos.nextFloat();
                opcion = ingresarOpcion.nextInt();
                // opcion 1 : noPerecedero ; 2 : Perecedero
                if(opcion == 1){
                    float mgDeSodio = ingresarDatos.nextFloat();
                    ProductoNoPerecedero nuevoProducto = new ProductoNoPerecedero(nombre, origen, codigo, costo, cantDiasParaVencerse, mgDeSodio);
                }
                else if(opcion == 2){
                    float temperaturaMinimaDeFrio = ingresarDatos.nextFloat();
                    ProductoPerecedero nuevoProducto = new ProductoPerecedero(nombre, origen, codigo, costo, cantDiasParaVencerse, temperaturaMinimaDeFrio);
                }
            }
            else if(opcion == 2){
                Integer cantDiasDeGarantia = ingresarDatos.nextInt();
                float RECARGO_POR_ENVIO = ingresarDatos.nextFloat();
                // opcion 1 : Calefaccion ; 2 : Refrigeracion
                opcion = ingresarOpcion.nextInt();
                if(opcion == 1){
                    float wattsDePotenciaMax = ingresarDatos.nextFloat();
                    ProductoDeCalefaccion nuevoProducto = new ProductoDeCalefaccion(nombre, origen, codigo, costo, cantDiasDeGarantia, wattsDePotenciaMax);
                }
                else if(opcion == 2){
                    float litrosDeCapacidad = ingresarDatos.nextFloat();
                    ProductoDeRefrigeracion nuevoProducto = new ProductoDeRefrigeracion(nombre, origen, codigo, costo, cantDiasDeGarantia, litrosDeCapacidad);
                }
            }
            throw new InputMismatchException("ERROR vuelva a ingresar los datos del producto.");
    }

    public static void archivoJson(String obejtoJson, HashMap<String, Object> objeto) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        File archivo = new File("src/com/company/personas.json");
        mapper.writeValue(archivo,objeto);
        throw new IOException();
    }

    public static String JSONSUpermercado(SistemaSupermercado supermercado) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String,Object> mapASerializar = new HashMap<>();
        mapASerializar.put("Supermercado", supermercado);
        String objetoJson = mapper.writeValueAsString(mapASerializar);
        archivoJson(objetoJson, mapASerializar);
        return objetoJson;
    }

    public static HashMap<String, Object> objetoAJson (SistemaSupermercado supermercado) throws IOException {
        String json = JSONSUpermercado(supermercado);
        ObjectMapper mapper2 = new ObjectMapper();
        HashMap map1 = mapper2.readValue(json,HashMap.class);
        return map1;
    }


}
