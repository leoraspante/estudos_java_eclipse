// Prática utilizando FileWriter e BufferedWriter.

/* Exemplos de utilização do FileWriter 
 * 
 *  Cria/recria o arquivo: new FileWriter(path) - Para o caso de recriar me refiro a apagar o arquivo e começar do zero.
 *  Acrescenta ao arquivo existente: new FileWriter(path, true) - Aqui a adição é feita ao final do arquivo.
 *  
 *  */

package manipulandoArquivos3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		// Exemplo onde será gravado os arquivos deste vetor em um novo documento.
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		// Definição do caminho onde o arquivo será criado.
		String path = "out.txt";
		
		// Bloco responsável pela criação e gravação das String no arquivo out.txt.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ //try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) - Não apaga os dados existentes.		
			for(String line : lines) { // For percorrendo o vetor lines.
				bw.write(line); // Adiciona String.
				bw.newLine(); // Salta uma linha após a adição de uma String.
			}
		}
		// Bloco tratando a possível excessão que possa vir a ocorrer.
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
