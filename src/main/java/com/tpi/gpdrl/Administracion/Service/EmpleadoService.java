package com.tpi.gpdrl.Administracion.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpi.gpdrl.Administracion.Repository.EmpleadoRepository;
import com.tpi.gpdrl.Entity.Empleado;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public void guardarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }

    
}
