// Programa fazendo uso de ArrayList.

package application;


// Importação de classes.
import java.util.Scanner;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		
		// Scanner usado para capturar dados via console.
		Scanner input = new Scanner(System.in);
		
		// Lista de nomes (ArrayList de Strings) para armazenar os dados digitados.
		ArrayList<String> listaNomes = new ArrayList<String>();
		
		// Mensagens de apresentação e captura de dados.
		System.out.printf("Informe quantos nomes deseja adicionar a lista: ");
		int qtd_nomes = input.nextInt();
		
		// consome o \n que sobrou do nextInt()
		input.nextLine();
		System.out.println();
		
		// Laço que repete qtd_nomes vezes para capturar os nomes.
		for (int i = 1; i <= qtd_nomes; i++) {
			
			// Captura do nome digitado e adição à lista
			System.out.printf("Informe o %dº nome.%n", i);
			System.out.printf("Digite o nome completo: ");
			String nome = input.nextLine();
			listaNomes.add(nome);
			System.out.println();
		}
		
		// Exibição da lista preenchida.
		System.out.println("Nomes registrados");
		System.out.println(listaNomes);
		
		// Mensagens de instrução.
		System.out.println();
		System.out.println("Lista de nomes invertida");
		System.out.println();
		
		// Laço que percorre a lista de trás para frente para exibir os nomes invertidos
		for (int i = listaNomes.size()-1; i >= 0; i--) {
			
			// Impressão de cada nome da lista invertida
			System.out.println(listaNomes.get(i));
		}
		
		// Fim do programa.
		System.out.println();
		System.out.println("Fim do programa.");
		
		// Fechamento do Scanner.
		input.close();

	}

}
