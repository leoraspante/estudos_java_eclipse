// Descrição do exercício.

// Atividade voltada a prática do uso de Switch Case, visto no youtube Bro Code.

package application;

// Importações.
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Alteração do local para US, permitindo o uso de ponto como separador decimal.
		
		Scanner sc = new Scanner(System.in); // Definição do Scanner na variável sc.
		
		System.out.println("Calculadora básica"); // Mensagem de apresentação.
		System.out.println(); // Quebra de linha para melhor legibilidade.
		
		// Declaração de variáveis.
		double num1, num2, result = 0.0;
		char operator;
		boolean validOperator = true;
		
		// Coleta de dados.
		System.out.print("Informe o primeiro valor: ");
		num1 = sc.nextDouble();
		
		System.out.print("Informe o operador (+) (-) (*) (/) (^): ");
		operator = sc.next().charAt(0);
		
		System.out.print("Informe o segundo valor: ");
		num2 = sc.nextDouble();
		
		// Implementação do switch case.
		switch(operator) {
		case '+' -> result = num1 + num2; // Adição.
		case '-' -> result = num1 - num2; // Subtração.
		case '*' -> result = num1 * num2; // Divisão.
		case '^' -> result = Math.pow(num1, num2); // Potenciação.
		
		// Case especial lidando com a divisão por zero.
		case '/' ->{
			if(num2 == 0) { // Verifica se num2 é igual a zero.
				System.out.println("Não é possível dividir por zero."); // Mensagem de advertência
				validOperator = false; // Altera para false o operador, impedindo a exibição do resultado como 0.
			}
			else {
				result = num1 / num2;
			}
		}
		default -> { // Condição caso um dos operadores pré definidos não seja escolhido.
			System.out.println("Operador inválido."); // Mensagem de advertência.
			validOperator = false; // Altera para false o operador, impedindo a exibição do resultado como 0.
		}
		}
		
		System.out.println(); // Quebra de linha para melhor legibilidade
		
		if(validOperator) { // Exibe o resultado caso o operador seja válido.
			System.out.println("Resultado: " + result);
		}
		
		sc.close(); // Fechamento do Scanner.

	}

}
