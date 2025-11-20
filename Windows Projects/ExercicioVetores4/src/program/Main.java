// Descrição do exercício.

/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
tela todos os números pares, e também a quantidade de números pares.  */

package program;

// Importação de classes.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Instrução inicial.
		System.out.printf("Quantos números você vai digitar? ");
		int qtdNumeros = input.nextInt();
		
		// Criação de vetor, tendo como tamanho o valor de qtdNumeros.
		int[] numList = new int[qtdNumeros];
		
		// Loop for capturando e armazenando os valores digitados pelo usuário no vetor.
		for(int i = 0; i < numList.length; i++) {
			System.out.printf("Digite um número: ");
			numList[i] = input.nextInt();	
		}
		
		System.out.println(); // Espaçamento para melhor legibilidade.
		
		// Saída de dados personalizada.
		System.out.println("Números pares:");
		
		// Definição de variável para "contar" quantos valores são pares no vetor numList.
		int qtdPares = 0;
		
		// Loop for identificando quantos valores pares o vetor numList possui.
		for(int i = 0; i < numList.length; i++) {
			if(numList[i] % 2 == 0) {
				qtdPares++;
				System.out.printf("%d ", numList[i]);
			}
		}
		
		System.out.println(); // Espaçamento para melhor legibilidade.
		
		// Exibição da quantidade de números pares.
		System.out.printf("Quantidade de pares = %d%n",qtdPares);
		
		// Fechamento do Scanner.
		input.close();
	}

}
