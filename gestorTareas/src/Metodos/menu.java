package Metodos;
import java.util.*;
import gestorTareas.Tarea;

public class menu {
	
	static Scanner sc = new Scanner(System.in);
	
	//Generamos una lista para almacenar las tareas
	static List<Tarea> lista = new ArrayList<Tarea>();
	
	public static void Menu() {
		
		
		String opcion = "";
		
		do {
			System.out.println("\n\n ELIGE UNA OPCION \n\n"
					+ "(PULSA 1) Añadir Tarea. \n"
					+ "(PULSA 2) Modificar Tarea. \n"
					+ "(PULSA 3) Listar Tareas. \n"
					+ "(PULSA 4) Eliminar Tarea. \n"
					+ "(PULSA 0) Salir. \n");

			opcion = sc.next();

			switch (opcion) {
			case "1":
				aniadirTarea.aniadirTarea();
				break;
			case "2":
				modificarTarea.menuModificar();
				break;
			case "3":
				mostrarTareas.mostrarTareas();
				break;
			case "4":
				eliminarTarea.eliminarTarea();
				break;
			case "0":
				System.out.println("Hasta luego!");
				System.exit(0);
				break;
			default:
				System.out.println("Error, Intentalo de nuevo.");
			}

		} while (true);

	}

}