package com.company.Examen29;

public class Visitante {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer numeroSala;
    private Integer numeroAsiento;
    private String fecha;

    public Visitante(Integer id, String nombre, String apellido, Integer numeroSala, Integer numeroAsiento, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSala = numeroSala;
        this.numeroAsiento = numeroAsiento;
        this.fecha = fecha;
    }

    public Visitante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public Integer getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(Integer numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
