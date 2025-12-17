// Classe com métodos dedicados a manipulação de valores numéricos.

package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtils {
	
//====================================================================================================================================================================//	
	
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

//====================================================================================================================================================================//	
	
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
				sc.nextLine(); // Descarta entrada inválida.
			}
		}
	}	
		
//====================================================================================================================================================================//	
	
	
	
	
	
	
}
