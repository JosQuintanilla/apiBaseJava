package cl.prueba.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {

	private static final String version = "0.0.1";
	
	@GetMapping("/healCheck")
	public String healCheck() {
		
		return version;
	}

}