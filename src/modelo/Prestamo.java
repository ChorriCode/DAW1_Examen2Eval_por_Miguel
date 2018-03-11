package modelo;

import java.util.ArrayList;
import java.util.Arrays;

public class Prestamo {
	
	ArrayList<Material> listaPrestamos = new ArrayList<Material>();
	String[] listadoFechaPrestamos = new String[10];
	static ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
	
	public Prestamo(Alumno unAlumno) {
		Prestamo.listaAlumnos.add(unAlumno);
	}



	public static ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public static void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		Prestamo.listaAlumnos = listaAlumnos;
	}



	public ArrayList<Material> getListaPrestamos() {
		return listaPrestamos;
	}


	public String[] getListadoFechaPrestamos() {
		return listadoFechaPrestamos;
	}


	public void setListaPrestamos(ArrayList<Material> listaPrestamos) {
		this.listaPrestamos = listaPrestamos;
	}


	public void setListadoFechaPrestamos(String[] listadoFechaPrestamos) {
		this.listadoFechaPrestamos = listadoFechaPrestamos;
	}



	@Override
	public String toString() {
		return "Prestamo \n" + listaPrestamos + "\n listadoFechaPrestamos="
				+ Arrays.toString(listadoFechaPrestamos);
	}

	
	
}
