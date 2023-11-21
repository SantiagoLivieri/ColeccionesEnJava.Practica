package unlam.alumno.edu.ar.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		//Empleado listaEmpleado[] = new Empleado[3];
		
		/*listaEmpleado[0]= new Empleado ("Ana", 45, 2500);
		listaEmpleado[1]= new Empleado ("Anamaria", 55, 2000);
		listaEmpleado[2]= new Empleado ("Analia", 25, 2700);*/
		
		ArrayList <Empleado>listaEmpleado = new ArrayList <Empleado>(); 
		
		listaEmpleado.ensureCapacity(15);// Para definir el tamaño de un array list
		
		
		listaEmpleado.add(new Empleado ("Ana", 45, 2500));
		listaEmpleado.add(new Empleado ("Anamaria", 55, 2000));
		listaEmpleado.add(new Empleado ("Analia", 25, 2700));
		listaEmpleado.add(new Empleado ("Ana", 45, 2500));
		listaEmpleado.add(new Empleado ("Anamaria", 55, 2000));
		listaEmpleado.add(new Empleado ("Analia", 25, 2700));
		listaEmpleado.add(new Empleado ("Ana", 45, 2500));
		listaEmpleado.add(new Empleado ("Anamaria", 55, 2000));
		listaEmpleado.add(new Empleado ("Analia", 25, 2700));
		listaEmpleado.add(new Empleado ("Ana", 45, 2500));
		listaEmpleado.add(new Empleado ("Anamaria", 55, 2000));
		listaEmpleado.add(new Empleado ("Analia", 25, 2700));
		
		listaEmpleado.set(0, (new Empleado ("Marco", 25, 2700)));//Para poner un objeto en una posicion especfica
		
		//listaEmpleado.trimToSize(); Este metodo funciona para que se elimine el exceso de memoria
		
		/*System.out.println(listaEmpleado.get(4).dameDatos());
		
		System.out.println(listaEmpleado.size());*/
		
		
		
		/*for (Empleado empleado : listaEmpleado) {
			System.out.println(empleado.dameDatos());
		}*/
		
		
		Iterator<Empleado> mi_iterator = listaEmpleado.iterator();
		
		while(mi_iterator.hasNext()) {
			System.out.println(mi_iterator.next().dameDatos());
		}
		
		/*for(int i= 0 ; i < listaEmpleado.size(); i++) {
			Empleado e = listaEmpleado.get(i);
			System.out.println(e.dameDatos());
		}*/
		
		
		/*Empleado arrayEmpleados[]=new Empleado[listaEmpleado.size()];
		listaEmpleado.toArray(arrayEmpleados);
		
		for(int i= 0 ; i < arrayEmpleados.length; i++) {
			Empleado e = arrayEmpleados[i];
			System.out.println(e.dameDatos());
		}*/
		
	}

}
