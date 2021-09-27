package com.company.E27Septiembre;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Tienda {
    private HashMap<Producto, Integer> productosVendidos;
    private HashSet<Producto> productos;

    public Tienda(){
        productosVendidos = new HashMap<>();
        productos = new HashSet<>();
    }

    public Tienda(HashMap<Producto, Integer> productosVendidos, HashSet<Producto> productos) {
        this.productosVendidos = productosVendidos;
        this.productos = productos;
    }

    public HashMap<Producto, Integer> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(HashMap<Producto, Integer> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public HashSet<Producto> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<Producto> productos) {
        this.productos = productos;
    }

    public void registrarVenta(Producto producto){
        if(this.productosVendidos.containsKey(producto)){
            Integer precioViejo = this.productosVendidos.get(producto);
            this.productosVendidos.put(producto,precioViejo + 1);
        }
        else {
            this.productosVendidos.put(producto,1);
        }
    }

    public HashSet<Producto> productosVendidos5veces(){
        HashSet<Producto> productosVendidos5 = new HashSet<>();
        for(Map.Entry<Producto, Integer> entry : productosVendidos.entrySet()){
            if(entry.getValue() == 5){
                productosVendidos5.add(entry.getKey());
            }
        }
        return productosVendidos5;
    }

    public HashSet<String> productosVendieron(){
        HashSet<String> productos = new HashSet<>();
        for(Map.Entry<Producto, Integer> entry : productosVendidos.entrySet()){
            productos.add(entry.getKey().getNombre());
        }
        return productos;
    }

}
