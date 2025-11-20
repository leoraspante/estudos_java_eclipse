// Descrição do exercício.

/* Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */

package program;
// Importação das classes.
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável para determinar o tamanho do vetor.
		int vectSize = 0;
		
		// Definição de variável para armazenar a soma dos valores presentes no vetor.
		int soma = 0;
		
		// Definição de variável para armazenar a quantidade de números pares.
		int qtdPares = 0;
		
		// Checagem inicial garantindo a entrada válida de valores.
		do {
			System.out.printf("Quantos elementos vai ter o vetor? ");
			vectSize = input.nextInt();
			if(vectSize <= 0) {
				System.out.println("Valor inválido!");
				System.out.println("Informe um valor positivo maior que zero.");
			}
		} while(vectSize <= 0);
		
		// Criação de um vetor tendo como tamanho vectSize.
		int[] vect = new int[vectSize];
		
		// Captura e armazenamento de dados no vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite um número: ");
			vect[i] = input.nextInt();
		}
		
		// Criação de variável booleana para controle de paridade.
		boolean isPar = false;
		
		// Verifica se o vetor possui valores do tipo par.
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] % 2 == 0) {
				soma += vect[i]; // Incrementa os valores a variável soma.
				qtdPares++; // Armazena a quantidade de números pares.
				isPar = true;
			}
		}
		
		// Definição de variável para armazenar a média.
		double media = soma/qtdPares;
		
		System.out.println(); // Quebra de linha.
		
		// Exibição dos resultados.
		if(isPar) {
			System.out.printf("Média dos pares: %.1f", media);
		} else {
			System.out.println("Nenhum número par.");
		}
		
		
		//Fechamento do Scanner.
		input.close();

	}

}
