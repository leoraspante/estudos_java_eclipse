package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	public static Integer readInt(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				int value = sc.nextInt();
				sc.nextLine();
				return value;
			}
			catch(InputMismatchException e) {
				System.out.printf("%nDigite apenas caracteres numéricos.%nTente novamente.%n%n");
				sc.nextLine();
			}
		}
	}
	
	public static String checkOperator(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				String value = sc.nextLine().trim();
				if(value.equals("+") || value.equals("-") || value.equals("*") || value.equals("/")){
					return value;
				}
				else {
					System.out.printf("%nOperador inválido, tente novamente.%n%n");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Digite apenas um dos seguintes operadores.%nAdição: '+', Subtração: '-', Multiplicação '*' ou Divisão '/'.%nTente novamente%n%n");
				sc.nextLine();
			}
		}
	}
	
	
	
	
}
