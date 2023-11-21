package unlam.alumno.edu.ar.HashSetPractica;

import java.util.HashSet;
import java.util.Set;

public class ArraysHashSet {

	// Devuelve datos con orden aleatorio
	// No permite valores duplicados 
		Set <String> lista;
	
	
		
		ArraysHashSet (){
			lista = new HashSet<String>();
		}
		
		public String OrdenarNombres ( String  listar){
			for (String dato : lista) {
			System.out.println(dato);
				}
			return listar;
			}
		
		public String getNombre() {
			return lista.toString();
		}
}
