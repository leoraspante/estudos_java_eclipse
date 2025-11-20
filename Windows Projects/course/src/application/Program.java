package application;

// Importação de classes, Scanner, Locale e Triangle.
import java.util.Scanner;
import java.util.Locale;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		// Definição de localidade para US, permitindo o uso de ponto como separadador de casa decimal.
		Locale.setDefault(Locale.US);
		//Scanner permitindo a captura de dados via console, atrivuida a variável input.
		Scanner input = new Scanner(System.in);
		
		// Mensagem de apresentação do programa.
		System.out.println("Triangle area calculator");
		System.out.println();
		
		// Chamada da classe Triangle.
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		// Definição das variáveis aproveitando os recursos da classe Triangle.
		System.out.println("Enter the measures of triangle X:");
		x.a = input.nextDouble(); // Lado A do triângulo X.
		x.b = input.nextDouble();
		x.c = input.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		y.a = input.nextDouble(); // Lado A do triângulo Y.
		y.b = input.nextDouble();
		y.c = input.nextDouble();
		
		
		// Chamadada função area para calcular a área dos triângulos.
		double areaX = x.area();
		double areaY = y.area();
		
		// Mensagens de saída.
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		// If/Else comparando os tamanhos de áreas dos triângulos.
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
		// Mensagem de encerramento.
		System.out.println();
		System.out.println("Fim do programa.");
		
		//Fechamento do comando Scanner.
		input.close();
	}

}
