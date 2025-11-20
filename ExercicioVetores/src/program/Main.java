// Descrição do exercício.

/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package program;

// Importação de classes.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Habilitação do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Declaração de variável.
		int qtdNumeros = 0;
		
		// Bloco inicial garantindo a entrada consistente de dados.
		do {
			System.out.printf("Quantos números você vai digitar? ");
			qtdNumeros = input.nextInt();
			
		} while(qtdNumeros < 1 || qtdNumeros > 10);
		
		// Criação do vetor.
		int[] vect = new int[qtdNumeros];
				
		// For registrando dados no vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um valor: ");
			vect[i] = input.nextInt();
		}
		
		System.out.println(); // Espaçamento para melhor legibilidade.
		
		System.out.println("Números negativos:");

		// For exibindo números negativos digitados.
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		// Fechamento do Scanner.
		input.close();

	}

}
