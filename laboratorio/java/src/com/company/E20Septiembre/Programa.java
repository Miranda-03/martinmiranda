package com.company.E20Septiembre;

public class Programa {
    private String nombre;
    private Integer numConductores;
    private String operador;
    private String categoria;
    private String musicalizador;
    private String[] estilosMusica;
    private String horaInicio;
    private String horaFinal;

    public Programa(String nombre, Integer numConductores, String operador, String categoria, String horaInicio, String horaFinal) {
        this.nombre = nombre;
        this.numConductores = numConductores;
        this.operador = operador;
        this.categoria = categoria;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public Programa(String nombre, Integer numConductores, String operador, String categoria, String musicalizador, String[] estilosMusica, String horaInicio, String horaFinal) {
        this.nombre = nombre;
        this.numConductores = numConductores;
        this.operador = operador;
        this.categoria = categoria;
        this.musicalizador = musicalizador;
        this.estilosMusica = estilosMusica;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public Programa() {}

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

    public String[] getEstilosMusica() {
        return estilosMusica;
    }

    public void setEstilosMusica(String[] estilosMusica) {
        this.estilosMusica = estilosMusica;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }
}
