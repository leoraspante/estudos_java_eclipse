package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
	
	// Método validando uma entrada numérica válida.
	public static int readInt(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				int value = sc.nextInt();
				sc.nextLine(); // Consome quebra de linha pendente.
				
				if(value <=0) {
					System.out.printf("%nInput an integer value greater than zero.%nTry again.%n%n");
				}
				else {
					return value; // Sai do método se for válido.
				}
				
			}
			catch(InputMismatchException e){
				System.out.printf("%nInput an integer value:%n%n");
				sc.nextLine(); // Descarta a entrada inválida.
			}
		}
			
	}
	
	// Método validando uma entrada tipo LocalDate válida.
	public static LocalDate readDate(Scanner sc, String message, DateTimeFormatter fmt) {
		while(true) {
			try {
				System.out.println(message);
				LocalDate date = LocalDate.parse(sc.next(), fmt);
				return date;
			}
			catch(DateTimeParseException e) {
				System.out.println("Enter correct data format (dd/MM/yyyy)");
				sc.nextLine(); // Descarta entrada inválida.
			}
		}
	}
	
}
