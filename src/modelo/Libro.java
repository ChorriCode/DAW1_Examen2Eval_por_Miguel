package modelo;

import java.time.LocalDate;

public class Libro extends Material{
	
	private int numPaginas;



	public Libro(String codigo, String titulo, LocalDate fechaAlta, int numPaginas) {
		super(codigo, titulo, fechaAlta);
		this.numPaginas = numPaginas;
	}



	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}


	public String toString() {
		return super.toString() + " Libro [numPaginas= " + numPaginas + "]\n";
	}








	

}
