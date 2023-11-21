package unlam.alumno.edu.ar.TreeSet;

import java.util.Comparator;

public class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		return descripcionA.compareTo(descripcionB);
	}
	
}
