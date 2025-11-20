// Programa para realizar o cálculo de IMC

package application;

// Importação de classes.
import java.util.Scanner;
import java.util.Locale;
import util.IMCCalculator;

public class Program {

	public static void main(String[] args) {
		
		// Local alterado para US permitondo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Scanner definido na variável input para realizar a captura de dados.
		Scanner input = new Scanner(System.in);
		
		// Mensagens de apresentação e instruções de uso.
		System.out.println("Calculador de IMC");
		System.out.println();
		System.out.printf("Informe o seu nome: ");
		String nome = input.nextLine();
		System.out.printf("Informe a sua altura: ");
		double altura = input.nextDouble();
		System.out.printf("Informe o seu peso: ");
		double peso = input.nextDouble();
		
		IMCCalculator imc_calculator = new IMCCalculator(nome, altura, peso);
		
		String imc = imc_calculator.calculate();
		
		// Mensagem de encerramento
		System.out.println();
		System.out.println(imc);
		System.out.println("Fim do programa.");
		
		// Fechamente do Scanner.
		input.close();

	}

}
