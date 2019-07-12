package com.prueba.web.listas_enum;

public enum MenuPrincipal {
	ADD("Añadir la nacionalidad de un nuevo alumno"),
	NUMERO_ALUMNOS("Ver el numero de alumnos por nacionalidad"),
	NO_ALUMNOS_NACIONALIDAD("Ver el numero de alumnos de una nacionalidad"),
	NACIONALIDADES("Ver las nacionalidades de la escuela"),
	BORRAR("Borra una nacionalidad"),
	SALIR("Salir");
	
	private String menu;

	private MenuPrincipal(String menu){		
		this.menu = menu;
	}

	public String getMenu() {
		return menu;
	}
}
