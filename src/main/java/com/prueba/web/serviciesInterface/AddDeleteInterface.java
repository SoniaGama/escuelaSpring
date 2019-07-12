package com.prueba.web.serviciesInterface;

import java.util.Map;

public interface AddDeleteInterface {
	void addAlumno(Map<String, Integer> hash, String nacionalidad);
	void borra(Map<String, Integer> hash, String nacionalidad);
}
