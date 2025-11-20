// Descrição do exercício.

/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 Imprimir todos os elementos do vetor
 Mostrar na tela a soma e a média dos elementos do vetor */

package application;
// Importações.

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Numero;;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros = 0;
		
		// Valida entrada positiva.
		do {
			System.out.print("Quantos números você vai digitar?: ");
			qtdNumeros = sc.nextInt();
			sc.nextLine(); // Consome a quebra de linha.
			if(qtdNumeros <= 0) { // If exibe advertência para entrada inválida.
				System.out.printf("Valor inválido!%nDigite um valor inteiro positivo maior que zero.");
			}
		} while(qtdNumeros <= 0); // Condição de continuidade do loop.
		
		System.out.println();
		
		List<Numero> list = new ArrayList<>(); // Lista armazenando objetos do tipo entities.Numero.
		
		// Bloco responsável pela captura e registro dos dados.
		for(int i = 0; i < qtdNumeros; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			list.add(new Numero(sc.nextDouble())); // Captura e registro na lista.
		}
		
		System.out.println();
		
		// Bloco responsável pela soma e exibição dos valores armazenados na lista.
		double soma = 0.0;
		System.out.print("Valores: ");
		for(Numero obj : list) {
			System.out.printf(obj + " / "); // Exibe cada número registrado na lista.
			soma+= obj.getNumero(); // Acumula valores.
		}
		System.out.printf("%n%nSoma: %.2f%n", soma);
		
		System.out.println();
		
		double media = soma/list.size();
		System.out.println("Média: " + media);
		
		sc.close();

	}

}
