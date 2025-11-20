// Descrição do exercício.

/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor */

package program;

// Importação de classes.
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Declaração de variável
		double soma = 0;
		
		// Instrução ao usuário e captura de dados.
		System.out.printf("Quantos números você vai digitar? ");
		int qtdNumeros = input.nextInt();
		
		// Criação do vetor.
		double[] vect = new double[qtdNumeros];
		
		// Registrando os valores no vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = input.nextDouble();
		}
		
		System.out.println(); // Quebra de linha.
		
		// Exibição dos elementos no vetor.
		System.out.printf("Valores = ");
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf(vect[i] + " / ");
			soma += vect[i]; // Adiciona a variável soma, cada um dos valores presentes no vetor.
		}
		

		System.out.println();
		System.out.println(); // Quebra de linha.
				
		// Exibição da soma dos valores presentes no vetor.
		System.out.printf("Soma = %.2f%n", soma);
		
		System.out.println(); // Quebra de linha.
		
		//Exibição da média dos valores presentes no vetor.
		System.out.println("Média = " + soma/vect.length);
		
		// Fechamento do Scanner.
		input.close();
	}

}
