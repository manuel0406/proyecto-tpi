package com.tpi.gpdrl.Programa_lealtad.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Programa_lealtad.Repository.CuponRepository;

@Service
public class CuponService {
    @Autowired
    private CuponRepository cuponRepository;
    
}
