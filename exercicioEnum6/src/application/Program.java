package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		do {
			System.out.println("========== Menu de Opções ==========");
			System.out.println("1  - Cadastrar funcionário");
			System.out.println("2  - Cadastrar fornecedor");
			System.out.println("3  - Cadastrar cliente");
			System.out.println("4  - Cadastrar produto");
			System.out.println("5  - Criar pedido");
			System.out.println("6  - Listar pedidos");
			System.out.println("7  - Listar funcionários");
			System.out.println("8  - Listar fornecedores");
			System.out.println("9  - Listar clientes");
			System.out.println("10 - Listar produtos");
			System.out.println("0  - Sair");
			System.out.println(); // Espaçamento para melhor legibilidade.
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			sc.nextLine(); // Consome quebra de linha pendente.
			if(opcao < 0 || opcao > 10) {
				System.out.printf("%nValor inválido!%nDigite uma opção válida.%n%n");
			}
			switch(opcao) {
			case 1:
				System.out.println(">>> Cadastro de funcionário");
				System.out.print("Informe a idade: ");
				int age = sc.nextInt();
				break;
				
				
			case 0:
				System.out.printf("%nSair.%nPrograma finalizado.");
				break;
			}
		} while (opcao != 0);
		
		
		
		sc.close();
	}

}
