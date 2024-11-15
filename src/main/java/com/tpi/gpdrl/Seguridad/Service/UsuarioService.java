package com.tpi.gpdrl.Seguridad.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Entity.Usuario;
import com.tpi.gpdrl.Seguridad.Repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private RolService rolService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void guardarUsuario(Usuario usuario){
        //falta
        usuarioRepository.save(usuario);
    }
    public Usuario guardarRetornarU(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
