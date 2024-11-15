package com.tpi.gpdrl.Cliente.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Cliente.Repository.UbicacionRepository;

@Service
public class UbicacionService {
    @Autowired
    private UbicacionRepository ubicacionRepository;
}
