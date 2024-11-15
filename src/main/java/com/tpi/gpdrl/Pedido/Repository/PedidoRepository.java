package com.tpi.gpdrl.Pedido.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tpi.gpdrl.Entity.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido,Integer> {
    
}
