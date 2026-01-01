package model.services;

import java.util.Scanner;

import model.enums.EmployeeType;
import model.utils.Utils;

public final class Service {

	public static void menuOptions(Scanner sc) {
		
		System.out.println("Menu principal:");
		System.out.println("1. Cadastrar Funcionário");
		System.out.println("2. Listar Funcionários");
		System.out.println("3. Calcular Salários");
		System.out.println("4. Sair");
		
		int menuOption = -1;
		while(menuOption != 4) {
			
			int minValue = 0;
			menuOption = Utils.readInt(sc, "Informe a opção desejada: ", minValue);
			
			switch(menuOption) {
			case 1:
				System.out.println("Cadastro de Funcionários");
				break;
			case 2:
				System.out.println("Funcionários Cadastrados");
				break;
			case 3:
				System.out.println("Cálculo de Salários");
				break;
			case 4:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
	}
	
	public static EmployeeType readEmployeetype(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				EmployeeType value = EmployeeType.valueOf(sc.nextLine().toUpperCase().trim());
				return value;
			}
			catch(IllegalArgumentException e) {
				System.out.printf("%nFunção não cadastrada, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}
	
	
	
	
	
}
