package com.prueba.web.serviciesInterface;

import java.util.Map;

public interface ShowInterface {
	void showAll(Map<String, Integer> hash);
	void showNacionalidad(Map<String, Integer> hash, String nacionalidad);
	void cuantos(Map<String, Integer> hash);
}
