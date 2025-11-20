// Descrição do exercício.

/* Fazer um programa para ler um número inteiro N e os dados (nome e
preço) de N Produtos. Armazene os N produtos em um vetor. Em
seguida, mostrar o preço médio dos produtos. */

package program;

// Importações
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Atribuição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável armazenando a quantidade de produtos.
		int qtdProdutos = 0;
		
		// Checagem inicial garantindo a entrada válida de dados.
		do {
			System.out.print("Quantos produtos deseja cadastrar? ");
			qtdProdutos = input.nextInt();
			if(qtdProdutos <= 0) {
				System.out.println("Quantidade inválida!");
				System.out.println("Digite um número positivo maior que zero.");
			}
		} while(qtdProdutos <= 0);
		
		System.out.println(); // Quebra de linha.
		
		// Criação de vetores armazenando dados dos produtos, nome, preço e quantidade.
		String[] vectNome = new String[qtdProdutos];
		double[] vectPreco = new double[qtdProdutos];
		int[] vectQtd = new int[qtdProdutos];
		
		// Captura e armzenamento dos dados nos vetores.
		for(int i = 0; i < qtdProdutos; i++) {
			input.nextLine();
			System.out.print("Informe o nome do produto: ");
			vectNome[i] = input.nextLine(); // Cadastra o nome do produto no vetor.
			System.out.print("Informe o valor do produto: ");
			vectPreco[i] = input.nextDouble(); // Cadastra o preço do produto no vector.
			System.out.print("Informe a quantidade do produto: ");
			vectQtd[i] = input.nextInt(); // Cadastra a quantidade do produto no vetor.
			System.out.println(); // Quebra de linha.
		}
		
		// Definição de variável armazenando o valor de todos os produtos.
		double somaTotal = 0;
		
		// Loop for percorrendo vectPreco.
		for(int i = 0; i < qtdProdutos; i++) {
			somaTotal += vectPreco[i]; // Incrementa os valores dos produtos a variável somaTotal.
		}
		
		// Exibição da média dos valores cadastrados no vectPreco.
		System.out.printf("Média dos valores: %.2f%n", somaTotal/qtdProdutos);
		
		// Fechamento do Scanner.
		input.close();

	}

}
