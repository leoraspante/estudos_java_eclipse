// Classe com métodos dedicados a manipulação e validação atributos relacionados a endereços.

package Utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;


public final class AddressUtils {

//====================================================================================================================================================================//	
	
	public static String readAddressField(Scanner sc, String message) { // Método validando campos como: Nome da rua/Bairro/Cidade/Estado.
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
	
//====================================================================================================================================================================//	
	
	public static int readAddressNumber(Scanner sc, String message) { // Método validando campo número.
		while (true) {
			try {
				System.out.print(message);
				int value = sc.nextInt();
				sc.nextLine(); // Consome quebra de linha pendente.

				if (value < 0) {
					System.out.printf("%nValores negativos não são aceitos.%nTente novamente.%n%n");
				} 
				
				else {
					return value;
				}

			} catch (InputMismatchException e) { // Tratamento de excessões.
				System.out.printf("%nInforme um número:%n%n");
				sc.nextLine(); // Descarta a entrada inválida.
			}
		}
	}
	
//====================================================================================================================================================================//
	
	public static final String email_regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; // Definição do padrão de email.
	public static final Pattern email_pattern = Pattern.compile(email_regex); // Compilação do padrão em objeto Pattern.
	
	public static String checkEmail(Scanner sc, String message) { // Método que realiza a validação do endereço de email.
		while(true) {
			System.out.print(message);
			String email = sc.nextLine().trim();
			
			if(email_pattern.matcher(email).matches()) {
				return email;
			}
			else {
				System.out.printf("%nEmail inválido, tente novamente.%n%n"); // Ajustar a mensagem de erro de acordo com o cenário.
			}
		}
	}
	
//====================================================================================================================================================================//	
	
	public static String readCep(Scanner sc, String message) { // Método validando uma entrada tipo String dedicado a CEP's.
		while (true) {
			System.out.print(message);
			String value = sc.nextLine().trim();
			
			if (value.trim().isEmpty()) { // Verifica se não foi digitado apenas espaços em branco.
				System.out.printf("%nEspaços em branco não são aceitos.%nTente novamente.%n%n");				
			} 
			
			else if (!value.matches("\\d{8}")) { // Aceita somente 8 números.
				System.out.printf(
						"%nDigite apenas os 8 números do CEP (sem pontos, traços ou barras).%nTente novamente.%n%n");
			}
			
			else {
				return value;
			}

		}
	}

//====================================================================================================================================================================//	
	
	public static String identifyCep(String cep) { // Método responsável pela identificação do estado com base no CEP.
	    String firstTwoDigits = cep.substring(0, 2);

	    switch (firstTwoDigits) {
	        case "01":
	            return "São Paulo";
	        case "20":
	            return "Rio de Janeiro";
	        case "30":
	            return "Minas Gerais";
	        case "40":
	            return "Bahia";
	        case "57":
	            return "Alagoas";
	        case "60":
	            return "Ceará";
	        case "65":
	            return "Maranhão";
	        case "69":
	            String firstThreeDigits = cep.substring(0, 3);
	            switch (firstThreeDigits) {
	                case "690":
	                case "691":
	                case "692":
	                    return "Amazonas (Manaus)";
	                case "693":
	                    return "Roraima";
	                case "694":
	                case "695":
	                case "696":
	                case "697":
	                case "698":
	                    return "Amazonas (interior)";
	                case "699":
	                    return "Acre";
	                default:
	                    return "Estado não identificado.";
	            }
	        case "70":
	            return "Distrito Federal";
	        case "80":
	            return "Paraná";
	        case "90":
	            return "Rio Grande do Sul";
	        default:
	            return "Estado não identificado.";
	    }
	}

//====================================================================================================================================================================//
	
// Implementar o formatCep...	


}
