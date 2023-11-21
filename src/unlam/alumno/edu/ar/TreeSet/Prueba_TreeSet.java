package unlam.alumno.edu.ar.TreeSet;

import java.util.TreeSet;
//Ordena por defecto en orden Alfabetico

public class Prueba_TreeSet {

	public static void main(String[] args) {
		
		TreeSet <String> ordenaPersonas = new TreeSet <String>();
		
		ordenaPersonas.add("Santiago");
		ordenaPersonas.add("Sebastian");
		ordenaPersonas.add("Fiorella");
		ordenaPersonas.add("Fiorella");
		
		System.out.println(ordenaPersonas);
		
		for (String ordena : ordenaPersonas) {
			System.out.println(ordena);
		}
	}
	

}



