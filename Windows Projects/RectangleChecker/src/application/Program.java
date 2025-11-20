package application;

// Importação das classes.
import java.util.Scanner;
import java.util.Locale;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		// Definição de Locale como US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		// Scanner para a captura de dados através da variável input.
		Scanner input = new Scanner(System.in);
		// Habilitação da classe Rectangle, definida na variável rectangle.
		Rectangle rectangle = new Rectangle();
		
		// Definição de variáveis para a captura de dados.
		System.out.println("Enter rectangle width and height:");
		rectangle.width = input.nextDouble();
		rectangle.height = input.nextDouble();
		
		// Saída de dados.
		System.out.println();
		System.out.printf("RESULTS: %n" + rectangle);
		
		// Fechamento da classe Scanner.
		input.close();
	}
}
