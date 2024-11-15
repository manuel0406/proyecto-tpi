package com.tpi.gpdrl.Seguridad.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Seguridad.Repository.RolRepository;

@Service
public class RolService {
    @Autowired
    private RolRepository rolRepository;
    
}
