// Descrição do exercício.

/* Crie uma matriz 4x4 preenchida com números aleatórios entre 0 e 99.
Exiba a matriz completa no formato de tabela.
Mostre apenas os elementos da diagonal principal (onde i == j).
Calcule e exiba a soma dos elementos da diagonal principal. */

package application;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[][] mat = new int[4][4];
		
		// Mensagem de apresentação
		// Mensagem de apresentação e instrução.
		System.out.println("Prática com matrizes");
		System.out.println("Exibe e soma os elementos da diagonal principal");
		System.out.println("A matriz possui tamanho 4x4 preenchida automaticamente");
		System.out.println();

		// Geração e armazenamento dos valores na matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(100); // Adiciona valores aleatórios de 0 a 99.
			}
		}
		
		// Exibição da matriz.
		System.out.println("Valores presentes na matriz:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("%2d ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// Exibição e soma de valores da diagonal principal da matriz.
		int somaDiagonal = 0;
		System.out.println("Valores presentes na diagonal principal:");
		for(int i=0; i<mat.length; i++) {
				System.out.printf("%2d ", mat[i][i]); // mat[0][0], mat[1][1], mat[2][2], mat[3][3]...
				somaDiagonal += mat[i][i];
			}
		
		System.out.println();
		System.out.println("Soma dos valores na diagonal principal: " + somaDiagonal);
	}

}
