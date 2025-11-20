package program;

// Importação de classes.
import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Main {

	public static void main(String[] args) {

		// Alteração da localidade para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		// Habilitação do Scanner na variável input, permitindo a captura de dados.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação e instrução ao usuário.
		System.out.println("Programa para a armazenar produtos e valores em um vetor");
		System.out.println("Apenas para fins didáticos");
		System.out.println();
		System.out.printf("Informe quantos produtos deseja cadastrar: ");
		
		// Definição de variável armazenando a quantidade de produtos a serem cadastrados.
		int qtdProdutos = input.nextInt();
		System.out.println();
		
		// Criação do vetor para armazenar os produtos, tendo como tamanho a qtdProdutos.
		Product[] produtos = new Product[qtdProdutos];
		
		// Criação do loop for, onde o vetor será preenchido.
		for (int i = 0; i < produtos.length; i++) {
			input.nextLine();
			System.out.printf("Informe o nome do produto %d: ", i + 1);
			// Definição de variável para armazenar o nome do produto.
			String nome = input.nextLine();
						
			System.out.printf("Informe o preço do produto %d: ", i + 1);
			// Definição de variável para armazenar o preço do produto.
			double preco = input.nextDouble();
			System.out.println();
			
			// Criação do novo objeto no vetor.
			produtos[i] = new Product();
			
			// Armazenamento do nome e valor.
			produtos[i].setNomeProduto(nome);
			produtos[i].setPrecoProduto(preco);
		}
		
		// Definição de variável para armazenar a soma de todos os produtos.
		double soma = 0.0;
		
		// Criação de loop for, coletando todos os preços no vetor.
		for(int i = 0; i < produtos.length; i++) {
			// Obtenção de cada valor e acrescentado a variável soma.
			soma += produtos[i].getPrecoProduto();
		}
		
		// Definição da média dos preços.
		double media = soma / produtos.length;
		
		// Mensagem de retorno ao usuário.
		System.out.printf("O preço médio dos produtos é: %.2f%n", media);
		System.out.println();
		System.out.println("Fim do programa.");
		
		// Fechamento do Scanner.
		input.close();		

	}

}
