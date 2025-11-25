// Descrição do exercício.

/* Crie uma matriz 4x4 preenchida com números aleatórios entre 0 e 99.
Exiba a matriz completa no formato de tabela.
Mostre os elementos da diagonal principal e calcule sua soma.
Mostre os elementos da diagonal secundária e calcule sua soma.
Peça ao usuário um número de linha e calcule a soma dos elementos dessa linha.
Peça ao usuário um número de coluna e calcule a soma dos elementos dessa coluna.
Exiba todos os resultados de forma clara e organizada. */

package application;

import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int[][] mat = new int[4][4];
		
		// Mensagem de apresentação e instrução.
		System.out.println("Prática com matrizes bidimensionais");
		System.out.println("Revisão dos conceitos vistos anteriormente");
		System.out.println("Matriz 4x4 gerada automaticamente");
		System.out.println();
		
		// Geração e armazenamento de dados na matriz.
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = rand.nextInt(100); // Gera valores aleatórios de 0 até 99.
			}
		}
		
		System.out.println("-------------------------------------------------"); // Separador visual.
		
		// Exibição da matriz criada.
		System.out.println("Valores registrados na matriz:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.printf("%2d ", mat[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("-------------------------------------------------"); // Separador visual.
		
		// Bloco responsável pela exibição e soma dos valores da diagonal principal.
		int somaPrincipal = 0;
		System.out.println("Valores na diagonal principal:");
		for(int i=0; i<mat.length; i++) {
			System.out.printf("%2d ", mat[i][i]);
			somaPrincipal += mat[i][i];
		}
		System.out.printf("%n%nSoma dos valores na diagonal principal:%n");
		System.out.printf("Total: %d%n%n", somaPrincipal);
		
		System.out.println("-------------------------------------------------"); // Separador visual.
		
		// Bloco responsável pela exibição e soma dos valores da diagonal secundária.
		int somaSecundaria = 0;
		System.out.println("Valores na diagonal secundária:");
		for(int i=0; i<mat.length; i++) {
			int j = mat.length -1 -i;
			System.out.printf("%2d ", mat[i][j]);
			somaSecundaria += mat[i][j];
				}
		System.out.printf("%n%nSoma dos valores na diagonal secundaria:%n");
		System.out.printf("Total: %d%n%n", somaSecundaria);
				
		System.out.println("-------------------------------------------------"); // Separador visual.
		
		// Bloco responsável pela escolha e soma dos valores presentes na linha definida.
		System.out.print("Informe o número de uma linha (1 a 4) para somar: ");
		int linha = sc.nextInt() -1; // (-1) Ajusta o índice.
		sc.nextLine(); // Consome quebra de linha pendente.
		int somaLinha = 0;
		
		System.out.printf("Valores presentes na linha: %d%n", linha + 1);
		for(int j=0; j<mat[linha].length; j++) {
			System.out.printf("%2d ", mat[linha][j]);
			somaLinha += mat[linha][j];
		}
		System.out.printf("%nSoma dos valores: %d%n", somaLinha);
		
		System.out.println("-------------------------------------------------"); // Separador visual.
		
		// Bloco responsável pela escolha e soma dos valores presentes na coluna definida.
		System.out.print("Informe o número de uma coluna (1 a 4) para somar: ");
		int coluna = sc.nextInt() -1; // (-1) Ajusta o índice.
		sc.nextLine(); // Consome quebra de linha pendente.
		int somaColuna = 0;
				
		System.out.printf("Valores presentes na coluna: %d%n", coluna + 1);
		for(int i=0; i<mat.length; i++) {
			System.out.printf("%2d ", mat[i][coluna]);
			somaColuna += mat[i][coluna];
		}
		System.out.printf("%nSoma dos valores: %d%n", somaColuna);
	
	}

}
