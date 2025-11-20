// Descrição do exercício.

/* Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

// Exercício modificado para fazer uso de práticas de OO e ArrayList.

package application;
// Importações
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.MyNumbers;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Alteração do local para US, permitindo uso de ponto como separador decimal.
		Scanner sc = new Scanner(System.in); // Atribuição do Scanner a variável sc.
		
		int qtdNumeros = 0;
		int qtdPares = 0;
		
		List<MyNumbers> list = new ArrayList<>(); // ArrayList armazenando objetos do tipo MyNumber.
		
		// 1ª Entrada de dados, informando quantos números serão digitados.
		do { // Bloco do-while garantindo uma entrada numérica válida.
			System.out.print("Quantos números você vai digitar?: ");
			qtdNumeros = sc.nextInt();
			if(qtdNumeros <= 0) {
				System.out.printf("Valor inválido!%nDigite um número inteiro maior que zero.%n");
			}
		} while(qtdNumeros <= 0);
		
		System.out.println(); // Quebra de linha.
		
		// 2ª Entrada de dados, informando números e armazenando o mesmos na lista.
		for(int i = 0; i < qtdNumeros; i++) {
			System.out.print("Digite um número: ");
			int number = sc.nextInt();
			
			list.add(new MyNumbers(number));
			
			// Aproveitando o loop para contar a qtd de números pares.
			if(list.get(i).getNumber() % 2 == 0) {
				qtdPares ++;
			}
		}
		System.out.println(); // Quebra de linha.
		
		// Exibição dos números pares.
		System.out.println("Números pares:");
		for(MyNumbers obj : list) {
			if(obj.getNumber() % 2 == 0) {
				System.out.printf(obj + " ");
			}
		}
		
		System.out.println(); // Quebra de linha.
		
		System.out.println("Quantidade de pares: " + qtdPares);
		
		sc.close(); // Fechamento do Scanner.

	}

}
