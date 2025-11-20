package application;

// Importação de classes Locale e Scanner;
import java.util.Locale;
import java.util.Scanner;

// Importação de classe personalizada.
import util.CurrencyConverter;


public class Program {

	public static void main(String[] args) {
		
		// Locale alterado para US permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		// Scanner para a captura de dados na variável input.
		Scanner input =  new Scanner(System.in);
		
		// Definição de variáveis para a captura de dados.
		System.out.printf("What is the dollar price? ");
		double dollarValue = input .nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double dollarAmount = input .nextDouble();
		
		// Saída de dados.
		double result = CurrencyConverter.dollarToReal(dollarValue, dollarAmount);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		
		// Fechamento do Scanner.
		input.close();
		

	}

}
