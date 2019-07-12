package com.prueba.web.servicesImpl;

import java.util.Map;
import org.springframework.stereotype.Service;
import com.prueba.web.serviciesInterface.*;

@Service
public class AddDelete implements AddDeleteInterface {

	@Override
	public void addAlumno(Map<String, Integer> hash, String nacionalidad) {
		// AÃ±ade la nacionalidad de un nuevo alumno
		Integer value = hash.get(nacionalidad);
		if (hash.containsKey(nacionalidad)) {
			value++;
			hash.put(nacionalidad, value);
		} else {
			System.out.println("Nacionalidad no encontrada");
		}
	}

	@Override
	public void borra(Map<String, Integer> hash, String nacionalidad) {
		// Borra la nacionalidad
		if (hash.containsKey(nacionalidad)) {
			// hash.remove(nacionalidad);
			// Si se borra despues no puede ser aÃ±Ã±adida a no ser encontrada como key
			hash.put(nacionalidad, 0);
		} else {
			System.out.println("Nacionalidad no encontrada");
		}
	}

}
