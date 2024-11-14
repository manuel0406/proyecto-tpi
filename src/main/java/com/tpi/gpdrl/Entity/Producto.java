package com.tpi.gpdrl.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
    private String nombreProducto;
    private String tipoProducto;
    private String descripcionProducto;
    private double precioProducto;
    private boolean existenciaProducto;

    public Producto() {
    }

    public Producto(int idProducto, String nombreProducto, String tipoProducto, String descripcionProducto,
            double precioProducto, boolean existenciaProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.existenciaProducto = existenciaProducto;
    }

    public Producto(String nombreProducto, String tipoProducto, String descripcionProducto, double precioProducto,
            boolean existenciaProducto) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.descripcionProducto = descripcionProducto;
        this.precioProducto = precioProducto;
        this.existenciaProducto = existenciaProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public boolean isExistenciaProducto() {
        return existenciaProducto;
    }

    public void setExistenciaProducto(boolean existenciaProducto) {
        this.existenciaProducto = existenciaProducto;
    }

}
