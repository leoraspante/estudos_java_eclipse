package utils;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public final class DateUtils {

	public static LocalDateTime readDateTime(Scanner sc, String message, DateTimeFormatter fmt) {
		while(true) {
			try {
				System.out.print(message);
				LocalDateTime value = LocalDateTime.parse(sc.nextLine().trim(), fmt);
				return value;
			}
			catch(DateTimeException e){
				System.out.printf("%nInforme a data corretamente (dd/MM/yyy HH:mm).%nTente novamente.%n%n");
			}
		}
	}
}
