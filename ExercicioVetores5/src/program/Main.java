// Descrição do exercício.

/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */

package program;
// Importação de classes.
import java.util.Locale;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Definição do comando Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Declaração de variável qtdNumeros.
		int qtdNumeros = 0;
		

		
		// Checagem inicial garantindo a entrada de um valor válido.
		do {
			System.out.printf("Quantos números você vai digitar? ");
			qtdNumeros = input.nextInt();
			if(qtdNumeros <= 0) {
				System.out.println("Número inválido!");
				System.out.println("Informe um valor positivo e maior que zero.");
			}
		} while(qtdNumeros <=0);
		
		// Definição de um vetor, tendo como tamanho qtdNumeros.
		double[] vect = new double[qtdNumeros];
		
		// Captura e armazenamento de dados no vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = input.nextDouble(); // Armazena o dado no vertor na posição i.
		}
		
		// Declaração de variável maiorValor.
		double maiorValor = vect[0];
		
		// Declaração de variável posicaoMaior.
		int indice = 0;
		
		// Obtenção do maior valor dentro do vetor.
		for(int i = 1; i < vect.length; i++) {
			if(vect[i] > maiorValor) {
				maiorValor = vect[i];
				indice = i;				
			}
		}
		
		System.out.println(); // Quebra de linha.
		
		// Exibição do maior valor.
		System.out.println("Maior valor: " + maiorValor);
		
		System.out.println(); // Quebra de linha.
		
		// Exibição da posição no vetor do maior valor.
		System.out.println("Posição do maior valor: " + indice);
		
		// Fechamento do Scanner;
		input.close();

	}

}
