package com.tpi.gpdrl.Repartidor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Repartidor.Repository.RepartidorRepository;

@Service
public class RepartidorService {
    @Autowired
    private RepartidorRepository repartidorRepository;
}
