package unlam.alumno.edu.ar.Maps;

import java.util.HashMap;
import java.util.Map;

public class PruebaMaps {

	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>(); 
		
		personal.put("145",new Empleado("Santiago")); //Para colocar
		personal.put("146",new Empleado("Fiorella"));
		personal.put("147",new Empleado("Sebastian"));
		personal.put("148",new Empleado("Paula"));
		
		
		System.out.println(personal);
		personal.remove("147"); //Para eliminar
		
		System.out.println(personal);
		
		personal.put("147",new Empleado("Sebastian"));
		personal.put("148",new Empleado("Marco")); //Para reemplazar
	
		System.out.println(personal);
		
		//System.out.println(personal.entrySet());
		
		
		for (Map.Entry<String, Empleado> entrada : personal.entrySet()) {
			String key = entrada.getKey();
			Empleado val = entrada.getValue();
			 
			System.out.println("Clave= " + key + " Valor=" + val);
		}
	}

}
