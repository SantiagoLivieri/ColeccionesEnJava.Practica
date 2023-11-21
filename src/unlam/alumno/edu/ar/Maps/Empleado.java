package unlam.alumno.edu.ar.Maps;

public class Empleado {

	private String nombre;
	private Double sueldo;

	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldo = 2000.0;
	}
	
	public String toString() {
		return "[Nombre=" + nombre + ", sueldo=" + sueldo + "  ]";	
	}
}
