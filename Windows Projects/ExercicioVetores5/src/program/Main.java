// Descrição do exercício.

/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero).  */

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
		
		System.out.printf("Quantos números você vai digitar? ");
		int qtdNumeros = input.nextInt();
		
		// Criação de um vetor, cujo tamanho é definido por qtdNumeros.
		double[] vect = new double[qtdNumeros];
		
		// Criação do loop for para captura e armazenamento dos valores digitados pelo usuário.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: "); // Solicita o dado do usuário.
			vect[i] = input.nextDouble(); // Registra o dado no vetor na posição i do loop.
		}
		
		System.out.println(); // Espaçamento para melhor legibilidade.
		
		// Declaração variável para armazenar o maior valor.
		double maiorValor = vect[0];
		
		// Declaração de variável para armazenar o índice do maior valor no vetor.
		int indice = 0;
		
		// Loop for percorrendo o vetor.
		for(int i = 1; i < vect.length; i++) {
			if(vect[i] > maiorValor) { // Verifica se o valor armazenado no vetor na posição i é maior que o valor presente na variável maiorValor.
				maiorValor = vect[i]; // Atribui o valor a variável maiorValor caso a condição seja atendida.
				indice = i; // Atualiza o índice, de acordo com a posição do maior valor encontrado.
			}
		}
		
		// Saída de dados.
		System.out.printf("Maior valor: %.2f%n", maiorValor);
		System.out.printf("Posição do maior valor: %d%n", indice);
		
		// Fechamento do Scanner.
		input.close();

	}

}
