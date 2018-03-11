package vista;



import java.util.ArrayList;

import controlador.Datos;
import modelo.Alumno;
import modelo.Material;
import modelo.Prestamo;

public class SalidaConsola{
	
	public static void mostrarPrestamosDeUnAlumno(Alumno unAlumno) {
		int contadorLibro= 0;
		int contadoJuego = 0;
		int contadorRevista = 0;
		System.out.println("\n***** LISTADO PRESTAMOS DE UN ALUMNO *****\n");

		for (Material unPrestamo : unAlumno.getMisPrestamos().getListaPrestamos()) {
			String tipoMaterial = unPrestamo.getClass().getSimpleName();
			switch (tipoMaterial) {
			case "Libro":
				contadorLibro++;
			break;
			case "Juego":
				contadoJuego++;
			break;
			case "Revista":
				contadorRevista++;
			break;
			}
		}
		System.out.println(unAlumno.getNombre() + " ha alquilado:");
		System.out.println(contadorLibro + " Libros");
		System.out.println(contadoJuego + " Juegos");
		System.out.println(contadorRevista + " Revistas");
		
	}
	
	
	public static void mostrarMaterialPorTitulo(String titulo) {
		System.out.println("\n***** BUSCAR SI EXISTE UN MATERIAL POR SU NOMBRE / TITULO *****\n");
		boolean existe = false;
		for (Material unMaterial : Datos.listadoMaterialesEnStock) {
			if (unMaterial.getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println("**** PRODUCTO ENCONTRADO ****");
				System.out.println(unMaterial.toString());
				String codMaterial = unMaterial.getCodigo();
				for (Alumno unAlumno : Prestamo.getListaAlumnos()) {
					ArrayList<Material> listaPrestamos = unAlumno.getMisPrestamos().getListaPrestamos();
					for (int indice = 0; indice < listaPrestamos.size(); indice++) {
						if (listaPrestamos.get(indice).getCodigo().equals(codMaterial)) {
							System.out.println("lo tiene: " + unAlumno.getNombre());
							System.out.println("fecha préstamo: " + unAlumno.getMisPrestamos().getListadoFechaPrestamos()[indice]);
						}
					}
				}
				
				
				existe = true;
			} 
		}
		if (!existe) {
			System.out.println("El producto no existe");
		}
	}
	
	public static void mostrarDatosMaterialPorCodigo(String CodigoMaterial) {
		System.out.println("\n***** DATOS DE UN PRODUCTO *****\n");
		boolean existe = false;

		for (Material unMaterial : Datos.listadoMaterialesEnStock) {
			if (unMaterial.getCodigo().equals(CodigoMaterial)) {
				System.out.println("**** PRODUCTO ENCONTRADO ****");
				System.out.println(unMaterial.toString());
				existe = true;
			} 
		}
		if (!existe) {
			System.out.println("El producto no existe");
		}
		
	}


}
