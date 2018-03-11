package modelo;

public class Alumno {

	private String codMatricula;
	private String grupo;
	private String nombre;
	private Prestamo historialPrestamos;
	
	public Alumno(String codMatricula, String grupo, String nombre) {
		super();
		this.codMatricula = codMatricula;
		this.grupo = grupo;
		this.nombre = nombre;
		this.historialPrestamos = new Prestamo(this);
	}

	

	public void addUnPrestamo(Material miMaterial, String fechaPrestado) {
		if (this.historialPrestamos.getListaPrestamos().size()<10) {
		this.historialPrestamos.getListaPrestamos().add(miMaterial);
		int indiceMaximoActual = this.historialPrestamos.getListaPrestamos().size()-1;
		this.historialPrestamos.getListadoFechaPrestamos()[indiceMaximoActual] = fechaPrestado;
		} else {
			System.out.println("Ya tiene un máximo de 10 prestamos, no puede seguir acumulandolos hasta que libere alguno. Gracias");
		}
	}

	public Prestamo getMisPrestamos() {
		return historialPrestamos;
	}

	public String getCodMatricula() {
		return codMatricula;
	}


	public String getGrupo() {
		return grupo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setCodMatricula(String codMatricula) {
		this.codMatricula = codMatricula;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Alumno [codMatricula=" + codMatricula + ", grupo=" + grupo + ", nombre=" + nombre + "]";
	}
	
	
	
	
}
