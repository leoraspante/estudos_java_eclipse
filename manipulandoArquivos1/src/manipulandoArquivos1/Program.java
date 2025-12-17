// Segunda prática, conhecendo as ferramentas FileReader e BufferedReader

package manipulandoArquivos1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "in.txt"; // String armazenando o endereço do arquivo a ser utilizado.
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine(); // Leitura de uma linha do arquivo, e retornar nulo caso esta no final.
			
			while (line != null) { // Garante a leitura enquando line for diferente de nulo.
				System.out.println(line);
				line = br.readLine();
			}
		}
		
		// Bloco catch capturando possível excessão.
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		// Bloco finally responsável pelo fechamento das streams, contudo pode ocorrer uma excessão que também precisa ser tratada.
		finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			}
			
			// Bloco catch capturando possível excessão.
			catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}

}
