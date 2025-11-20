// Descrição do exercício.

/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package program;
// Importação de classes.
import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US, permiitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);

		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Quantas pessoas serão digitadas? ");
		int qtdPessoas = input.nextInt();
		
		// Criação de um vetor baseado no objeto Pessoa.
		Pessoa[] vect = new Pessoa[qtdPessoas];
		
		// Declaração de variável armazenando a altura das pessoas.
		double alturaPessoas = 0;
		
		// Declaração de variável armazenando a quantidade de pessoas menores de 16.
		int qtdMenores16 = 0;
		
		// For registrando os valores no vetor.
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Dados da %dª pessoa:%n", i+1);
			
			input.nextLine(); // Consome a quebra de linha.
			System.out.printf("Nome: ");
			String nome = input.nextLine(); // Captura o nome da pessoa.
			
			System.out.printf("Idade: ");
			int idade = input.nextInt(); // Captura a idade da pessoa.
			
			System.out.printf("Altura: ");
			double altura = input.nextDouble(); // Captura a altura da pessoa.
			
			// Bloco onde os valores capturados acima, são registrados no vetor, lembrando que cada item no vetor se comporta como um objeto do tipo pessoa.
			vect[i] = new Pessoa(nome, idade, altura);
			
			// Obtenção da altura das pessoas.
			alturaPessoas += vect[i].getAltura();
			
			System.out.println(); // Quebra de linha.
			
			// Obtenção de pessoas menores de 16 anos.
			if(vect[i].getIdade() < 16) {
				qtdMenores16++;
			}
		}
				
		// Exibição da altura média das pessoas.
		System.out.printf("Altura média: %.2f%n", alturaPessoas/vect.length);
		
		System.out.println(); // Quebra de linha.
		
		// Exibição das pessoas com menos de 16 anos.
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", ((double)qtdMenores16/vect.length)*100);
		
		// Exibição dos nomes das pessoas menores que 16 anos.
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		// Fechamento do Scanner.
		input.close();
	}

}
