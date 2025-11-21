// Descrição do exercício.

/* Fazer um programa para ler um número inteiro N e uma matriz de
ordem N contendo números inteiros. Em seguida, mostrar a diagonal
principal e a quantidade de valores negativos da matriz. */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		int matSize = 0;
		int qtdNegativos = 0;
		
		// Valida entrada numérica.
		do {
			System.out.print("Digite o tamanho da matriz bidimensional: ");
			matSize = sc.nextInt();
			sc.hasNextLine(); // Consome quebra de linha.
			if(matSize <=0) {
				System.out.println("Valor inválido!%nDigite um número inteiro maior que zero.");
			}
		} while(matSize <=0);
		System.out.println();
		
		int[][] mat = new int[matSize][matSize]; // Cria matriz bidimensional.
		
		// Captura e registro dos dados.
		System.out.println("Digite os valores:");
		System.out.println();
		for(int i=0; i<matSize; i++) {
			for(int j=0; j<matSize; j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j] <0) {
					qtdNegativos++;
				}
			}
		}
		System.out.println();
		
		// Obtenção da diagonal principal.
		System.out.println("Diagonal principal:");
		for(int i=0; i<matSize; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		System.out.println("Números negativos: " + qtdNegativos);
		
		
		sc.close();

	}

}
