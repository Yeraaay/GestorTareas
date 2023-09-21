package Metodos;

import gestorTareas.Tarea;

public class mostrarTareas {
	
	public static void mostrarTareas() {
		for (Tarea tarea: menu.lista) {
			System.out.println(tarea.toString());
		}
	}
}
