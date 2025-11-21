// Descrição do exercício.

/* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada. */

package program;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		int qtdEmpregados = 0;
		
		// Valida entrada numérica.
		do {
			System.out.print("How many employees will be registered? ");
			qtdEmpregados = sc.nextInt();
			sc.nextLine(); // Consome quebra de linha.
			if(qtdEmpregados <=0) {
				System.out.printf("Invalid value!%nEnter an integer greater than zero.%n");
			}
		} while(qtdEmpregados <=0);
		System.out.println();
		
		// Captura e registro dos dados.
		for(int i=0; i<qtdEmpregados; i++) {
			System.out.printf("Employee #%d%n", i+1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine(); // Consome quebra de linha.
			
			while(hasId(list, id)) { // Utiliza o método para verificar a unicidade do id.
				System.out.println("Id already taken, try again!");
				System.out.print("Id: ");
				id = sc.nextInt();
				sc.nextLine(); // Consome quebra de linha.
			}
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary)); // Registro dos dados na lista.
			System.out.println();
		}
		
		// Coleta de dados para aumentar salário.
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSearch = sc.nextInt();
		sc.nextLine(); // Consome quebra de linha.
				
		// Encontrando ID para aumentar salário.
		boolean found = false;
		for(Employee obj : list) {
			if(obj.getId() == idSearch) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				obj.increaseSalary(percentage);
				found = true;
				break;
			}
		}
		
		if(!found) { // Mensagem de erro, caso id não exista.
			System.out.println("This id does not exist!");
		}
		System.out.println();
		
		// Exibição atualizada de funcionários.
		System.out.println("List of employees:");
		for(Employee obj : list) {
			System.out.println(obj);
		}
			
		sc.close();
	}
	
	public static boolean hasId(List<Employee> list, int id) { // Garante a unicidade do id.
		for(Employee obj : list) {
			if(obj.getId() == id) {
				return true;
			}
		}
		return false;
	}

}
