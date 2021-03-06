package com.company.E5JulioACyBA;

public class Pedidos {

    private Persona personaPedido;
    private String nombrePedido;
    private String nombrePlatoPedido;
    private String fechaCreacion;
    private String horaEntrega;
    private boolean entregado = false;

    public Pedidos(){}

    public Pedidos( String nombrePedido, Persona personaPedido, String nombrePlatoPedido, String fechaCreacion, String horaEntrega, boolean entregado){
        this.personaPedido = personaPedido;
        this.nombrePlatoPedido = nombrePlatoPedido;
        this.fechaCreacion = fechaCreacion;
        this.horaEntrega = horaEntrega;
        this.entregado = entregado;
        this.nombrePedido = nombrePedido;
    }

    public Persona getPersonaPedido() {
        return personaPedido;
    }

    public void setPersonaPedido(Persona personaPedido) {
        this.personaPedido = personaPedido;
    }

    public String getNombrePlatoPedido() {
        return nombrePlatoPedido;
    }

    public void setNombrePlatoPedido(String nombrePlatoPedido) {
        this.nombrePlatoPedido = nombrePlatoPedido;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getNombrePedido() {
        return nombrePedido;
    }

    public void setNombrePedido(String nombrePedido) {
        this.nombrePedido = nombrePedido;
    }

}
