package com.example.configClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
public class AritmeticaController {
	
	
	@GetMapping("/SUMAR")
	public String sumar(@RequestParam("numero1") String numero1,@RequestParam("numero2") String numero2) {
		String suma = "";
		int numero = Integer.parseInt(numero1) + Integer.parseInt(numero2);
		suma = "" + numero1 + " + " + numero2 + " = " + numero;
		return suma;
	}
	
	@GetMapping("/RESTAR")
	public String restar(@RequestParam("numero1") String numero1,@RequestParam("numero2") String numero2) {
		String suma = "";
		int numero = Integer.parseInt(numero1) - Integer.parseInt(numero2);
		suma = "" + numero1 + " - " + numero2 + " = " + numero;
		return suma;
	}

	@GetMapping("/MULT")
	public String mult(@RequestParam("numero1") String numero1,@RequestParam("numero2") String numero2) {
		String suma = "";
		int numero = Integer.parseInt(numero1) * Integer.parseInt(numero2);
		suma = "" + numero1 + " * " + numero2 + " = " + numero;
		return suma;
	}
	
	@GetMapping("/DIVD")
	public String divd(@RequestParam("numero1") String numero1,@RequestParam("numero2") String numero2) {
		String suma = "";
		int numero = Integer.parseInt(numero1) / Integer.parseInt(numero2);
		suma = "" + numero1 + " / " + numero2 + " = " + numero;
		return suma;
	}



}
