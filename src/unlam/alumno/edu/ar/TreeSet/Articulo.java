package unlam.alumno.edu.ar.TreeSet;



class Articulo implements Comparable<Articulo>{

	private int numero_articulo;
	private String descpricion;
	
	
	public Articulo (int num, String des) {
		numero_articulo = num;
		descpricion = des;
		
	}
	
	@Override
	public int compareTo(Articulo o) {
		
		return numero_articulo - o.numero_articulo;
	}
	
	
	public String getDescripcion() {
		return descpricion;
	}

		
}