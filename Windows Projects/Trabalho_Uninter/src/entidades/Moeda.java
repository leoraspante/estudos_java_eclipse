// Classe abstrada, portanto servindo como referência a ser herdada pelas suas subclasses.

package entidades;

public abstract class Moeda {
	
	// Definição dos atributos comuns a todas as moedas.
	protected double valor;
	
	// Definição do construtor para ser usado posteriormente pelas subclasses.
	public Moeda(double valor) {
		this.valor = valor;
	}
	
	// Definição dos métodos.
	// Método público que retorna o valor da moeda.
	public double getValor() {
		return valor;
	}
	
	// Métodos abstratos que serão implementados pelas subclasses.
	public abstract void info();
	public abstract double converter();
}
