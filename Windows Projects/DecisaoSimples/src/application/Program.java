// Programa simples fazendo uso de if/else.

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Leonidas;
public class Program {

	public static void main(String[] args) {
		
		// Local alterado para US permitondo o uso de ponto como separador decimal.
		Locale.setDefault(Locale.US);
		
		// Scanner definido na variável input para realizar a captura de dados.
		Scanner input = new Scanner(System.in);
		
		// Mensagens de apresentação e instruções.
		System.out.println("Leônidas e os 300");
		System.out.println("Quantos soldados você imagina que Leônidas tenha enfrentado na batalha das Termópilas...");
		System.out.println("Jogo de tentativa e erro.");
		System.out.println();

		Leonidas jogo = new Leonidas();
		jogo.jogar(input);

		// Mensagem de encerramento.
		System.out.println();
		System.out.println("Fim do programa.");
		
		// Fechamento do Scanner.
		input.close();
	}
}
