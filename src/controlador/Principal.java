package controlador;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import modelo.Alumno;
import modelo.Juego;
import modelo.Libro;
import modelo.Revista;
import vista.SalidaConsola;

public class Principal {

	public static void main(String[] args) {
		
		//**************** EJERCICIO 1 ********************
		//Creo tres productos
		Libro miLibro1 = new Libro("001L", "Don Quijote", LocalDate.now(), 500);
		Libro miLibro2 = new Libro("002L", "El Cid Campeador", LocalDate.now(), 300);
		Libro miLibro3 = new Libro("003L", "Yo Robot", LocalDate.now(), 250);
		Juego miJuego1 = new Juego("001J", "Strip Poker", LocalDate.now(), 18);
		Juego miJuego2 = new Juego("002J", "Assasin Creed", LocalDate.now(), 18);
		Juego miJuego3 = new Juego("003J", "World of Warcraft", LocalDate.now(), 18);
		Revista miRevista1 = new Revista("001R", "Más Allá", LocalDate.now(), 1, "Exotérica");
		Revista miRevista2 = new Revista("002R", "Hola", LocalDate.now(), 1, "Famosos");
		Revista miRevista3 = new Revista("003R", "Muy Interesante", LocalDate.now(), 1, "Curiosidades y Conocimiento");
		Revista miRevista4 = new Revista("004R", "Quo", LocalDate.now(), 1, "Curiosidades y Conocimiento");
		//Añados los tres productos a la clase Datos que los almacenas
		Datos.listadoMaterialesEnStock.addAll(Arrays.asList(miLibro1,miLibro2,miLibro3));
		Datos.listadoMaterialesEnStock.addAll(Arrays.asList(miJuego1,miJuego2,miJuego3));
		Datos.listadoMaterialesEnStock.addAll(Arrays.asList(miRevista1,miRevista2,miRevista3,miRevista4));
		
		//Creo un Alumno
		Alumno unAlumno = new Alumno("001","DAW1", "Javier");	
		//Le asigno tres prestamos
		unAlumno.addUnPrestamo(miLibro1, "01012018");		
		unAlumno.addUnPrestamo(miLibro2, "02022018");		
		unAlumno.addUnPrestamo(miLibro3, "03022018");
		unAlumno.addUnPrestamo(miJuego1, "04022018");
		unAlumno.addUnPrestamo(miJuego2, "05022018");
		unAlumno.addUnPrestamo(miJuego3, "06022018");
		unAlumno.addUnPrestamo(miRevista1, "07022018");
		unAlumno.addUnPrestamo(miRevista2, "08022018");
		unAlumno.addUnPrestamo(miRevista3, "09022018");
		unAlumno.addUnPrestamo(miRevista4, "1002018");
		unAlumno.addUnPrestamo(miRevista4, "11022018");
		
		//Muestro en consola los prestamos de un alumno
		SalidaConsola.mostrarPrestamosDeUnAlumno(unAlumno);
		//Muestro en consola un producto concretro
		SalidaConsola.mostrarDatosMaterialPorCodigo("002L");
		//Muestra buscando por Título si existe el Material
		SalidaConsola.mostrarMaterialPorTitulo("Yo Robot");
		
		
		//**************** EJERCICIO 2 ********************
		
		String estadistica = Ejercicio2.leerFicheroTextoDevuelveDatos("ficheros/datosEjercicio.txt");
		Ejercicio2.grabarFicheroTextoConEstadistica1("ficheros/estadisticaEjercicio1.txt", estadistica);
		Ejercicio2.grabarFicheroTextoConEstadistica2("ficheros/estadisticaEjercicio2.txt", estadistica);
		

		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0,1);
		al.set(0,2);
		al.forEach(i ->al.set(0,5));
		System.out.println("Fin");
	}


}
