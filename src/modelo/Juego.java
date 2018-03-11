package modelo;

import java.time.LocalDate;

public class Juego extends Material{
	
	private int edadMinima;

	public Juego(String codigo, String titulo, LocalDate fechaAlta, int edadMinima) {
		super(codigo, titulo, fechaAlta);
		this.edadMinima = edadMinima;

	}

	public int getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}

	@Override
	public String toString() {
		return super.toString() + "Juego [edadMinima= " + edadMinima + "]\n";
	}
	
	

}
