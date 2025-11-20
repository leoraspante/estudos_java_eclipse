// Descrição do exercício.

/* Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

package program;
// Importação de classes.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável qtdvalores.
		int qtdValores = 0;
		
		// Checagem inicial garantindo a entrada válida de dados.
		do {
			System.out.printf("Quantos valores cada vetor vai ter? ");
			qtdValores = input.nextInt();
			if(qtdValores <= 0) {
				System.out.println("Valor inválido!");
				System.out.println("Informe um valor positivo maior que zero.");
			}
		}while(qtdValores <= 0);
		
		// Criação do vetor A.
		int[] vectA = new int[qtdValores];
		
		// Criação do vetor B.
		int[] vectB = new int[qtdValores];
		
		// Criação do vetor resultante.
		int[] vectResult = new int[qtdValores];
		
		input.nextLine();
		
		// Captura e armazenamento de dados no vetor A.
		System.out.println("Digite os valores do vetor A:");
		for(int i = 0; i < vectA.length; i++) {
			System.out.printf("Informe o %dº valor: ", i+1);
			vectA[i] = input.nextInt(); // Armazena o valor digitado pelo usuário no vetor.
		}
		
		System.out.println(); // Quebra de linha.
		
		// Captura e armazenamento de dados no vetor B.
		System.out.println("Digite os valores do vetor B:");
		for(int i = 0; i < vectB.length; i++) {
			System.out.printf("Informe o %dº valor: ", i+1);
			vectB[i] = input.nextInt(); // Armazena o valor digitado pelo usuário no vetor.
		}
		
		System.out.println(); // Quebra de linha.
		
		// Soma dos valores presentes no vetor A e B, no vetor resultante.
		System.out.println("Vetor resultante:");
		for(int i = 0; i < vectResult.length; i++) {
			vectResult[i] = vectA[i] + vectB[i]; // Soma e armazenamento do resultado.
			System.out.println(vectResult[i]);
		}
		
		// Fechamento do Scanner.
		input.close();

	}

}
