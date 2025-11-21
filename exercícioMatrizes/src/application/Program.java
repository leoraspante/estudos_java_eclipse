// Descrição do exercício.

/* Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo. */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdLinhas = 0;
		int qtdColunas = 0;
		
		System.out.println("Manipulando matrizes");
		
		// Valida entrada numérica de linhas.
		do {
			System.out.print("Informe a quantidade de linhas: ");
			qtdLinhas = sc.nextInt();
			sc.nextLine(); // Consome quebra de linha.
			if(qtdLinhas <=0) {
				System.out.printf("Valor inválido!%nDigite um número inteiro maior que zero.%n");
			}
		} while(qtdLinhas <=0);
		
		// Valida entrada numérica de colunas.
		do {
			System.out.print("Informe a quantidade de colunas: ");
			qtdColunas = sc.nextInt();
			sc.nextLine(); // Consome quebra de linha.
			if(qtdColunas <=0) {
				System.out.printf("Valor inválido!%nDigite um número inteiro maior que zero.%n");
			}	
		} while(qtdColunas <=0);
		
		int [][] mat = new int[qtdLinhas][qtdColunas];
		
		
		
		sc.close();
	}

}
