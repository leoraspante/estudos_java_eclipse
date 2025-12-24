// Atividade prática do livro - Java para iniciantes Cap. 1.

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Conversor de gravidade");
		System.out.println("Descubra quanto você pesaria na Lua");
		System.out.println();
		
		System.out.print("Informe seu peso em Kg: ");
		Double peso = sc.nextDouble();
		
		Double gravidadeLunar = 1.6;
		Double gravidadeTerrestre = 9.8;
		
		Double resultado = (peso * gravidadeLunar) / gravidadeTerrestre;
		
		System.out.printf("Seu peso na lua seria de: %.2f Kg", resultado);
				
		sc.close();
	}

}
