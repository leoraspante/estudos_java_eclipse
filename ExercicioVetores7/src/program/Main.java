// Descrição do exercício.

/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

package program;
// Importação das classes.
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Definição do comando Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Declaração de variável para armazenar o tamanho do vetor.
		int vectSize = 0;
		
		// Declaração de variável para armazenar a soma dos valores no vetor.
		double soma = 0;
		
		// Checagem inicial garantindo a entrada válida de dados.
		do {
			System.out.printf("Quantos elementos vai ter o vetor? ");
			vectSize = input.nextInt();
			if(vectSize <= 0) {
				System.out.println("Valor inválido!");
				System.out.println("Digite um valor positivo maior que zero.");
			}
		} while(vectSize <= 0);
		
		// Criação do vetor, tendo como tamanho vectSize.
		double[] vect = new double[vectSize];
		
		// Captura e armazenamento dos dados no vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = input.nextDouble(); // Armazena o valor no vetor na posição i.
			soma += vect[i]; // Incrementa a variável soma com o valor armazenado na posição i do vetor.
		}
		
		System.out.println(); // Quebra de linha.
		
		// Declaração de variável para armazenar a média dos valores no vetor.
		double media = soma/vect.length;
		
		// Exibe a média dos valores no vetor.
		System.out.printf("Media do vetor: %.3f%n", media);
		
		System.out.println(); // Quebra de linha.
		
		// Exibe os elementos abaixo da média.
		System.out.println("Elementos abaixo da média:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		
		// Fechamento do Scanner.
		input.close();

	}

}
