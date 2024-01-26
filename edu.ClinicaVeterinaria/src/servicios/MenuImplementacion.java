package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	public int menuYSeleccion(Scanner sc) {
		System.out.println("Que quieres hacer");
		System.out.println("-------------------------------");
		System.out.println("1. Cerrar menu");
		System.out.println("2. Crear un nuevo paciente");
		System.out.println("-------------------------------");
		int seleccion = sc.nextInt();
		return seleccion;
	}
}
