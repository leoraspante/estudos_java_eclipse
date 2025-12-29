package model.utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.enums.Options;
import model.enums.Priority;

public final class Utils {

	public static Integer readInt(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				Integer value = sc.nextInt();
				sc.nextLine();
				if(value <= 0) {
					System.out.printf("%nQuantidade inválida, tente novamente.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nDigite apenas números, tente novamente.%n%n");
			}
		}
	}
	
	public static Integer removeId(Scanner sc, Integer listSize, String message) {
		while(true) {
			try {
				System.out.print(message);
				Integer value = sc.nextInt();
				sc.nextLine();
				if(value <= 0 || value > listSize) {
					System.out.printf("%nID inválida, tente novamente.%n%n");
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nDigite apenas números, tente novamente.%n%n");
			}
		}
	}
	
	public static String readTaskName(Scanner sc, String message) {
		while(true) {
			System.out.print(message);
			String value = sc.nextLine().trim();
			if(value.matches("[\\p{L}0-9 ]+")) {
				return value;
			}
			else {
				System.out.printf("%nCaractere não aceito, tente novamente.%n%n");
			}
		}
	}
	
	public static Priority readPriority(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				String input = sc.nextLine().toUpperCase().trim();
				
				if(input.isEmpty()) {
					System.out.printf("%nEspaços em branco não são aceitos, tente novamente%n%n");
					continue;
				}
				else {
					Priority value = Priority.valueOf(input);
					return value;
				}
			}
			catch(IllegalArgumentException e) {
				System.out.printf("%nPrioridade não cadastrada, tente novamente.%n%n");
			}
		}
	}
	
	public static Options readModification(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				String input = sc.nextLine().toUpperCase().trim(); 
				
				if(input.isEmpty()) {
					System.out.printf("%nEspaços em branco não são aceitos, tente novamente%n%n");
				}
				else {
					Options value = Options.valueOf(input);
					return value;
				}
			}
			catch(IllegalArgumentException e) {
				System.out.printf("%nPrioridade não cadastrada, tente novamente.%n%n");
			}
		}
	}
	
	
	public static LocalDate readStartDate(Scanner sc, String message, DateTimeFormatter fmt) {
		while(true) {
			try {
				System.out.print(message);
				LocalDate startDate = LocalDate.parse(sc.nextLine(), fmt);
				return startDate;
			}
			catch(DateTimeException e) {
				System.out.printf("%nFormato inválido de data, tente novamente.%n%n");
			}
		}
	}
	
	public static LocalDate readEndDate(Scanner sc, String message, LocalDate startDate, DateTimeFormatter fmt) {
		while(true) {
			try {
				System.out.print(message);
				LocalDate endDate = LocalDate.parse(sc.nextLine(), fmt);
				if(endDate.isAfter(startDate)) {
					return endDate;
				}
				else {
					System.out.printf("%nA data de término deverá ser superior a data de início, tente novamente.%n%n");
				}
			}
			catch(DateTimeException e) {
				System.out.printf("%nFormato inválido de data, tente novamente.%n%n");
			}
		}
	}
}
