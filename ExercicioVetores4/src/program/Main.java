// Descrição do exercício.

/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */
package program;
// Importação de classes.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável qtdNumeros.
		int qtdNumeros = 0;
		
		// Definição de variável qtdPares.
		int qtdPares = 0;
		
		// Checagem inicial garantindo a inserção de um valor par maior que zero.
		do {
			System.out.printf("Quantos números você vai digitar? ");
			qtdNumeros = input.nextInt();
			if(qtdNumeros <= 0) {
				System.out.println("Digite um valor positivo maior que zero.");
			}
		} while(qtdNumeros <= 0);
		
		// Criação de um vetor, tendo como tamanho qtdNumeros.
		int[] vect = new int[qtdNumeros];
		
		// Captura de armazenamento dos valores no vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = input.nextInt(); // Registra o número no vetor.
		}
		
		System.out.println(); // Quebra de linha.
		
		// Mensagem de exbição.
		System.out.printf("Numeros pares: ");
		
		// Verificação de valores pares presentes no vetor.
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				System.out.printf(vect[i] + " / "); // Exibe os valores par.
				qtdPares++; // Usa a variável para "contar" quantos valores par o vetor possui.
			}
		}
		
		System.out.println();
		System.out.println(); // Quebra de linha.
		
		// Mensagem de exibição.
		System.out.println("Quantidade de pares: " + qtdPares);
		
		// Fechamento do Scanner.
		input.close();

	}

}
