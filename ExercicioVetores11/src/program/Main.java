// Descrição do exercício.

/* Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens. */

package program;

// Importação das classes.
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Atribuição do Scanner a variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável armazenando a quantidade de pessoas.
		int qtdPessoas = 0;
		
		// Validação inicial garantindo a entrada válida de dados.
		do {
			System.out.printf("Quantas pessoas serão digitadas? ");
			qtdPessoas =  input.nextInt();
			if(qtdPessoas <= 0) {
				System.out.println("Valor inválido!");
				System.out.println("Digite uma valor positivo maior que zero.");
			}
		} while(qtdPessoas <=0 );
		
		System.out.println(); // Quebra de linha.
		
		// Criação de vetor armazenando a altura das pessoas, tamanho definido por qtdPessoas.
		double[] vectAltura = new double [qtdPessoas];
		
		// Criação de vetor armazenando o gênero das pessoas, tamanho definido por qtdPessoas.
		String[] vectGen = new String [qtdPessoas];
		
		// Captura e armazenamento de dados nos vetores.
		for(int i = 0; i < qtdPessoas; i++) {
			System.out.printf("Altura da %dª pessoa: ", i+1);
			vectAltura[i] = input.nextDouble(); // Armazena a altura da pessoa na posição i do vetor.
			System.out.printf("Gênero da %dª pessoa: ", i+1);
			vectGen[i] = input.next(); // Armazena o gênero da pessoa na posição i do vetor.
			System.out.println(); // Quebra de linha.
		}
		
		// Definição de variável para armazenar a menor altura.
		double menorAltura = vectAltura[0];
		
		// Definição de variável para armazenar a maior altura.
		double maiorAltura = vectAltura[0];
		
		// Definição de variável armazenando a média de altura das mulheres.
		double alturaMulheres = 0;
		
		// Definição de variável armazenando a quantidade de mulheres.
		int qtdMulheres = 0;
		
		// Definição de variável armazenando a quantidade de homens.
		int qtdHomens = 0;
		
		// Obtenção das alturas, percorrendo os vetores com for.
		for(int i = 1; i < qtdPessoas; i++) {
			if(vectAltura[i] > maiorAltura) { // Condição buscando a maior altura.
				maiorAltura = vectAltura[i];
			}
			if(vectAltura[i] < menorAltura) { // Condição buscando a menor altura.
				menorAltura = vectAltura[i];
			}
		}
		
		// Obtenção de dados especificos percorrendo os vetores com for.
		for(int i = 0; i < qtdPessoas; i++) {
			if(vectGen[i].equalsIgnoreCase("F")) { // Condição buscando a qtd de mulheres e alturas combinadas.
				qtdMulheres++;
				alturaMulheres += vectAltura[i];
			}
			else {
				qtdHomens++; // 
			}
		}
		
		// Variável armazenando a média de altura das mulheres.
		double mediaMulheres = (alturaMulheres/(double)qtdMulheres);
		
		// Exibição das alturas.
		System.out.println("Menor altura: " + menorAltura);
		System.out.println("Maior altura: " + maiorAltura);
		
		// Exibição da média de altura das mulheres.
		System.out.printf("Altura média das mulheres: %.2f%n", mediaMulheres);
		
		// Exibição da quantidade de homens.
		System.out.println("Quantidade de homens: " + qtdHomens);
		
		// Fechamento do Scanner.
		input.close();

	}

}
