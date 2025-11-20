// Descrição do exercício.

/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

// Exercício modificado para fazer uso de práticas de OO e ArrayList.

package application;

//Imports.
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Number;

public class Program {

	public static void main(String[] args) {
		
		// Alteração do local para US, permitindo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Declaração do Scanner na variável input.
		Scanner input = new Scanner(System.in);
		
		// Declaração de variável armazenando a quantidade de registros que serão realizados.
		int totalNumbers = 0;
		
		// Checagem inicial garantindo uma entrada válida de dados.
		do {
			System.out.print("Quantos elementos vai ter a lista? ");
			totalNumbers = input.nextInt();
			if(totalNumbers <= 0) {
				System.out.println("Valor inválido!");
				System.out.println("Digite um número inteiro positivo maior que zero.");
			}
		} while(totalNumbers <= 0);
		
		System.out.println(); // Quebra de linha.
		
		// Criação de uma lista do tipo number.
		List<Number> list = new ArrayList<>();
		
		// Captura e armazenamento dos valores na lista.
		for(int i=0; i<totalNumbers; i++) {
			System.out.print("Digite um número: ");
			list.add(new Number(input.nextDouble()));
		}
		 
		System.out.println(); // Quebra de linha.
		
		// Bloco resonsável pela obtenção da média dos valores presentes na lista.
		// Declaração de variável para armazenar os valores cadastrados na lista.
		double soma = 0.0;
		
		// Loop for each percorrendo a lista.
		for(Number obj : list) {
			soma += obj.getNumber(); // Acrescenta a variável soma a cada iteração.
			
		}
		
		// Declaração de variável armazenando a média.
		double media = soma/totalNumbers;
		
		// Exibição da média dos valores.
		System.out.printf("Média dos valores: %.3f%n", media);
		
		System.out.println(); // Quebra de linha.
		
		// Saída de dados.
		System.out.println("Elementos abaixo da média:");
		// Bloco responsável por encontrar os valores abaixo da média.
		for(Number obj : list) {
			if(obj.getNumber() < media) {
				System.out.println(obj);
			}
		}
		
		// Fechamento do Scanner.
		input.close();
	}

}
