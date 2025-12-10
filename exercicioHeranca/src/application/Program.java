// Descrição do exercício.

/* Uma empresa possui funcionários próprios e terceirizados.
Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizado
possuem ainda uma despesa adicional.
O pagamento dos funcionários corresponde ao valor da hora
multiplicado pelas horas trabalhadas, sendo que os
funcionários terceirizados ainda recebem um bônus
correspondente a 110% de sua despesa adicional.
Fazer um programa para ler os dados de N funcionários (N
fornecido pelo usuário) e armazená-los em uma lista. Depois
de ler todos os dados, mostrar nome e pagamento de cada
funcionário na mesma ordem em que foram digitados. */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		System.out.println();
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.printf("Employee #%d data:%n", i+1);
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			Employee emp;
			
			if(outsourced == 'y') {	
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
			}
			else {
				emp = new Employee(name, hours, valuePerHour);
			}
			
			employees.add(emp);
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee e : employees) {
			System.out.printf("%s - $ %.2f%n",e.getName(), e.payment());
		}
		
		
		sc.close();
	}

}
