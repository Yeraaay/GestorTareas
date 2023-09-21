package metodos;

import gestorTareas.Tarea;

public class mostrarTareas {
	
	public void mostrarTareas() {
		for (Tarea tarea: menu.lista) {
			System.out.println(tarea.toString());
		}
	}
}
