// Criação da classe IMC_Calculator, onde serão realizados os cálculos.

package util;

public class IMCCalculator {
	
	// Definição de atributos da classe.
	public String nome;
	public double altura;
	public double peso;
	
	// Definição de um construtor.
	public IMCCalculator(String nome, double altura, double peso) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	// Definição dos métodos.
	public String calculate() {
		
		// If verificando se o usuário informou um valor igual a zero.
		if (altura <= 0 || peso <=0 ) {
			return "Erro: altura e peso devem ser maiores do que zero.";
		}
		
		// Criação da variável imc, para armazenar o resultado do cálculo.
		double imc = peso /Math.pow(altura, 2);
		
		// Criação de uma variável para armazenar resultado.
		String classificacao;
		
		if (imc <= 18) {
			classificacao = "Abaixo do peso";
		} else if (imc < 25) {
			classificacao = "Peso normal";
		} else if (imc < 30) {
			classificacao = "Acima do peso";
		} else {
			classificacao = "Obesidade";
		}
		
		// Saída pré formata dos dados.
		return String.format("%s, seu IMC é %.2f (%s)", nome, imc, classificacao);
	} 
}
