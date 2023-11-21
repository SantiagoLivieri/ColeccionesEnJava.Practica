package unlam.alumno.edu.ar.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Ventajas
//No permite elementos duplicados
//Uso sencillo del metodo add que ademas asegura no elementos duplicados

//Desventajas
//No tiene acceso aleatorio
//Poca eficencia a la hora de ordenar elementos(Y no siempre se puede)

public class CuentasUsuarios {

		public static void main(String []args) {
			
			Clientes cl1 = new Clientes("Santiago", "0001", 300000.0);
			Clientes cl2 = new Clientes("Analia","0002",250000.0);
			Clientes cl3 = new Clientes("Fiorella","0003",20000.0);
			Clientes cl4 = new Clientes("Christian","0004",150000.0);
			Clientes cl5 = new Clientes("Santiago", "0001", 300000.0);
		
			Set<Clientes> clientesBanco = new  HashSet<Clientes>();
			
			clientesBanco.add(cl1);
			clientesBanco.add(cl1);//Duplicado
			
			clientesBanco.add(cl2);
			clientesBanco.add(cl3);
			clientesBanco.add(cl4);
			
			clientesBanco.add(cl5);//Copia de Cl1
			
			
			
			Iterator<Clientes> it = clientesBanco.iterator();//Para remover un objeto de una coleccion
			
			while(it.hasNext()) {
				String nombre_cliente = it.next().getNombre();
				if(nombre_cliente.equals("Christian")) {
					it.remove();
				}
			}
		
			
			for (Clientes clientes : clientesBanco) {//PAra recorrer y ver informacion
				System.out.println(clientes.getNombre() + " " + clientes.getN_Cuenta() + "  " +clientes.getSaldo());
			}
			
	}
}
