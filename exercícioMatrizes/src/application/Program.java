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
		System.out.println();
		
		int [][] mat = new int[qtdLinhas][qtdColunas];
		
		// Captura e registro dos valores.
		System.out.println("Informe os valores:");
		for(int i=0; i<qtdLinhas; i++) {
			for(int j=0; j<qtdColunas; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		
		// Bloco responsável pela manipulação do valor de X. -- Em desenvolvimento
		System.out.print("Informe o valor de X: ");
		int x = sc.nextInt();
		sc.nextLine(); // Consome quebra de linha.
		
		// Bloco verificando se o valor de x existe na matriz.
		boolean temX = false;
		for(int i=0; i<qtdLinhas; i++) {
			for(int j=0; j<qtdColunas; j++) {
				if(mat[i][j] == x) {
					temX = true;
					System.out.println();
					System.out.printf("%dª Posição de X: %d, %d%n",i+1, i, j);
					System.out.println();
					
					if(j>0) { // Verifica elemento a esquerda.
						System.out.printf("Elemento a esquerda de X: %d%n", mat[i][j-1]);
					}
					if(i>0) { // Verifica elemento acima.
						System.out.printf("Elemento acima de X: %d%n", mat[i-1][j]);
					}
					if(j < mat[i].length-1) { // Verifica elemento a direita.
						System.out.printf("Elemento a direita de X: %d%n", mat[i][j+1]);
					}
					if(i < mat.length-1) { // Verifica elemento abaixo.
						System.out.printf("Elemento abaixo de X: %d%n", mat[i+1][j]);
					}
				}
				
			}
		}

		if(!temX) {
			System.out.println("Valor de X não consta na matriz.");
			System.out.println("Fim do programa.");
		}
		
		
		
		
		sc.close();
	}

}
