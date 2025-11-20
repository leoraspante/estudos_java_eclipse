// Descrição do exercício.

/* Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
 e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package program;

// Importação de classes.
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Definição do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Implementação da condição de entrada, valor máximo = 10, utilizando do while com if aninhado.
		int qtdNumeros; // Inicialização da variável.
		
		do {
			System.out.printf("Quantos números você vai digitar ?: ");
			qtdNumeros = input.nextInt();
			
			if (qtdNumeros < 1 || qtdNumeros > 10) {
				System.out.println("Valor inválido! Digite um número entre 1 e 10.");
			}
		} while (qtdNumeros < 1 || qtdNumeros > 10);

		// Definição de um vetor para o armazenamento dos números.
		int[] vect = new int[qtdNumeros];
		
		// Loop for para a leitura da quantidade de número informada.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = input.nextInt();				
		}
		
		// Definição de variável para controle de negativos.
		boolean temNegativo = false;
		
		// Loop for para verificar os números negativos lidos.
		for(int i = 0; i < vect.length; i++) {
			if (vect[i] < 0) {
				if (!temNegativo) {
					System.out.println();
					System.out.println("Números negativos:");
				}
				System.out.println(vect[i]);
				temNegativo = true;
			}
		}
		
		if (!temNegativo) {
			System.out.println();
			System.out.println("Nenhum número negativo foi digitado.");
		}
				
		System.out.println();
		System.out.println("Fim do programa.");
		
		// Fechamento do Scanner;
		input.close();
	}

}
