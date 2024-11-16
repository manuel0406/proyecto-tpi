package com.tpi.gpdrl.Administracion.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Empleados")
public class EmpleadoController {
    
    @GetMapping("/listadoEmpleado")
    public String verEmpleado(){
        return "Empleado/listadoEmpleado";
    }
}
