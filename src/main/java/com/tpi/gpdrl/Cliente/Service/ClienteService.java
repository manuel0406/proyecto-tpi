package com.tpi.gpdrl.Cliente.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Cliente.Repository.ClienteRepository;
import com.tpi.gpdrl.Entity.Cliente;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public void guardarCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    
}
