// Descrição do exercício.

/* Crie uma matriz 2x2 com valores definidos pelo usuário (via Scanner).
Calcule a soma de todos os elementos.
Mostre o resultado no console. */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Mensagens de apresentação.
		System.out.println("Atividade prática de matriz");
		System.out.println();
		System.out.println("Matriz bidimensional, tamanho: 2x2");
		System.out.println();
		
		int[][] mat = new int[2][2]; // Criação da matriz.
		
		// Captura e registro dos valores na matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("Linha %d Coluna %d: ",i ,j); // Identifica linha e coluna.
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		// Obtenção da soma de todos os elementos da matriz.
		int somaMatriz = 0;
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				somaMatriz += mat[i][j];
				
			}
		}
		
		System.out.println("Soma dos valores presentes na matriz: " + somaMatriz);
		
		sc.close();
	}

}
