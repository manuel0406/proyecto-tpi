package com.tpi.gpdrl.Pedido.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Pedido.Repository.AsignacionRepository;

@Service
public class AsignacionService {
    @Autowired
    private AsignacionRepository asignacionRepository;
}
