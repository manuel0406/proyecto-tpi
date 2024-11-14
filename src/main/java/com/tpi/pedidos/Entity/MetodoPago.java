package com.tpi.pedidos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MetodoPago {
    @Id
    private int idPago;
    private String tipoPago;

    
    public MetodoPago() {
    }

    public MetodoPago(int idPago, String tipoPago) {
        this.idPago = idPago;
        this.tipoPago = tipoPago;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    
}
