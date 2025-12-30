package model.utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import model.enums.CourseLevel;

public final class Utils {

	public static int readInt(Scanner sc, String message, int minValue) {
		while(true) {
			try {
				System.out.print(message);
				int value = sc.nextInt();
				sc.nextLine();
				if(value < minValue) {
					System.out.printf("%nInforme um valor inteiro maior que %d, tente novamente.%n%n", minValue);
				}
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nApenas são permitidos caracteres numéricos, tente novamente.%n%n");
				sc.nextLine();
			}
		}
	}
	
	public static String readCourseName(Scanner sc, String message) {
		while(true) {
			System.out.print(message);
			String value = sc.nextLine().trim();
			
			if(value.matches("[\\p{L}0-9 '\\-]+")) {
				return value;
			}
			else {
				System.out.printf("%nNome inválido, tente novamente.%n%n");
			}
		}
	}
	
	public static CourseLevel readCourseLevel(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				String input = sc.nextLine().toUpperCase().trim();
				
				if(input.isEmpty()) {
					System.out.printf("%nEspaços em branco não são aceitos, tente novamente%n%n");
				}
				else {
					CourseLevel value = CourseLevel.valueOf(input);
					return value;
				}
			}
			catch(IllegalArgumentException e) {
				System.out.printf("%Nível não cadastrado, tente novamente sem acentuação.%n%n");
			}
		}
	}
	
	public static String readName(Scanner sc, String message) {
		while (true) {
			System.out.print(message);
			String value = sc.nextLine().trim();

			if (value.trim().isEmpty()) {
				System.out.printf("%nEspaços em branco não são aceitos.%nTente novamente.%n%n");
			} 
			
			else if (!value.matches("[A-Za-zÀ-ÿ ]+")) {
				System.out.printf("%nDigite apenas letras (sem números ou caracteres especiais).%nTente novamente.%n%n");
			}
			
			else {
				return value;
			}
		}
	}
	
	public static LocalDate readBirthDate(Scanner sc, String message, DateTimeFormatter fmt) {
		while(true) {
			try {
				System.out.print(message);
				LocalDate value = LocalDate.parse(sc.nextLine().trim(), fmt);
				return value;
			}
			catch(DateTimeException e) {
				System.out.printf("%nFormato inválido, tente novamente (dd/MM/yyyy)%n%n");
				sc.nextLine();
			}
		}
	}
}
