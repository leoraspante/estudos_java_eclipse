package application;

// Importação de classes.
import java.util.Scanner;
import java.util.Locale;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		// Definição de Locale como US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		// Scanner para a captura de dados através da variável input.
		Scanner input = new Scanner(System.in);
		// Instanciação da classe Employee, definida na variável employee.
		Employee employee = new Employee();
		
		// Definição de variáveis para a captura de dados.
		System.out.printf("Name: ");
		employee.name = input.nextLine();
		System.out.printf("Gross Salary: ");
		employee.grossSalary = input.nextDouble();
		System.out.printf("Tax: ");
		employee.tax = input.nextDouble();
		System.out.println();
		
		// Saída de dados.
		System.out.println("Employee: " + employee);
		System.out.println();
		
		// Nova entrada de dados.
		System.out.printf("Which percentage to increase salary?: ");
		double percentage = input.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		
		// Saída de dados.
		System.out.println("Updated data: " + employee);
		
		// Fechamento da classe Scanner.
		input.close();

	}

}
