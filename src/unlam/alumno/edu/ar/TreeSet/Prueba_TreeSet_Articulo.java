package unlam.alumno.edu.ar.TreeSet;

import java.util.TreeSet;

public class Prueba_TreeSet_Articulo {

	public static void main(String[] args) {
		
		Articulo primero= new Articulo(1, "Primer Articulo");
		Articulo tercero= new Articulo(3, "Tercer Articulo");
		Articulo segundo= new Articulo(200, "Segundo Articulo");
		
		ComparadorArticulos comparadorArticulos = new ComparadorArticulos();
		
		TreeSet <Articulo> ordenaArticulos = new TreeSet <Articulo>();
		TreeSet <Articulo> ordenaArticulos2 = new TreeSet <Articulo>(comparadorArticulos);
		
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		ordenaArticulos2.add(tercero);
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		
		System.out.println(ordenaArticulos);
		
		for (Articulo ordena : ordenaArticulos) {
			System.out.println(ordena.getDescripcion());
		}

		System.out.println(ordenaArticulos2);
		
		for (Articulo ordena2 : ordenaArticulos2) {
			System.out.println(ordena2.getDescripcion());
		}
	}

}
