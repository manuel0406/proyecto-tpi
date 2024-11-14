package com.tpi.pedidos.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String correoUsuario;
    private String contraseniaUsuario;
    public Usuario() {
    }
    public Usuario(int idUsuario, String correoUsuario, String contraseniaUsuario) {
        this.idUsuario = idUsuario;
        this.correoUsuario = correoUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }
    public Usuario(String correoUsuario, String contraseniaUsuario) {
        this.correoUsuario = correoUsuario;
        this.contraseniaUsuario = contraseniaUsuario;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getCorreoUsuario() {
        return correoUsuario;
    }
    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }
    public String getContraseniaUsuario() {
        return contraseniaUsuario;
    }
    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }

}
