// Atividade prática seção 9.

package application;

//Importação das classes
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		// Definição do Locale para US.
		Locale.setDefault(Locale.US);
		
		// Definição do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Controle Bancário");
		System.out.println("------------------------------------------------");
		System.out.println();
		
		// Definição de variáveis para a captura de dados do cliente.
		System.out.printf("Informe o número da conta a ser cadastrada: ");
		int number = input.nextInt();
		input.nextLine(); // Consome o '\n' deixado pelo nextLine()
		System.out.printf("Informe o nome do cliente: ");
		String name = input.nextLine();
		System.out.printf("Deseja realizar um depósito inicial? (Y/N): ");
		String deposito = input.next().toUpperCase();
		
		// Declaração de variável balance, com valor padrão.
		double balance = 0.0;
		
		// Definição de if verificando se haverá depósito inicial.
		if (deposito.equals("Y")){
			System.out.printf("Informe o valor que deseja depositar: ");
			balance = input.nextDouble();
		}

		// Criação do objeto conta e seus parâmetros de entrada.
		Account account = new Account(number, name, balance);
		
		//Primeira saída de dados - Conferência de cadastro.
		System.out.println("------------------------------------------------");
		System.out.println("Cliente cadastrado com sucesso.");
		System.out.println("Nome: " + account.getName());
		System.out.println("Número da conta: " + account.getNumber());
		System.out.println("Saldo em conta: R$ " + String.format("%.2f", account.getBalance()));
		
		// Primeira alteração de saldo bancário - Operação de Depósito.
		System.out.println("------------------------------------------------");
		System.out.printf("Informe o valor a ser depositado: ");
		balance = input.nextDouble();
		account.addBalance(balance);
		
		// Segunda saída de dados com saldo atualizado.
		System.out.println("------------------------------------------------");
		System.out.println("Bem vindo de volta: " + account.getName());
		System.out.println("Saldo em conta: R$ " + String.format("%.2f", account.getBalance()));
		
		// Segunda alteração de saldo bancário - Operação de Saque.
		System.out.println("------------------------------------------------");
		System.out.printf("Informe o valor a ser sacado: ");
		balance = input.nextDouble();
		account.removeBalance(balance);
		
		// Terceira saída de dados com saldo atualizado.
		System.out.println("------------------------------------------------");
		System.out.println("Bem vindo de volta: " + account.getName());
		System.out.println("Saldo em conta: R$ " + String.format("%.2f", account.getBalance()));
		
		// Fim do programa.
		System.out.println("------------------------------------------------");
		System.out.println("Fim do programa.");
		
		// Fechamente do Scanner.
		input.close();
	}

}
