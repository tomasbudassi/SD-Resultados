package com.example.demo.resultados.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class resultados {	
	
	@GetMapping("/resultado/{resultado}")
	public String resultado(@PathVariable  String resultado) {
		
		return "El Resultado es: " + resultado;
	}
}
