package model.entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class MenuInicial {
	
//====================================================================================================================================================================//		
	
	public static String mostrarMenu(Scanner sc) { // Método responsável pela exibição do menu inicial e validação da opção escolhida.
		while(true) {
			try {
				System.out.println("====================== Menu de opções ====================");
				System.out.println("(1) ============== Cadastro de Funcionários ==============");
				System.out.println("(2) ================= Em desenvolvimento =================");
				System.out.println("(0) ========================= Sair =======================");
				System.out.println();
				System.out.print("Informe a opção desejada: ");
				
				String value = sc.next().trim();
						
				if (value.trim().isEmpty()) { // Verifica se não foi digitado apenas espaços em branco.
					System.out.printf("%nEspaços em branco não são aceitos.%nTente novamente.%n%n");				
				}
				
				else if (!value.matches("\\d{1}")) {
					System.out.printf("%nInforme apenas o número da opção desejada.%nTente novamente.%n%n");
				}
				
				else if(value.charAt(0) < '0' || value.charAt(0) > '2') {
					System.out.printf("%nOpção inválida, tente novamente.%n%n");
				}
				
				else {
					return value;
				}
			}
			catch(InputMismatchException e) {
				System.out.printf("%nDigite um número para escolher a opção desejada.%nTente novamente.%n%n%n");
			}
		}
	}
	
//====================================================================================================================================================================//		
	
	public static String escolhaMenu(String value) {
		
		switch(value){
			case "1":
				return "============== Cadastro de Funcionários ==============";
			case "2":
				return "============== Em desenvolvimento ==============";
			case "0":
				return "============== Fim do programa ==============";
			default:
				return "Opção inválida";
		}
	}

	
	
	 
	
	
	

}














