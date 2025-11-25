// Descrição do exercício.

/* Crie uma matriz 4x4 preenchida com números aleatórios entre 0 e 99.
Exiba a matriz completa.
Mostre as coordenadas (linha e coluna) da diagonal secundária.
Depois, exiba os valores correspondentes e calcule a soma. */

package application;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[][] mat = new int[4][4];
		
		// Mensagem de apresentação.
		System.out.println("Prática com matrizes");
		System.out.println("Exibe a matriz completa");
		System.out.println("Exibe as coordenadas da diagonal secundária");
		System.out.println("A matriz possui tamanho 4x4 preenchida automaticamente");
		System.out.println();
		
		// Geração e armazenamento de dados na matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(100);
			}
		}
		
		// Exibição dos valores armazenados na matriz.
		System.out.println("Dados armazenados na matriz:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("%2d ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		// Exibição e soma dos valores da diagonal secundária.
		int somaSecundaria = 0;
		System.out.println("Dados armazenados na diagonal secundária:");
		for(int i=0; i<mat.length; i++) {
			int j = mat.length -1 -i;
			System.out.printf("Nº: %2d na linha #%2d e coluna #%2d%n",mat[i][j] , i+1, j+1);
			somaSecundaria += mat[i][j];
		}
		System.out.println();
		
		System.out.println("Soma dos valores na diagonal secundária");
		System.out.println("Total: " + somaSecundaria);
		
	}

}
