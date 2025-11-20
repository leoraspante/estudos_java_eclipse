// Descrição do exercício.

/* Faça um programa que leia N números reais e armazene-os em um vetor.
  Em seguida:
  Imprimir todos os elementos do vetor 
  Mostrar na tela a soma e a média dos elementos do vetor */

package program;

// Importação de classes.

import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		// Alteração do locale para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Definição de Scanner na variável input, permitindo a captura de dados via console.
		Scanner input = new Scanner(System.in);
				
		// Mensagem de instrução com captação de valor.
		System.out.printf("Quantos números você vai digitar ?: ");
		int qtdNumeros = input.nextInt();
			
		// Definição de um vetor, para o armazenamento da quantidade de números informada anteriormente.
		double[] vect = new double[qtdNumeros];
		
		// Loop for para a captura dos valores informados pelo usuário.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = input.nextDouble();				
		}
		
		// Inicialização da variável soma e média.
		double soma = 0;
		
		// Espaçamento para melhor legibilidade
		System.out.println();
		
		// Primeira saída de dados conforme solicitado.
		System.out.printf("VALORES = ");
		
		// Loop for percorrendo o vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("%.2f ", vect[i]); // Verifica os valores presentes no vetor.
			soma += vect[i]; // Acrescenta a variável soma, cada valor presente no vetor.
		}
		
		// Espaçamento para melhor legibilidade
			System.out.println();
		
		// Segunda saída de dados conforme solicitado.
		System.out.printf("SOMA = %.2f%n", soma);
		
		// Terceira saída de dados conforme solicitado.
		System.out.printf("MEDIA = %.2f%n", soma / vect.length);
		
		// Fechamento do Scanner;
		input.close();
	}

}
