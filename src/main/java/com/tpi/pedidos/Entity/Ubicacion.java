package com.tpi.pedidos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUbicacion;
    private String direccion;
    @ManyToOne
    Cliente cliente;

    public Ubicacion() {
    }

    public Ubicacion(String direccion, Cliente cliente) {
        this.direccion = direccion;
        this.cliente = cliente;
    }

    public Ubicacion(int idUbicacion, String direccion, Cliente cliente) {
        this.idUbicacion = idUbicacion;
        this.direccion = direccion;
        this.cliente = cliente;
    }

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
