// Descrição do exercício.

/* Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha. */

package program;
// Importação das classes.
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		// Atrbuição do comando Scanner a variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável qtdPessoas.
		int qtdPessoas = 0;
		
		// Checagem inicial para garantir a entrada correta de dados.
		do {
			System.out.printf("Quantas pessoas você vai digitar? ");
			qtdPessoas = input.nextInt();
			if(qtdPessoas <= 0) {
				System.out.println("Valor inválido");
				System.out.println("Digite um valor positivo maior que zero.");
			}
		} while(qtdPessoas <= 0);
		
		// Criação de vetor para armazenar nomes.
		String[] vectNome = new String[qtdPessoas];
		
		// Criação de vetor para armazenar idades.
		int[] vectIdade = new int[qtdPessoas];
		
		// Captura e armazenamento do nome e idade da pessoa.
		for(int i = 0; i < vectNome.length; i++) {
			System.out.printf("Dados da %dª pessoa:%n", i+1); // Informa o número da pessoa, cujo dado esta sendo preenchido.
			System.out.printf("Nome: ");
			input.nextLine();
			vectNome[i] = input.nextLine(); // Armazena o nome da pessoa no vetor.
			System.out.printf("Idade: ");
			vectIdade[i] = input.nextInt(); // Armazena a idade da pessoa no vetor.
			System.out.println(); // Quebra de linha.
			
		}
		
		// Criação de uma variável para armazenar a maior idade.
		int maiorIdade = vectIdade[0];
		
		// Criação de uma variável para armazenar o índice que corresponde a maior idade.
		int indice = 0;
		
		// loop for percorrendo o vectIdade em busca do maior valor.
		for (int i = 1; i < vectIdade.length; i++) {
			if(vectIdade[i] > maiorIdade) {
				maiorIdade = vectIdade[i];
				indice = i;
			}
		}
				
		// Exibição da pessoa mais velha.
		System.out.println("Pessoa mais velha: " + vectNome[indice]);
		
		// Fechamento do Scanner.
		input.close();

	}

}
