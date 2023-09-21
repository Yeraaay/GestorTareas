package Metodos;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import gestorTareas.Tarea;

public class aniadirTarea {

	static Scanner sc = new Scanner(System.in);

	public static void aniadirTarea() {
		System.out.println("introduce el titulo de la tarea :");
		String titulo=sc.nextLine();
		System.out.println("introduce una descripcion de la tarea :");
		String descrip=sc.nextLine();
		System.out.println("introduce la fecha en formato aaaa-mm-dd");
		String fecha=sc.next();
		sc.close();
		String[]partes =fecha.split("-");
		String anio=partes[0];
		String mes = partes[1];
		String dia = partes[2];
		int anioint= Integer.parseInt(anio);
		int mesint= Integer.parseInt(mes);
		int diaint= Integer.parseInt(dia);
		
		LocalDate fechaformat = LocalDate.of(anioint, mesint, diaint);
		Tarea tarea=new Tarea(titulo,descrip,fechaformat);
		menu.lista.add(tarea);
		
	}
}
