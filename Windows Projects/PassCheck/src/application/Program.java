package application;

// Importação das classes.
import java.util.Locale;
import java.util.Scanner;
import entities.Student; 

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); // Alteração de local permitindo o uso de ponto como separador decimal.
		Scanner input = new Scanner(System.in); // Scanner definido na variável input.
		Student student = new Student(); // Instanciação da classe Student, definida na variável student.
		
		// Bloco responsável pela entrada de dados.
		System.out.printf("Nome do aluno: ");
		student.nome = input.nextLine();
		System.out.printf("Nota do 1º Trimestre:  ");
		student.primeiroTrimestre = input .nextDouble();
		System.out.printf("Nota do 2º Trimestre:  ");
		student.segundoTrimestre = input .nextDouble();
		System.out.printf("Nota do 3º Trimestre:  ");
		student.terceiroTrimestre = input .nextDouble();
		
		// Bloco responsável pela saída de dados.
		System.out.println();
		System.out.println("RESULTS");
		student.passChecker();
		
		input.close(); // Fechamento do Scanner.
	}

}
