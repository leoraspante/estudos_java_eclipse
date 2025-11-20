// Descrição do exercício.

/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
 Mostrar na tela a altura média das pessoas.
 Mostrar a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver. */

package program;

// Importação de classes.
import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		// Definição de local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Instrução inicial.
		System.out.printf("Quantas pessoas serão digitadas ? ");
		int qtdPessoas = input.nextInt();
		
		input.nextLine(); // Limpa o buffer após leitura numérica.
		
		// Criação de um vetor baseado no objeto pessoa.
		Pessoa[] vect = new Pessoa[qtdPessoas];
		
		// Declaração de variável para armazenar a média de altura.
		double somaAltura = 0;
		
		// Declaração de variável para armazenar quantas pessoas são menores de idade.
		int contMenores = 0;
				
		// for para coleta e armazenamento dos dados da pessoa.
		for(int i = 0; i<vect.length; i++) {
			System.out.printf("Dados da %dª Pessoa.%n", i+1);
			
			// // Bloco realizando a captura e armazenamento dos dados no vetor.
			System.out.printf("Nome: ");
			String nome = input.nextLine();
			
			System.out.printf("Idade: ");
			int idade = input.nextInt();
			
			System.out.printf("Altura: ");
			double altura = input.nextDouble();
			
			System.out.println(); // Espaçamento para melhor legibilidade.
			input.nextLine(); // Limpa o buffer após leitura numérica.
			
			// Armazena um novo objeto Pessoa na posição atual do vetor.
			vect[i] = new Pessoa(nome, idade, altura);	
			
			// Obtenção da soma de alturas.
			somaAltura += vect[i].getAltura();
			
			if(vect[i].getIdade() < 16 ) {
				contMenores++;
			}
			
		}
		
		// Altura média das pessoas.
		System.out.printf("Altura média: %.2f%n", somaAltura / vect.length);
		
		// Obtenção do valor percentual.
		double porcentagem = ((double) contMenores / vect.length) * 100;
		
		// Exibição do valor percentual formatado.
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagem);
		
		// Nome das pessoas com menos de 16 anos.
		for(int i = 0; i<vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		// Fechamento do Scanner.
		input.close();

	}

}
