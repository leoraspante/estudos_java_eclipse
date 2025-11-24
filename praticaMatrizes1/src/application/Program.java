// Descrição do exercício.

/* Crie uma matriz 3x3 de inteiros.
Preencha manualmente com valores de 1 a 9.
Imprima a matriz no formato de tabela. */

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Prática com Matrizes");
		System.out.println("O tamanho já está pré definido");
		System.out.println("Exercício apenas de visualização da matriz");
		System.out.println();
		System.out.println("Exibição da matriz como tabela:");
		System.out.println();
		
		int linhasMat = 3;
		int colunasMat = 3;
		
		int [][] mat = new int[linhasMat][colunasMat]; // Criação da matriz bidimensional.
		
		// For preenchendo a matriz automaticamente.
		int valor = 1;
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = valor;
				valor++;
			}
		}
		
		// For responsável pela exibição da matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] +" ");
			}
			
			System.out.println(); // Salta para a próxima linha.
		}
		
		sc.close();
	}

}
