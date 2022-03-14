package com.company.Practica10Noviembre;

import java.util.HashSet;

public interface Sistema {

    public Consumidor personaConMejorCoeficienteDeHidratacion();
    public Consumidor personaConPeorCoeficienteDeHidratacion();
    public HashSet<String> nombresDeBebidasConsumidas();
    public String nombreDeBebidaMasConsumida();

}
