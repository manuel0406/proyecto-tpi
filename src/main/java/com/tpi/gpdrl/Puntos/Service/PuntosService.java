package com.tpi.gpdrl.Puntos.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Entity.Puntos;
import com.tpi.gpdrl.Puntos.Repository.PuntosRepository;

@Service
public class PuntosService {
    @Autowired
    private PuntosRepository puntosRepository;

    // public Integer suma(int idCliente){
    //     return puntosRepository.sumaPuntos(idCliente);

    // }

    public List<Puntos> listadoPuntosCliente(int idCliente){

        return puntosRepository.listadoPuntos(idCliente);
    }
}
