package program;

// Importação de classes.
import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Habilitação do Scanner para a captura de dados via console.
		Scanner input = new Scanner(System.in);
		
		// Mensagens de apresentação e instrução.
		System.out.println("Programa para ler a altura das pessoas e retornar a média.");
		System.out.println();
		System.out.printf("Informe de quantas pessoas deseja informar a altura: ");
		
		// Variável capturando a quantidade de pessoas.
		int qtd_pessoas = input.nextInt();
		
		// Criação do vetor, tendo como tamanho a qtd_pessoas.
		Pessoa[] pessoas = new Pessoa[qtd_pessoas];
		
		// Criação do loop for, onde o vetor será preenchido.
		for(int i = 0; i < qtd_pessoas; i++) {
			
			// Mensagem de instrução ao usuário.
			System.out.printf("Informe a altura da pessoa %d: ", i + 1);
			
			// Criação de variável para receber a altura do usuário.
			double altura = input.nextDouble();
			
			// Criação de um novo objeto Pessoa e armazena este objeto na posição [i] do vetor pessoas.
			pessoas[i] = new Pessoa();
			
			// Utilização do método setAltura, onde é definida a altura do objeto criado anteriormente.
			pessoas[i].setAltura(altura);
			
		}
		
		// Definição de variável para acumular a altura das pessoas.
		double soma = 0.0;
		
		// Loop for varrendo o vetor e coletando a altura de cada pessoa.
		for(int i = 0; i < qtd_pessoas; i++) {
			// Obtenção da altura de cada pessoa e acrescentando a variável soma.
			soma += pessoas[i].getAltura();
		}
		
		// Definição da médias das pessoas.
		double media = soma / qtd_pessoas;
		
		// Mensagem de retorno ao usuário.
		System.out.println();
		System.out.printf("A altura média das pessoas é: %.2f%n", media);
		System.out.println();
		System.out.println("Fim do programa.");
		
		// Fechamento do Scanner.
		input.close();

	}

}
