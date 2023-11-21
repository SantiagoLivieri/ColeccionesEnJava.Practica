package unlam.alumno.edu.ar.LinkedList;
//CTRL + SHIFT + F para IDENTAR
import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {
			//Ventajas
				//Listas ordenadas; Permite el acceso aleatorio
				//añadir y eliminar sin restriccion
				//ListIterator modfica en cualquier direccion
				// Sintaxis similar arrays
	
			//Desventajas
				//Bajo rendimineto en operaciones concretas que se resolverian con otras interfaces
	
	public static void main(String[] args) {

		LinkedList<String> personas = new LinkedList<String>(); 

		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");

		System.out.println(personas.size());
		
		//personas.add("Juan");
		personas.add(2, "Fio"); //Agregandolo en el indice 2 
		
		ListIterator<String> it = personas.listIterator();
		it.next();
		it.add("Juan");
		
		for (String persona : personas) {
			System.out.println(persona);
		}
	}

	
}
