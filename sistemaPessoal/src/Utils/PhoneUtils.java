// Classe com métodos dedicados a manipulação de dados voltados a telefones.

package Utils;

import java.util.Scanner;

public final class PhoneUtils {
	
//====================================================================================================================================================================//	
	
	public static String readPhone(Scanner sc, String message) {
		while (true) {
			System.out.print(message);
			String value = sc.nextLine().trim();
			
			// Validação inicial de entrada
			if (value.trim().isEmpty() || (!value.matches("\\d{10}") && !value.matches("\\d{11}"))) { // Busca por espaços em branco e qtd numérica anormal.
				System.out.printf("%nFormato de telefone inválido.%nTente novamente.%n%n");
			}
			else if(value.matches("\\d{10}") && !(value.charAt(2) >= '2' && value.charAt(2) <= '5')) { // Verifica se o telefone fixo é válido.
				System.out.printf("%nNúmero de telefone inválido.%nTente novamente.%n%n");
			}
			else if(value.matches("\\d{11}") && !(value.charAt(2) == '9')) { // Verifica se o telefone celular é válido.
				System.out.printf("%nNúmero de telefone inválido.%nTente novamente.%n%n");

			}
			else {
				return value;
			}
		}
	}
	
//====================================================================================================================================================================//	
	
	public static String formatFixedPhone(String phone) { // Método dedicado a formatação de telefone fixo no formato (##) ####-####.
		StringBuilder sb = new StringBuilder();
		
		if (phone.matches("\\d{10}")) {
			sb.append("(").append(phone, 0, 2).
			   append(") ").append(phone, 2, 6).
			   append("-").append(phone, 6, 10);
			return sb.toString();
		} 
		else {
			return "Formato incompatível, escolha formatMobilePhone.";
		} 
	}
	
//====================================================================================================================================================================//	
	
	public static String formatMobilePhone(String phone) { // Método dedicado a formatação de telefone móvel no formato (##) #####-####.
		StringBuilder sb = new StringBuilder();
		
		if (phone.matches("\\d{11}")) {
			sb.append("(").append(phone, 0, 2).
			   append(") ").append(phone, 2, 7).
			   append("-").append(phone, 7, 11);
			return sb.toString();
		} 
		else {
			return "Formato incompatível, escolha formatFixedPhone.";
		}
	}
		
//====================================================================================================================================================================//		
		
}

	
	

	
