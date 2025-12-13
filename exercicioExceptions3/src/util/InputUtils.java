package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
	
/*========================================================================================================================================================= */	
	// Método validando uma entrada do tipo Integer válida.
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
	
/*========================================================================================================================================================= */
	// Método validando uma entrada tipo String válida.
	public static String readNameString(Scanner sc, String message) {
		while (true) {
			System.out.print(message);
			String value = sc.nextLine();

			if (value.trim().isEmpty()) { // Verifica se não foi digitado apenas espaços em branco.
				System.out.printf("%nEmpty spaces are not acceptable.%nTry again.%n%n");
			}
			else if (!value.matches("[A-Za-zÀ-ÿ ]+")) { // Não aceita caractere especial ou números.
	            System.out.printf("%nOnly letters are acceptable (no numbers or special characters).%nTry again.%n%n");
			}    
			else {
				return value; // Sai do método se for válido.
			}
		}
	}
	
/*========================================================================================================================================================= */
	// Método validando uma entrada tipo Double válida.
	public static Double readDouble(Scanner sc, String message) {
		while(true) {
			try {
				System.out.print(message);
				Double value = sc.nextDouble();
				sc.nextLine(); // Consome quebra de linha pendente.
				
				if(value <=0) {
					System.out.printf("%nInput an decimal value greater than zero.%nTry again.%n%n");
				}
				else {
					return value; // Sai do método se for válido.
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nInput a decimal value:%n%n");
				sc.nextLine(); // Descarta entrada inválida.
			}
		}
	}
}

/*========================================================================================================================================================= */
