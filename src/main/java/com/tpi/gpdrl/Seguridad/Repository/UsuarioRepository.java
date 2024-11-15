package com.tpi.gpdrl.Seguridad.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpi.gpdrl.Entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    
}
