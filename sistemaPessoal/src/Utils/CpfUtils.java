// Classe com métodos dedicados a manipulação de dados voltados a CPF's.

package Utils;

import java.util.Scanner;

public class CpfUtils {

//====================================================================================================================================================================//	
	
	public static String readCpf(Scanner sc, String message) { // Método validando uma entrada tipo String dedicado a CPF's.
		while (true) {
			System.out.print(message);
			String value = sc.nextLine().trim();
			
			if (value.trim().isEmpty()) { // Verifica se não foi digitado apenas espaços em branco.
				System.out.printf("%nEspaços em branco não são aceitos.%nTente novamente.%n%n");				
			} 
			
			else if (!value.matches("\\d{11}")) { // Aceita somente números.
				System.out.printf(
						"%nDigite apenas os 11 números do CPF (sem letras ou caracteres especiais).%nTente novamente.%n%n");
			}
			
			else {
				return value;
			}

		}
	}
 
//====================================================================================================================================================================//
	
	public static boolean checkCpf(String cpf) { // Método dedicado a validação de CPF's.
		
		int firstSum = 0;
		int secondSum = 0;

		for (int i = 0; i < 10; i++) {
			int digit = Character.getNumericValue(cpf.charAt(i));

			if (i < 9) { // só os 9 primeiros entram no cálculo do primeiro dígito
				firstSum += digit * (11 - i);
			}
			secondSum += digit * (12 - i); // os 10 primeiros entram no cálculo do segundo dígito
		}

		// Cálculo dos dígitos verificadores.
		int firstDigit = (firstSum % 11 < 2) ? 0 : 11 - (firstSum % 11);
		int secondDigit = (secondSum % 11 < 2) ? 0 : 11 - (secondSum % 11);

		// Comparação final, validando ambos dígitos finais.
		return (Character.getNumericValue(cpf.charAt(9)) == firstDigit && Character.getNumericValue(cpf.charAt(10)) == secondDigit);
			
	}

	public static String formatCpf(String cpf) { // Método dedicado a formatação do CPF no padrão: ###.###.###-##. 
		StringBuilder sb = new StringBuilder();
		sb.append(cpf, 0, 3).append(".").
		   append(cpf, 3, 6).append(".").
		   append(cpf, 6, 9).append("-").
		   append(cpf, 9, 11);
		
		return sb.toString(); 		 
	}

	public static String cleanCpf(String cpf) { // Método dedicado a limpeza do cpf (removendo pontos e traços), deixando apenas números.
		return cpf.replaceAll("\\D", "");
	}

//====================================================================================================================================================================//
	
	
	
	
}
