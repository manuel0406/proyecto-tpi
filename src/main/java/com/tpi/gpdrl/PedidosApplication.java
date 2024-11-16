package com.tpi.gpdrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class PedidosApplication {

	@GetMapping("/")
	public String home(){
		return "index";
	}

	public static void main(String[] args) {
		SpringApplication.run(PedidosApplication.class, args);
	}

}
