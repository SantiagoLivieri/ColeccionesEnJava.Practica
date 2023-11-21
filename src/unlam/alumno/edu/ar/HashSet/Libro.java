package unlam.alumno.edu.ar.HashSet;

import java.util.Objects;

public class Libro {

	private String titulo;
	private String autor;
	private Integer ISBN;
	
	public Libro (String titulo, String autor, Integer ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;
	}
	
		public String getDatos() {
			return "El titulo es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
		}

		@Override
		public int hashCode() {
			return Objects.hash(ISBN);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Libro other = (Libro) obj;
			return Objects.equals(ISBN, other.ISBN);
		}
		
		
		
		/* public boolean equals (Object obj) { //Sobreescrimimos el metodo equals
			
			if(obj instanceof Libro) {  //Pregunto si obj es una instancia del objeto libro
				Libro otro = (Libro)obj; //Casteo objeto Libro en Objet
				
				if(this.ISBN == otro.ISBN) {
					return true;
				} else {
					return false;
				}
			}else {
				return false;
			}
			
		} */
		
		
		
		
}
