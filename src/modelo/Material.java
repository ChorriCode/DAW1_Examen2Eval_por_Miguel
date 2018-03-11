package modelo;

import java.time.LocalDate;

public class Material {
	
	private String codigo;
	private String titulo;
	private LocalDate fechaAlta;
	
	
	public Material(String codigo, String titulo, LocalDate fechaAlta) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.fechaAlta = fechaAlta;
	}


	public String getCodigo() {
		return codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public LocalDate getFechaAlta() {
		return fechaAlta;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	@Override	
	public String toString() {
		return "codigo= " + codigo + ", titulo= " + titulo + ", fechaAlta= " + fechaAlta;
	}
	
	
	

}
