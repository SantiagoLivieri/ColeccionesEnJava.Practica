package unlam.alumno.edu.ar.Genericos;


public class MetodosGenericos {

	public static void main(String[] args) {
		
		String nombres[]= {"Jose", "Ana", "Pepe"};
		
		String elementos = MisMatrices.getElementos(nombres);
		System.out.println(elementos);
		
		String elementos1 = MisMatrices.getMenor(nombres);
		System.out.println(elementos1);
		
	}
}
