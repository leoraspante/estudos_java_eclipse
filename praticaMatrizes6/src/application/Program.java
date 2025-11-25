// Descrição do exercício.

/* Crie uma matriz 4x4 preenchida com números aleatórios entre 0 e 99.
Exiba a matriz completa no formato de tabela.
Mostre apenas os elementos da diagonal secundária (onde i + j == tamanho - 1).
Calcule e exiba a soma dos elementos da diagonal secundária. */

package application;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int [][] mat =new int[4][4];
		
		// Mensagem de apresentação e instrução.
		System.out.println("Prática com matrizes");
		System.out.println("Exibe e soma os elementos da diagonal secundária");
		System.out.println("A matriz possui tamanho 4x4 preenchida automaticamente");
		System.out.println();
		
		// Geração e armazenamento de valores na matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(100); // Registra valores aleatórios de 0 a 99.
			}
		}
		
		// Exibição dos valores presentes na matriz.
		System.out.println("Valores registrados na matriz:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("%2d ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// Exibição dos valores armazenados na diagonal principal.
		System.out.println("Valores registrados na diagonal pricipal:");
		for(int i=0; i<mat.length; i++) {
			System.out.printf("%2d ", mat[i][i]);
		}
		System.out.println();
		System.out.println();
		
		// Exibição e soma dos valores armazenados na diagonal secundária.
		int somaSecundaria = 0;
		System.out.println("Valores registrados na diagonal secundária:");
		for(int i=0; i<mat.length; i++) {
			int j = mat.length - 1 - i; // Aqui esta a lógica para a diagonal secundária.
			System.out.printf("%2d ", mat[i][j]);
			somaSecundaria += mat[i][j];
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Soma dos valores registrados na diagonal secundária:");
		System.out.println("Total: " + somaSecundaria);
		
	}

}
