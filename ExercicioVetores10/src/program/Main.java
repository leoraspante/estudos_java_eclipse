// Descrição do exercício.

/* Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis). */

package program;
// Importação de classes.
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Atribuição do Scanner a variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variável armazenando a quantidade de alunos.
		int qtdAlunos = 0;
		
		// Validação inicial, garantindo uma entrada válida de dados.
		do {
			System.out.printf("Quantos alunos serão digitados? ");
			qtdAlunos = input.nextInt();
			if(qtdAlunos <=0) {
				System.out.println("Valor inválido");
				System.out.println("Digite um valor positivo maior que zero.");
			}
		} while(qtdAlunos <=0);
		
		System.out.println(); // Quebra de linha.
		
		// Criação de um vetor armazenando o nome dos alunos, tamanho definido por qtdAlunos.
		String[] vectNome = new String[qtdAlunos];
		
		// Criação de um vetor armazenando a nota do 1º semestre, tamanho definido por qtdAlunos.
		double[] vectSem1 = new double[qtdAlunos];
		
		// Criação de um vetor armazenando a nota do 2º semestre, tamanho definido por qtdAlunos.
		double[] vectSem2 = new double[qtdAlunos];
		
		// Captura e armazenamento dos dados nos vetores.
		for(int i = 0; i < qtdAlunos; i++) {
			System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno:%n",i+1);
			input.nextLine();
			vectNome[i] = input.nextLine();
			vectSem1[i] = input.nextDouble();
			vectSem2[i] = input.nextDouble();
			System.out.println(); // Quebra de linha
		}
		
		// Exibição dos alunos aprovados.
		System.out.println("Alunos aprovados:");
		
		// For percorrendo os vetores.
		for(int i = 0; i < qtdAlunos; i++) {
			if((vectSem1[i] + vectSem2[i]) / 2 >= 6) { // Condição para aprovação.
				System.out.println(vectNome[i]);
			}
		} 
		
		// Fechamento do Scanner.
		input.close();

	}

}
