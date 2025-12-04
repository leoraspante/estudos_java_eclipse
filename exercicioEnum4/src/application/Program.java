// Atividade prática sugerida pelo Copilot.

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Aluno;
import entities.enums.AlunoStatus;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Aluno> alunos = new ArrayList<>();
		
		// Mensagens de apresentação.
		System.out.println("-------------------------Atividade de revisão-------------------------");
		System.out.println();
		System.out.println("Temas abordados: ");
		System.out.println();
		System.out.println("listas, classes, enum, laços e toString.");
		System.out.println();
		
		System.out.println("----------------------------------------------------------------------"); // Separador de blocos
		
		// Mensagens de instrução.
		System.out.println();
		System.out.println("O Sistema consiste nas seguintes etapas:");
		System.out.println();
		System.out.println("1 - Cadastrar alunos, garantindo uma entrada numérica válida.");
		System.out.println("2 - Exibição dos alunos cadastrados tendo ID's únicas.");
		System.out.println("3 - Permitir a escolha de um aluno por seu ID.");
		System.out.println("4 - Exibir os dados do aluno escolhido.");
		System.out.println();

		System.out.println("--------------------------Cadastro de Alunos--------------------------");
		System.out.println();
		
		// Bloco validando a entrada numérica.
		int qtdAlunos = 0;
		do {
			System.out.print("Informe quantos alunos deseja cadastrar: ");
			qtdAlunos = sc.nextInt();
			sc.nextLine();
			if(qtdAlunos <= 0) {
				System.out.printf("%nValor inválido!%nInforme um número inteiro maior que zero.%n%n");
			}
		} while (qtdAlunos <= 0);
		
		// For coletando e registrando os dados do aluno.
		for(int i = 0; i<qtdAlunos; i++) {
			System.out.printf("%nRegistro do aluno nº%d:%n", i+1); // +1 Garantindo uma saída de dados mais amigável ao usuário.
			System.out.print("Nome do aluno: ");
			String nome = sc.nextLine();
			
			System.out.print("Data de nascimento (DD/MM/YYYY): ");
			LocalDate birthDate = LocalDate.parse(sc.next(), fmt);
			
			System.out.print("Status (ATIVO ou INATIVO): ");
			AlunoStatus status = AlunoStatus.valueOf(sc.next());
			sc.nextLine();
			
			Aluno aluno = new Aluno(nome, birthDate, status); // Cria o objeto aluno.
			alunos.add(aluno); // Adiciona o objeto aluno criado anteriormente a lista.
		}
		
		System.out.println();
		
		// Exibição dos alunos cadastrados.
		System.out.println("--------------------------Alunos Cadastrados--------------------------");
		System.out.println("");
		for(int i = 0; i<alunos.size(); i++) {
			System.out.printf("ID %d - Nome do Aluno: %s. Data de nascimento: %s%n", i+1, alunos.get(i).getName(), alunos.get(i).getBirthDate().format(fmt) );
			
		}
		
		System.out.println();
		
		// Seleção de um aluno cadastrado por ID.
		System.out.println("-------------------------Busca de Aluno por ID------------------------");
		int alunoId = -1;
		do {
			System.out.print("Informe a ID do aluno desejado: ");
			alunoId = sc.nextInt()-1;
			sc.nextLine();
			if(alunoId < 0 || alunoId >= alunos.size()) {
				System.out.printf("%nAluno não cadastrado!%nInforme um número de ID existente.%n%n");
			}
		} while(alunoId < 0 || alunoId >= alunos.size());
		
		Aluno alunoEscolhido = alunos.get(alunoId);
		
		System.out.println();
		
		// Exibição do aluno escolhido.
		System.out.println("-----------------------Dados do Aluno escolhido-----------------------");
		System.out.println();
		System.out.println(alunoEscolhido);
		
		sc.close();
	}

}
