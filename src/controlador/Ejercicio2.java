package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;

public class Ejercicio2 {
	
	public static String leerFicheroTextoDevuelveDatos(String rutaFichero) {
		
		int contadorLineas = 0;
		int contadorPalabras = 0;
		try {

			FileReader fr = new FileReader(rutaFichero);
			BufferedReader br = new BufferedReader(fr);
			String strLine;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null) {
				String[] campos = strLine.split(" ");
				contadorPalabras += campos.length;
				contadorLineas++;
				System.out.println(strLine);
			}
			//System.out.println("La media de edad es: " + acumulado/contador);
			// Close the input stream
			fr.close();
			br.close();
		} catch (Exception e) {// Catch exception if any
			System.err.println("Error: " + e.getMessage());
		}
		String estadistica = "Palabras totales: " + contadorPalabras + " - Lineas totales: " + contadorLineas;
		return estadistica;
	}
	
	public static void grabarFicheroTextoConEstadistica1(String rutaFichero, String estadistica) {
		
		try {
			FileWriter fw = new FileWriter(rutaFichero,true);
			BufferedWriter br = new BufferedWriter(fw);		
			br.append(estadistica+"\n");		
			br.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Grabacion correcta");
	}
	
	public static void grabarFicheroTextoConEstadistica2(String rutaFichero, String estadistica) {
		
		try {
			FileWriter fw = new FileWriter(rutaFichero,true);
			Formatter fo = new Formatter(fw);	
			fo.format("%s", estadistica + "\n");
	
			fo.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Grabacion correcta");
	}
	
	
}
