// Pŕatica voltada a informações sobre caminho dos arquivos.

package manipulandoArquivos5;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o caminho de um arquivo: ");
		String strPath = sc.nextLine().trim();
		
		File path = new File(strPath);
		
		// Acessando somente o nome do arquivo, descartando o caminho.
		System.out.println("getName: " + path.getName());
		
		// Acessando somente o diretório do arquivo, descartando o nome.
		System.out.println("getParent: " + path.getParent());
		
		// Acessando o caminho completo.
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}

}
