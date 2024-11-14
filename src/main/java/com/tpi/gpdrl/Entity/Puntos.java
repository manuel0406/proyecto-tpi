package com.tpi.gpdrl.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Puntos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPuntos;
    private int cantidadPuntos;
    private Date fechaVencimientoPuntos;

    @ManyToOne
    Cliente cliente;

    public Puntos() {
    }

    public Puntos(int cantidadPuntos, Date fechaVencimientoPuntos, Cliente cliente) {
        this.cantidadPuntos = cantidadPuntos;
        this.fechaVencimientoPuntos = fechaVencimientoPuntos;
        this.cliente = cliente;
    }

    public Puntos(int idPuntos, int cantidadPuntos, Date fechaVencimientoPuntos, Cliente cliente) {
        this.idPuntos = idPuntos;
        this.cantidadPuntos = cantidadPuntos;
        this.fechaVencimientoPuntos = fechaVencimientoPuntos;
        this.cliente = cliente;
    }

    public int getIdPuntos() {
        return idPuntos;
    }

    public void setIdPuntos(int idPuntos) {
        this.idPuntos = idPuntos;
    }

    public int getCantidadPuntos() {
        return cantidadPuntos;
    }

    public void setCantidadPuntos(int cantidadPuntos) {
        this.cantidadPuntos = cantidadPuntos;
    }

    public Date getFechaVencimientoPuntos() {
        return fechaVencimientoPuntos;
    }

    public void setFechaVencimientoPuntos(Date fechaVencimientoPuntos) {
        this.fechaVencimientoPuntos = fechaVencimientoPuntos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
