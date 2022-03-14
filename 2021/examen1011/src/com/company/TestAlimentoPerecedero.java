package com.company;


import org.junit.Test;
import static org.junit.Assert.*;

public class TestAlimentoPerecedero {

    @Test
    public void casoCalcularPrecioFinal(){
        ProductoPerecedero producto = new ProductoPerecedero("nombre", "Argentina", 231, 120.f, 44, 5);
        ProductoAlimenticio.setDESCUENTO(20);
        Float precioFinal = producto.calcularPrecioFinal();
        boolean precio = precioFinal == 104.f;
        assertTrue(precio);
    }

}
