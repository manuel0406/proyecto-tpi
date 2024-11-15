package com.tpi.gpdrl.Cliente.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tpi.gpdrl.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
    
}
