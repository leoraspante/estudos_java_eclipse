package entities;

import java.util.Scanner;

public class Leonidas {
	
	// Definição dos atributos.
	public int soldados;
	
	// Definição dos metodos.
	
	public void jogar(Scanner input) {
		
		// Declaração de variável para permitir a continuidade do loop for.
		boolean acertou = false;
		
		while (!acertou) {
			// Captura de dados.
			System.out.printf("Informe o nº de soldados: ");
			this.soldados = input.nextInt();
			if (soldados < 5000) {
				System.out.println("Muito pouco, pode aumentar esse valor!");
			} else if (soldados >= 5000 && soldados < 9000) {
				System.out.println("Leônidas é mais valente que isso!");
			} else if (soldados >= 9000 && soldados < 10000) {
				System.out.println("Você está quase lá");
			} else if (soldados > 10000) {
				System.out.println("Um pouquinho a menos, tenha compaixão por Leônidas...");
			} else if (soldados == 10000) {
				acertou = true;
				System.out.println("Parabéns, você acertou!!!");
			}
		}
	}
}
