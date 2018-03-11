package modelo;

import java.time.LocalDate;

public class Revista extends Material {
	
	private int numero;
	private String descripcion;
	
	
	public Revista(String codigo, String titulo, LocalDate fechaAlta, int numero, String descripcion) {
		super(codigo, titulo, fechaAlta);
		this.numero = numero;
		this.descripcion = descripcion;
	}


	public int getNumero() {
		return numero;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public String toString() {
		return super.toString() + "Revista [numero= " + numero + ", descripcion= " + descripcion + "]\n";
	}


	
	

}
