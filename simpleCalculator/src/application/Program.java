package application;

import java.util.Locale;
import java.util.Scanner;

import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa vírgula como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		// Introduction message.
		System.out.println("Calculadora simples");
		System.out.println();
		
		// Data collection.
		String operator = Utils.checkOperator(sc, "Escolha a operação desejada '+' '-' '*' '/': ");
		System.out.println();
		int firstValue = Utils.readInt(sc, "Informe o primeiro valor: ");
		int secondValue = Utils.readInt(sc, "Informe o segundo valor: ");
		System.out.println();
		
		switch(operator) {
		case "+":
			System.out.println("Operação escolhida: " + operator);
			System.out.println("Resultado: " + (firstValue + secondValue));
			break;
		case "-":
			System.out.println("Operação escolhida: " + operator);
			System.out.println("Resultado: " + (firstValue - secondValue));
			break;
		case "*":
			System.out.println("Operação escolhida: " + operator);
			System.out.println("Resultado: " + (firstValue * secondValue));
			break;
		case "/":
			System.out.println("Operação escolhida: " + operator);
			if(secondValue == 0) {
				System.out.println("Impossível dividir por: " + secondValue);
			}
			else {
				System.out.println("Resultado: " + (firstValue / secondValue));
				break;
			}
		}
		
		sc.close();
	}

}
