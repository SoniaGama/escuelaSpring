package com.prueba.web.servicesImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.web.listas_enum.*;
import com.prueba.web.serviciesInterface.*;

@Service
public class Menu implements MenuInterface {

	@Autowired
	private AddDeleteInterface addDelete;

	@Autowired
	private ShowInterface show;

	@Autowired
	private InitInterface init;

	private Map<String, Integer> alumnosNacionalidad = new HashMap<String, Integer>();

	@Override
	public void menu() {
		System.out.println("¿Que desea hacer?");
		for (MenuPrincipal menu : MenuPrincipal.values()) {
			System.out.println(menu.ordinal() + ": " + menu.getMenu());
		}
	}

	@Override
	public void queNacionalidad() {
		System.out.println("Que nacionalidad: \n");
		for (Nacionalidades nacionalidades : Nacionalidades.values()) {
			System.out.println("Opción " + nacionalidades.ordinal() + ": " + nacionalidades.getNacionalidad());
			// String nac = nacionalidades.getNacionalidad();
		}
	}

	@Override
	public void escogerMetodo() {
		init.init(alumnosNacionalidad);
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean salir = false;
		while (!salir) {
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case (0):
				queNacionalidad();
				Scanner sc1 = new Scanner(System.in);
				Integer opcion1 = sc1.nextInt();
				for (Nacionalidades nacionalidades : Nacionalidades.values()) {
					Integer ordinal = nacionalidades.ordinal();
					if (ordinal.equals(opcion1)) {
						addDelete.addAlumno(alumnosNacionalidad, nacionalidades.getNacionalidad());
					}
				}
				break;

			case (1):

				show.showAll(alumnosNacionalidad);
				break;

			case (2):
				queNacionalidad();
				Scanner sc2 = new Scanner(System.in);
				Integer opcion2 = sc2.nextInt();
				for (Nacionalidades nacionalidades : Nacionalidades.values()) {
					Integer ordinal = nacionalidades.ordinal();
					if (ordinal.equals(opcion2)) {
						show.showNacionalidad(alumnosNacionalidad, nacionalidades.getNacionalidad());
					}
				}
				break;

			case (3):
				show.cuantos(alumnosNacionalidad);
				break;

			case (4):
				queNacionalidad();
				Scanner sc3 = new Scanner(System.in);
				Integer opcion3 = sc3.nextInt();
				for (Nacionalidades nacionalidades : Nacionalidades.values()) {
					Integer ordinal = nacionalidades.ordinal();
					if (ordinal.equals(opcion3)) {
						addDelete.borra(alumnosNacionalidad, nacionalidades.getNacionalidad());
					}
				}
				break;

			case (5):
				sc.close();
				salir = true;
				break;
			}
		}
	}

}
