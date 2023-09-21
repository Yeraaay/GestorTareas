package gestorTareas;

import java.time.LocalDate;

public class Tarea {
	
	//Atributos
	public static String titulo;
	public static String descripcion;
	public static LocalDate fecha;
	
	//Metodos (Setter y Getter)
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		Tarea.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	//Constructores
	public Tarea(String titulo, String descripcion, LocalDate fecha) {
		super();
		Tarea.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}
	
	//Metodo toString
	public String toString() {
		return "Tarea [Titulo = " + titulo + ", Descripcion = " + descripcion + ", Fecha = 0" + fecha + "]";
	}


}