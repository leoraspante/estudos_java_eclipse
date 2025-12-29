package model.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class Utils {

	public static String readName(Scanner sc, String message) { // Método validando a entrada de nomes
		while (true) {
			System.out.print(message);
			String value = sc.nextLine().trim();

			if (value.trim().isEmpty()) { // Verifica se não foi digitado apenas espaços em branco.
				System.out.printf("%nEspaços em branco não são aceitos.%nTente novamente.%n%n");
			} 
			
			else if (!value.matches("[A-Za-zÀ-ÿ ]+")) { // Não aceita caractere especial ou números.
				System.out
						.printf("%nDigite apenas letras (sem números ou caracteres especiais).%nTente novamente.%n%n");
			}
			
			else {
				return value;
			}
		}
	}
	
	public static Double readDouble(Scanner sc, String message) { // Método validando uma entrada tipo Double.
		while (true) {
			try {
				System.out.print(message);
				Double value = sc.nextDouble();
				sc.nextLine(); // Consome quebra de linha pendente.

				if (value <= 0) {
					System.out.printf("%nInforme um valor decimal maior que zero.%nTente novamente.%n%n");
				} 
				
				else {
					return value;
				}
				
			} catch (InputMismatchException e) { // Tratamento de excessões.
				System.out.printf("%nInforme um valor decimal:%n%n");
			}
		}
	}
	
	
	
}

