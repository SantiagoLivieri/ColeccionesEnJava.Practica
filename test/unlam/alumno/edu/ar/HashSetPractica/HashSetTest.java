package unlam.alumno.edu.ar.HashSetPractica;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class HashSetTest {

	@Test
	public void queSePuedaCrearUnHashSet() {
		//Preparacion
		 Set <String> lista;  
		 final String NOMBRE ="Santiago"; 
		 final String NOMBRE_2 = "FIORELLA";
		 final String NOMBRE_3 = "TYSON";
		 final String NOMBRE_4 = "SKYE";
		 
		 final String NOMBRE_ESPERADO ="Santiago"; 
		 final String NOMBRE_ESPERADO_2 = "FIORELLA";
		 final String NOMBRE_ESPERADO_3 = "TYSON";
		 final String NOMBRE_ESPERADO_4 = "SKYE";
		 
		 //Ejecucion
		lista = new HashSet<String>();
		
		lista.add(NOMBRE);
		lista.add(NOMBRE_2);
		lista.add(NOMBRE_3);
		lista.add(NOMBRE_4);

		
		for (String dato : lista) {
			System.out.println(dato);
				}
		
		 //Validacion 
		assertNotNull(NOMBRE.compareTo(NOMBRE_ESPERADO));
		assertEquals(NOMBRE_2, NOMBRE_ESPERADO_2);
		assertEquals(NOMBRE_3, NOMBRE_ESPERADO_3);
		assertEquals(NOMBRE_4, NOMBRE_ESPERADO_4);
	}
	
	@Test
	public void queSePuedaCrearUnHashSetSinCopias() {
		//Preparacion
		 Set <String> lista;  
		 final String NOMBRE ="Santiago"; 
		 final String NOMBRE_2 = "FIORELLA";
		 final String NOMBRE_3 = "TYSON";
		 final String NOMBRE_4 = "SKYE";
		 
		 //Ejecucion
		lista = new HashSet<String>();
		
		lista.add("Santiago");
		lista.add("Santiago");
		lista.add("Tyson");
		lista.add("Fiorella");
		lista.add("Tyson");
		lista.add("Skye");
		lista.add("Skye");
		lista.add("Fiorella");
		 
		 //Validacion 
		
		for (String dato : lista) {
			System.out.println(dato);
				}
		
		System.out.println(lista.iterator());
	}

}
