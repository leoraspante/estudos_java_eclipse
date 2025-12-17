// Aula inicial aprendendo conceitos básicos sobre a manipulação de arquivos em JAVA.

package manipulandoArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("in.txt"); // Arquivo a ser lido.
		
		Scanner sc = null; // Inicialização do Scanner, que será utilizado posteriormente para a leitura do arquivo.
		
		// Bloco responsável pela leitura do arquivo.
		try {
			sc = new Scanner(file); // Scanner recebendo o objeto file para a leitura.
			
			// While percorrendo o arquivo para a leitura.
			while (sc.hasNextLine()) { // Enquanto ouver uma próxima linha o loop continua.
				System.out.println(sc.nextLine()); // Exibição do conteúdo do arquivo.
			}
		}
		catch (IOException e) { // Tratamento de excessão, pois a abertura do arquivo via Scanner pode resultar em uma excessão.
			System.out.println("Error: " + e.getMessage()); // Apenas captura e exibe o erro.
		}
		
		// Bloco destinado ao fechamento do Scanner.
		finally {
			if(sc != null) { // Fechando o Scanner somente se este for diferente de nulo.
				sc.close();
			}
		}
	}
}
