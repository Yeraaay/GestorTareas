package Metodos;
import java.time.LocalDate;
import java.util.*;
import gestorTareas.Tarea;

public class modificarTarea {

	static Scanner sc = new Scanner(System.in);

	public static void menuModificar() {
		String opcion = "";

		System.out.println("\n\n Introduce la característica que quieras modificar \n\n"
				+ "1.- Modificar titulo. \n"
				+ "2.- Modificar descripcion. \n"
				+ "4.- Modificar fecha. \n");

		opcion = sc.next();

		switch (opcion) {
		case "1":
			modificarTitulo();
			break;
		case "2":
			modificarDescripcion();
			break;
		case "3":
			modificarfecha();
			break;
		default:
			System.out.println("Error, Intentalo de nuevo.");
		}
	}

	public static void modificarTitulo() {

		System.out.print("\n¿Seguro que quieres modificar el titulo de una tarea? (si / no)");
		String opcion = sc.next();
		if (opcion.equals("si")) {
			System.out.print("Introduce el titulo que quieras modificar: ");
			sc.nextLine();
			String antiguo_titulo = sc.nextLine();
			for (Tarea t: menu.lista) {
				if (t.titulo.equals(antiguo_titulo)) {
					System.out.print("Introduce el nuevo titulo: ");
					sc.nextLine();
					String nuevo_titulo = sc.nextLine();
					t.setTitulo(nuevo_titulo);
				}else System.out.println("No se ha encontrado ninguna tarea con dicho titulo, prueba de nuevo!");
			}
		}else if (opcion.equals("no")) System.out.println("Entonces nada, gracias!");
	}

	public static void modificarDescripcion() {
		System.out.println("\n¿Seguro que quiere cambiar la descripcion de una tarea? (si / no)");
		String opcion = sc.next();
		if(opcion.equals("si")) {
			System.out.print("Introduce el titulo de la descripcion que quieras modificar: ");
			sc.nextLine();
			String titulo = sc.nextLine();
			for (Tarea t: menu.lista) {
				if (t.titulo.equals(titulo)) {
					System.out.print("Introduce la nueva descripcion: ");
					sc.nextLine();
					String nueva_descripcion = sc.nextLine();
					t.setDescripcion(nueva_descripcion);
				}else System.out.println("No se ha encontrado ninguna tarea con dicho titulo, prueba de nuevo!");
			}
		}else if(opcion.equals("no")) System.out.println("Gracias, vuelva pronto!");
	}

	public static void modificarfecha() {
		System.out.println("\n¿Seguro que quiere cambiar la fecha de una tarea? (si / no)");
		String opcion = sc.next();
		if(opcion.equals("si")) {
			System.out.print("Introduce el titulo de la fecha que quieras modificar: ");
			sc.nextLine();
			String fecha = sc.nextLine();
			for (Tarea t: menu.lista) {
				if (t.titulo.equals(fecha)) {
					System.out.print("Introduce la nueva fecha: (Formato: aaaa-mm-dd)");
					String nueva_fecha = sc.next();
					String[] partes_fecha = nueva_fecha.split("-");
					String anio = partes_fecha[0];
					String mes = partes_fecha[1];
					String dia = partes_fecha[2];
					int anio_int = Integer.parseInt(anio);
					int mes_int = Integer.parseInt(mes);
					int dia_int = Integer.parseInt(dia);
					LocalDate fechaformato = LocalDate.of(anio_int, mes_int, dia_int);

					t.setFecha(fechaformato);
				}else System.out.println("No se ha encontrado ninguna tarea con dicho titulo, prueba de nuevo!");
			}
		}else if(opcion.equals("no")) System.out.println("Gracias, vuelva pronto!");
	}


}