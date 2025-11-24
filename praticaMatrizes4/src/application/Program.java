// Descrição do exercício.

/* Crie uma matriz 3x3 preenchida com números aleatórios entre 0 e 9.
Peça ao usuário um número.
Verifique se esse número existe na matriz.
Se existir, mostre todas as posições (linha e coluna) onde ele aparece. */


package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int[][] mat = new int[3][3];
		
		// Mensagem de apresentação e instrução.
		System.out.println("Prática com matrizes");
		System.out.println("Usuário informa um número para ser localizado na matriz");
		System.out.println("A matriz possui tamanho 3x3 preenchida automaticamente");
		System.out.println();
		
		// Geração e armazenamento de valor na matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(10);
			}
		}
		
		// Bloco responsável pela busca de valor específico na matriz.
		boolean encontrado = false;
		System.out.print("Informe o valor que deseja buscar na matriz: ");
		int valorX = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == valorX) {
					System.out.printf("Número #:%d encontrado! Linha %d e coluna %d%n", valorX, i, j);
					encontrado = true;
				}
			}
		}
		
		// If/else controlando a exibição de resultados.
		if(!encontrado) {
			System.out.printf("Número #:%d não consta na matriz", valorX);
		}
		else {
			System.out.println("Valores armazenados na matriz:");
			for(int i=0; i<mat.length; i++) {
				for(int j=0; j<mat[i].length; j++) {
					System.out.printf("%2d ",mat[i][j]);
				}
				System.out.println();
			}
		}

		sc.close();
	}

}
