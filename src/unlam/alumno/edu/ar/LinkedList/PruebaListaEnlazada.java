package unlam.alumno.edu.ar.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		
		LinkedList<String> paises = new LinkedList<String>();
		LinkedList<String> capitales = new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
	
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		
		
		ListIterator<String> itPaises = paises.listIterator(); //Agregar Capitales en la lista de Paises
		ListIterator<String> itCapitales = capitales.listIterator();
		
		while (itCapitales.hasNext()) {
			
			if (itPaises.hasNext()) {
				itPaises.next();
			}
			itPaises.add(itCapitales.next());
		}
		
		System.out.println(paises);
		
		
		itCapitales = capitales.listIterator(); //Devolvemos a la posicion inical el iterador
		//Eliminamos las posiciones Pares de las Capitales
		while(itCapitales.hasNext()) {
			itCapitales.next();
	
			if(itCapitales.hasNext()) {
				itCapitales.next();
				itCapitales.remove();
			}
		}
		System.out.println(capitales);
		
		
		paises.removeAll(capitales); //Remuevo las capitales de la Lista Paises
		System.out.println(paises);
		
		
	}
}
