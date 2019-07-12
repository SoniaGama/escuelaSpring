package com.prueba.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.prueba.web.serviciesInterface.*;

@SpringBootApplication
public class EscuelaSpringApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EscuelaSpringApplication.class, args);
	}
	
	@Autowired
	private MenuInterface menu;
	
	@Override
	public void run(String... args){
		try {
			menu.escogerMetodo();
		}catch(Exception ex) {
			ex.getCause();
			ex.getMessage();
			ex.printStackTrace();
		}
				
	}
	
	/*
	Map<String, Integer> alumnosNacionalidad = new HashMap<String, Integer>();
	
	MEnu ElegirMetodo elegirMetodo = new ElegirMetodo();		
			
	metodo.init(alumnosNacionalidad);	
	elegirMetodo.escogerMetodo(alumnosNacionalidad);*/

}
