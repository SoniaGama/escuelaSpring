package com.prueba.web.servicesImpl;

import java.util.Map;
import org.springframework.stereotype.Service;
import com.prueba.web.listas_enum.*;
import com.prueba.web.serviciesInterface.*;

@Service
public class Init implements InitInterface {

	@Override
	public void init(Map<String, Integer> hash) {
		for (Nacionalidades nacionalidades : Nacionalidades.values()) {
			hash.put(nacionalidades.toString(), 0);
		}
	}
	
}
