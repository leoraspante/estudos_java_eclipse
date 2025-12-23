// Atividade prática.

/* Fazer um programa para ler o caminho de um arquivo .csv contendo os dados de itens vendidos.
 * Cada item possui um nome, preço unitário e quantidade, separados por vírgula.
 * Você deve gerar um novo arquivo chamado "summary.csv", localizado em uma subpasta chamada "out" a partir da pasta original do
 * arquivo de origem. Contendo apenas o nome e o valor total para aquele item.*/

package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Item;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Item> items = new ArrayList<>(); // Lista para armazenamento dos itens presentes no documento a ser lido.
		
		// Bloco capturando o local do arquivo.
		System.out.print("Informe o caminho/nome do arquivo: ");
		String strPath = sc.nextLine().trim();
		System.out.println(); // Quebra de linha para melhor legibilidade.

		System.out.printf("Produtos cadastrados no arquivo:%n");
		
		try (BufferedReader br = new BufferedReader(new FileReader(strPath))){
			String line = br.readLine(); // Imprime a primeira linha, se for nula o loop while nem inicia
			
			while (line != null) { // Garante a leitura enquando line for diferente de nulo.
				
				System.out.println(line); // Imprime a string lida.
			
				String[] dados = line.split(","); // Aqui a linha é quebrada em partes separadas pela vírgula.
				
				// Armazenamento e conversão dos dados em variáveis.
				String name = dados[0].trim();
				Double price = Double.parseDouble(dados[1].trim()); // Conversão para tipo Double.
				Integer quantity = Integer.parseInt(dados[2].trim()); // Conversão para tipo Integer.
				
				items.add(new Item(name, price, quantity)); // Armazenamento dos valores coletados em lista.
			
				line = br.readLine(); // Realiza nova leitura e armazena em line para ser impressa posteriormente.
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		System.out.printf("%nDados processados:%n");

		// For percorrendo a lista e exibindo os itens.
		for(Item item : items) {
			System.out.println(item);
		}
		
		// Captura do caminho do arquivo data original (Informado pelo usuário).
		File sourceFile = new File(strPath);
		String parent = sourceFile.getParent();
		
		// Se o arquivo foi informado só pelo nome, usa o diretório atual
		if (parent == null) { 
			parent = System.getProperty("user.dir"); 
		}
		
		// Criação da pasta "out".
		new File(parent + "/out").mkdir();
		
		// Caminho do arquivo de saída.
		String targetFile = parent + "/out/summary.csv";
		
		// Bloco responsável pela criação e gravação das String no arquivo summary.csv.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))){		
			for(Item item : items) { // For percorrendo o vetor lines.
				bw.write(item.getName() + "," + String.format("%.2f", item.total()));
				bw.newLine(); // Salta uma linha após a adição de uma String.
			}
		}
		// Bloco tratando a possível excessão que possa vir a ocorrer.
		catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
