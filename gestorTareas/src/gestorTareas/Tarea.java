package gestorTareas;

import java.time.LocalDate;
import java.util.Date;

public class Tarea {
	
	static protected String titulo;
	protected String descripcion;
	protected LocalDate fecha;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
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
	
	public static void asjfa() {
		
	}
	
	public Tarea(String titulo, String descripcion, LocalDate fecha) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}
	
	public String toString() {
		return "Tarea [titulo= " + titulo + ", descripcion= " + descripcion + ", fecha= " + fecha + "]";
	}


}