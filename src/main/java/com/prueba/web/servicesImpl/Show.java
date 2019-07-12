package com.prueba.web.servicesImpl;

import java.util.Iterator;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.prueba.web.serviciesInterface.*;

@Service
public class Show implements ShowInterface {

	@Override
	public void showAll(Map<String, Integer> hash) {
		// Muestra el nÃºmero de alumnos por nacionalidad
		Iterator iterator = hash.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();
			System.out.println(alumnos.getKey() + ": " + alumnos.getValue());
		}
	}

	@Override
	public void showNacionalidad(Map<String, Integer> hash, String nacionalidad) {
		// Muestra el nÃºmero de alumnos por nacionalidad y alumnos de esa nacionalidad
		if (hash.containsKey(nacionalidad)) {
			System.out.println(nacionalidad + ": " + hash.get(nacionalidad));
		} else {
			System.out.println("Nacionalidad no encontrada");
		}
	}

	@Override
	public void cuantos(Map<String, Integer> hash) {
		// Muestra cuantas nacionalidades diferentes hay en la escuela
		Iterator iterator = hash.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry alumnos = (Map.Entry) iterator.next();
			System.out.println(alumnos.getKey());
		}
	}
	
	

}
