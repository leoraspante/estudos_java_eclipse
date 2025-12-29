package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	public static int readInt(Scanner sc, String message) { // Método validando uma entrada do tipo int.
		while (true) {
			try {
				System.out.print(message);
				int value = sc.nextInt();
				sc.nextLine(); // Consome quebra de linha pendente.

				if (value <= 0) {
					System.out.printf("%nInforme um valor numérico maior que zero.%nTente novamente.%n%n");
				} 
				
				else {
					return value;
				}

			} catch (InputMismatchException e) { // Tratamento de excessões.
				System.out.printf("%nInforme um valor inteiro:%n%n");
				sc.nextLine(); // Descarta a entrada inválida.
			}
		}
	}
}
