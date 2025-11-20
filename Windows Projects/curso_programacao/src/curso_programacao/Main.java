package curso_programacao;

// Importação da biblioteca Scanner.
import java.util.Scanner;

// Importação da biblioteca Locale.
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// Chamada da biblioteca Locale.
		Locale.setDefault(Locale.US);
		
		// Chamada do comando Scanner e definição da variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.printf("Indicador de coordenadas%n");
		
		// Mensagem solicitando o input do usuário.
		System.out.printf("%nInforme os valores desejados.%n");
		
		// Variáveis recebendo o salário do usuário.	
		double valor_x  = input.nextDouble();
		double valor_y  = input.nextDouble();
		System.out.println(" ");

		
		// Condicionais IF/ELSE.
		// Condição de origem.
		if (valor_x == 0 && valor_y == 0) {
			System.out.printf("O ponto está na origem");
		}
		// Ponto sobre eixo Y.
		else if (valor_x == 0) {
			System.out.printf("O ponto está sobre o eixo Y");
		}
		// Ponto sobre eixo X.
		else if (valor_y == 0) {
			System.out.printf("O ponto está sobre o eixo X");
		}
		// Ponto sobre Q1.
		else if (valor_x > 0 && valor_y > 0) {
			System.out.printf("O ponto está sobre Q1");
		}
		// Ponto sobre Q2.
		else if (valor_x < 0 && valor_y > 0) {
			System.out.printf("O ponto está sobre Q2");
		}	
		// Ponto sobre Q3.
		else if (valor_x < 0 && valor_y < 0) {
			System.out.printf("O ponto está sobre Q3");
		}			
		// Ponto sobre Q4.
		else if (valor_x > 0 && valor_y < 0) {
			System.out.printf("O ponto está sobre Q4");
		}
		
		// Fechamento do comando Scanner.
		input.close();
	}
}
 