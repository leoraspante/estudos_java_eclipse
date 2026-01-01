package model.utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {
	
	public static int readInt(Scanner sc, String message, int minValue) {
		while(true) {
			try {
				System.out.print(message);
				int value = sc.nextInt();
				sc.nextLine();
				if(value < minValue) {
					System.out.printf("%nO valor %d não é aceito, informe um valor superior. Tente novamente.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nInforme apenas caracteres numéricos, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}

	public static String readName(Scanner sc, String message) { // Block responsible for name validation
		while(true) {
			System.out.print(message);
			String value = sc.nextLine().trim();
			
			if (value.trim().isEmpty()) {
				System.out.printf("%nEspaços em branco não são aceitos, tente novamente.%n%n");
			}
			else if (!value.matches("[A-Za-zÀ-ÿ ]+")) { // Rejects special characters and digits
				System.out.printf("%nInforme um nome válido, tente novamente.%n%n");
			}
			else {
				return value;
			}
		}
	}
	
	public static String readCpf(Scanner sc, String message) { // Method dedicated to validating Brazilian CPF entries
		while (true) {
			System.out.print(message);
			String value = sc.nextLine().trim();
			
			if (value.trim().isEmpty()) {
				System.out.printf("%nEspaços em branco não são aceitos.%nTente novamente.%n%n");				
			} 
			else if (!value.matches("\\d{11}")) {
				System.out.printf("%nDigite apenas os 11 números do CPF (sem letras ou caracteres especiais).%nTente novamente.%n%n");
			}
			else {
				return value;
			}
		}
	}
	
	public static boolean checkCpf(String cpf) { // Method dedicated to validating Brazilian CPF entries
		int firstSum = 0;
		int secondSum = 0;

		for (int i = 0; i < 10; i++) {
			int digit = Character.getNumericValue(cpf.charAt(i));

			if (i < 9) {
				firstSum += digit * (11 - i);
			}
			secondSum += digit * (12 - i);
		}

		int firstDigit = (firstSum % 11 < 2) ? 0 : 11 - (firstSum % 11);
		int secondDigit = (secondSum % 11 < 2) ? 0 : 11 - (secondSum % 11);

		return (Character.getNumericValue(cpf.charAt(9)) == firstDigit && Character.getNumericValue(cpf.charAt(10)) == secondDigit);
			
	}
	
	public static LocalDate readDate(Scanner sc, String message, DateTimeFormatter fmt) {
		while(true) {
			try {
				System.out.print(message);
				LocalDate value = LocalDate.parse(sc.nextLine().trim(), fmt);
				return value;
			}
			catch(DateTimeException e) {
				System.out.printf("%nFormato inválido! Use: (dd/MM/yyyy), tente novamente.%n%n");
			}
		}
	}
	
	public static double readSalary(Scanner sc, String message, double minValue) {
		while(true) {
			try {
				System.out.print(message);
				double value = sc.nextDouble();
				sc.nextLine();
				
				if(value < minValue) {
					System.out.printf("O valor %f, não é válido. Tente novamente.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nDigite apenas caracteres numéricos, tente novamente.%n%n");
			}
		}
	}
	

}
