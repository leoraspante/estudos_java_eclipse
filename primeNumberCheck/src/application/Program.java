// Programa simples para a verificação de números primos.

package application;

import java.util.Scanner;

import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Instruction messages.
		System.out.printf("Verificador de números primos%n");
		
		// Data collection.
		Integer number = Utils.readInt(sc, "Informe um número inteiro: ");
		
		System.out.printf("%nResultado:%n%n");
		
		boolean isPrime = true;
		
		if(number < 2) {
			isPrime = false;
		}
		else {
			for(int i = 2; i <= number/2; i++) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println("Número primo");
		}
		else {
			System.out.println("Não é primo");
		}
		
		
		sc.close();
	}

}
