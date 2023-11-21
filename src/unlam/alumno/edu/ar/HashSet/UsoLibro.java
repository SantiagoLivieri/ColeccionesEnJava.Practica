package unlam.alumno.edu.ar.HashSet;

public class UsoLibro {

	public static void main(String[] args) {
		
			Libro  libro1 = new Libro ("Programacion", "San", 24);
			Libro  libro2 = new Libro ("Programacion", "San", 24);
			
			if(libro1.equals(libro2)) {
				System.out.println("Es el mimso libro"); 
			}else {
				System.out.println("No es el mismo libro");
				
			}
	}

}
