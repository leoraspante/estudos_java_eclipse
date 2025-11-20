package entities;

public class Numero {
	
	private int numero; // Atributo.
	
	public Numero(int numero) { // Construtor.
		this.numero = numero;
	}
	
	public int getNumero() { // Getter.
		return numero;
	}
	
	public String toString() { // String personalizado.
		return "" + numero;
	}
}
