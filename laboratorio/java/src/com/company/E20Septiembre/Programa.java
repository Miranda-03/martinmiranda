package com.company.E20Septiembre;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Integer numConductores;
    private String operador;
    private String categoria;
    private String musicalizador;
    private ArrayList<String> estilosMusica;
    private LocalDateTime horaInicio;
    private LocalDateTime horaFinal;

    public Programa(String nombre, Integer numConductores, String operador, String categoria,  LocalDateTime horaInicio,  LocalDateTime horaFinal) {
        this.nombre = nombre;
        this.numConductores = numConductores;
        this.operador = operador;
        this.categoria = categoria;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public Programa(String nombre, Integer numConductores, String operador, String categoria, String musicalizador, ArrayList<String> estilosMusica,  LocalDateTime horaInicio,  LocalDateTime horaFinal) {
        this.nombre = nombre;
        this.numConductores = numConductores;
        this.operador = operador;
        this.categoria = categoria;
        this.musicalizador = musicalizador;
        this.estilosMusica = estilosMusica;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public Programa() {
        estilosMusica = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumConductores() {
        return numConductores;
    }

    public void setNumConductores(Integer numConductores) {
        this.numConductores = numConductores;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMusicalizador() {
        return musicalizador;
    }

    public void setMusicalizador(String musicalizador) {
        this.musicalizador = musicalizador;
    }

    public ArrayList<String> getEstilosMusica() {
        return estilosMusica;
    }

    public void setEstilosMusica(ArrayList<String> estilosMusica) {
        this.estilosMusica = estilosMusica;
    }

    public  LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio( LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public  LocalDateTime getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal( LocalDateTime horaFinal) {
        this.horaFinal = horaFinal;
    }
}
