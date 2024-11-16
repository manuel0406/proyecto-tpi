package com.tpi.gpdrl.Administracion.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Empleados")
public class EmpleadoController {

    @GetMapping("/listadoEmpleado")
    public String verEmpleado(Model model) {

        model.addAttribute("titulo", "Listado empleado");
        return "Empleado/listadoEmpleado";
    }
}
