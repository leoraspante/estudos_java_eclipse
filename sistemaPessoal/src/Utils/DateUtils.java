// Classe com métodos dedicados a manipulação e validação de datas.

package Utils;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public final class DateUtils {
	
//====================================================================================================================================================================//	
	
	public static LocalDate readDate(Scanner sc, String message, DateTimeFormatter fmt) { // Método validando uma entrada de data.
		while (true) {
			try {
				System.out.print(message);
				LocalDate date = LocalDate.parse(sc.nextLine().trim(), fmt);
				return date;
			}
			catch(DateTimeException e) {
				System.out.println("Enter correct data format (dd/MM/yyyy)"); // Ajustar de acordo com o cenário.
				sc.nextLine(); // Descarta entrada inválida.
			}
		}
	}
	
//====================================================================================================================================================================//	
	
	public static LocalDateTime readDateTime(Scanner sc, String message, DateTimeFormatter fmt) { // Método validando uma entrada de data e hora.
		while (true) {
			try {
				System.out.print(message);
				LocalDateTime date = LocalDateTime.parse(sc.nextLine().trim(), fmt);
				return date;
			}
			catch(DateTimeException e) {
				System.out.println("Enter correct data format (dd/MM/yyyy HH:mm:ss)"); // Ajustar de acordo com o cenário.
				sc.nextLine(); // Descarta entrada inválida.
			}
		}
	}
	
//====================================================================================================================================================================//	
	
	public static String formatDate(LocalDate date) { // Método dedicado a formatação de data no padrão: (dd/MM/yyyy).
		
		// Variáveis armazenando os valores individuais da data
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%02d", day)).append("/").
		   append(String.format("%02d", month)).append("/").
		   append(String.format("%04d", year));
		
		return sb.toString(); 		 
	}
	
//====================================================================================================================================================================//	
	
	public static String formatDateTime(LocalDateTime date) { // Método dedicado a formatação de data no padrão: (dd/MM/yyyy HH:mm:ss).
		
		// Variáveis armazenando os valores individuais da data e hora
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		int hour = date.getHour();
		int minute = date.getMinute();
		int second = date.getSecond();
		
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%02d", day)).append("/").
		   append(String.format("%02d", month)).append("/").
		   append(String.format("%04d", year)).append(" ").
		   append(String.format("%02d", hour)).append(":").
		   append(String.format("%02d", minute)).append(":").
		   append(String.format("%02d", second));
		   
		return sb.toString(); 		 
	}
	
//====================================================================================================================================================================//
	
	
	
	

}
