// Prática voltada a manipulação de pastas.

package manipulandoArquivos4;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho: ");
		String strPath = sc.nextLine().trim();
		
		File path = new File(strPath);
		
		// Exibindo as pastas presente em um diretótio (informado pelo usuário anteriormente).
		File[] folders = path.listFiles(File::isDirectory); // Cria um vetor do tipo File, contendo o caminho de cada um dos diretórios.
		
		System.out.println("Folders:");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		// Exibindo os arquivos presentes em um diretótio (informado pelo usuário anteriormente).
		File[] files = path.listFiles(File::isFile); // Cria um vetor do tipo File, contendo o caminho de cada um dos arquivos.
		
		System.out.println("Files:");
		for(File file : files) {
			System.out.println(file);
		}
		
		// Criando uma pasta dentro de um diretório.
		boolean success = new File(strPath + "//new-folder").mkdir();
		System.out.println("Diretório criado com sucesso: " + success);
		
		sc.close();
	}

}
