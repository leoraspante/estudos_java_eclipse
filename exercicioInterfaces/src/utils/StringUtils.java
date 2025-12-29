package utils;

import java.util.Scanner;

public final class StringUtils {

	public static String readCarName(Scanner sc, String message) { // Método validando a entrada de nomes
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
}
