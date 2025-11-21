// Atividade apenas para fins de prática de ferramentas já utilizadas nos estudos anteriores.

package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		List<Aluno> listAluno = new ArrayList<>();
		
		// Menu inicial.
		System.out.println("--------------------------------Controle escolar--------------------------------");
		System.out.println();
		System.out.println("Menu de opções");
		System.out.println("1 - Cadastrar aluno");
		System.out.println("2 - A ser implementado...");
		System.out.println("3 - A ser implementado...");
		System.out.println();
		
		// Bloco validando a escolha do menu de opções
		int escolhaMenu = 0;
		do {
			System.out.print("Escolha a opção desejada: ");
			escolhaMenu = sc.nextInt();
			sc.nextLine(); // Consome quebra de linha.
			if(escolhaMenu <=0) {
				System.out.printf("Valor inválido!%nDigite um número inteiro maior que zero.%n");
			}
		} while(escolhaMenu <=0);
		System.out.println();
		
		// Bloco referente ao cadastro de alunos.
		int qtdAlunos = 0;
		while(escolhaMenu == 1) {
			System.out.println("--------------------------------Cadastro de alunos--------------------------------");
			System.out.println();
			
			do { // Valida entrada numérica.
				System.out.print("Quantos alunos deseja cadastrar? ");
				qtdAlunos = sc.nextInt();
				sc.nextLine(); // Consome quebra de linha.
				if(qtdAlunos <=0) {
					System.out.printf("Valor inválido!%nDigite um número inteiro maior que zero.%n");
				}
			} while(qtdAlunos <=0); 
			
			for(int i=0; i<qtdAlunos; i++) {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Endereço: ");
				String endereco = sc.nextLine();
				System.out.print("Data de nascimento: ");
				String dataNasc = sc.nextLine();
				System.out.print("Nome do pai: ");
				String nomePai = sc.nextLine();
				System.out.print("Nome da mãe: ");
				String nomeMae = sc.nextLine();
				
				listAluno.add(new Aluno(nome, endereco, dataNasc, nomePai, nomeMae)); //Registro dos dados na lista.
				System.out.println();
			}
			
			System.out.println("Para sair digite: 0");
			escolhaMenu = sc.nextInt();
		}
		
		
		System.out.println("saiu");
		
		
		
		
		sc.close();

	}
	
	
}
