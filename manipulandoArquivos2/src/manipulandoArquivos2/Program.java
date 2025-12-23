// Prática desta vez fazendo uso do bloco try-with-resources.

// Forma correta de fazer a leitura de um arquivo.

package manipulandoArquivos2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "in.txt"; // String armazenando o endereço do arquivo a ser utilizado.

		// Bloco que declara um ou mais recursos e garante o seu fechamento automático ao final do bloco. Diponível java 7 em diante.
		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine(); // Leitura de uma linha do arquivo, e retornar nulo caso esta no final.

			while (line != null) { // Garante a leitura enquando line for diferente de nulo.
				System.out.println(line);
				line = br.readLine();
			}
		}

		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
