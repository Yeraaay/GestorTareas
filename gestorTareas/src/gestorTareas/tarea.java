package gestorTareas;

import java.util.Date;

public class Tarea {
	
	protected String titulo;
	protected String descripcion;
	protected Date fecha;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	public Tarea(String titulo, String descripcion, Date fecha) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}
	
	public String toString() {
		return "Tarea [titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}


}