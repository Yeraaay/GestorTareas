package Metodos;
import java.util.Scanner;

import gestorTareas.Tarea;

public class eliminarTarea {

	static Scanner sc = new Scanner(System.in);

	public static void eliminarTarea() {
		System.out.println("introduce el titulo de la tarea que desea eliminar :");
		String titulo=sc.nextLine();

		for(Tarea t: menu.lista) {
			if(t.titulo.equals(titulo)) {
				t=null;
				System.out.println("tarea borrada");
			}else {
				System.out.println("no se ha encontrado tarea con ese titulo");
			}
		}

	}
}