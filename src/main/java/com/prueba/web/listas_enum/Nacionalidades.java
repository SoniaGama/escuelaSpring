package com.prueba.web.listas_enum;

public enum Nacionalidades {
	MEXICANA("MEXICANA"),
	ESTADOUNIDENSE("ESTADOUNIDENSE"),
	BRASILENO("BRASILENO"),
	PERUANO("PERUANO"),
	PORTUGAL("PORTUGAL");

	private String nacionalidad;

	private Nacionalidades(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}	
}
