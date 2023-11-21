package unlam.alumno.edu.ar.HashSet;

import java.util.Objects;

public class Clientes {
	
	private String nombre;
	private String n_Cuenta;
	private Double saldo;
	
	public Clientes(String nombre, String n_cuenta, Double saldo) {
		this.nombre = nombre;
		this.n_Cuenta = n_cuenta;
		this.saldo = saldo;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getN_Cuenta() {
		return n_Cuenta;
	}

	public void setN_Cuenta(String n_Cuenta) {
		this.n_Cuenta = n_Cuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(n_Cuenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(n_Cuenta, other.n_Cuenta);
	}
	
	
	
}
