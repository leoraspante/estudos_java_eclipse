package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {
	
	public static Integer readInt(Scanner sc, String message) {
		while(true) {
			try {
				System.out.printf(message);
				Integer value = sc.nextInt();
				sc.nextLine();
				
				if(value <= 0) {
					System.out.printf("%nInforme um valor inteiro maior que zero, tente novamente.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nInforme somente valores numéricos, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}
	
	public static String readString(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				String value = sc.nextLine().trim();
				
				if(value.matches("[a-zA-Z0-9]+")){
					return value;
				}
				else {
					System.out.printf("%nCaractere inválido digitado, tente novamente.%n%n");
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nEntrada inválida, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}
	
	public static Double readDouble(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				Double value = sc.nextDouble();
				sc.nextLine();
				
				if(value < 0) {
					System.out.printf("%nNão é permitido cadastrar valor negativo, tente novamente.%n%n");
				}
				else {
					return value;
				}
				
			}
			catch(InputMismatchException e) {
				System.out.printf("%nInforme somente valores numéricos, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}

	public static String readRemoveItem(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				String value = sc.nextLine().trim();
				
				if(value.matches("[sSnN]")){
					return value;
				}
				else {
					System.out.printf("%nCaractere inválido digitado, tente novamente.%n%n");
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nEntrada inválida, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}
	
	public static Integer readId(Scanner sc, String message, Integer listSize) {
		while(true) {
			try {
				System.out.printf(message);
				Integer value = sc.nextInt();
				sc.nextLine();
				
				if(value < 0 || value > listSize) {
					System.out.printf("%nÍndice não encontrado, tente novamente.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nInforme somente valores numéricos, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}
}
