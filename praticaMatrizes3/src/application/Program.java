// Descrição do exercício.

/* Crie uma matriz 4x4 preenchida com números aleatórios entre 0 e 99.
Exiba a matriz no formato de tabela.
Descubra qual é o maior valor presente na matriz.
Mostre também a posição (linha e coluna) desse maior valor.
Exigência extra: antes de mostrar o resultado, exiba a matriz completa para o usuário visualizar os números. */

package application;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[][] mat = new int[4][4];
		int maiorValor = mat[0][0]; // Posição inicial da matriz.	
		int linhaMaior = 0;
		int colunaMaior = 0;
		
		System.out.println("Atividade prática de Matrizes");
		System.out.println("Gerada uma matriz 4x4 com valores aleatórios.");
		
		// Gera e Armazena números aleatórios na matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(100); // Gera números aleatórios até 99.
			}
		}
		
		// Exibição dos valores armazenados na matriz.
		System.out.println("Valores registrados na matriz:");
		System.out.println();
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("%2d ", mat[i][j]);
				if(mat[i][j] > maiorValor) { // Obtenção do maior valor da matriz.
					maiorValor = mat[i][j];
					linhaMaior = i+1;
					colunaMaior = j+1;
				}
			}
			
			System.out.println(); // Salta linha na exibição da matriz como tabela.
		}
		System.out.println();
		System.out.println("Maior valor registrado: " + maiorValor);
		System.out.printf("Localizado na linha: %d e coluna: %d", linhaMaior, colunaMaior);
		
	}

}
