package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data a ser utilizado na exibição e captura dos dados.
		
		List<Product> products = new ArrayList<>(); // Cria um array do tipo Product.
		
		// Mensagens de instrução e captura de dados.
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		// =================================================================== INÌCIO DO FOR ================================================================== //
		
		// For realizando a captura e o registro dos dados.
		for(int i = 0; i<n; i++) { // For executado mediante o valor n informado pelo usuário.
			System.out.printf("%nProduct #%d data:%n", i+1);
			System.out.print("Common, used or imported (c/u/i): ");
			char item = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			Product prod; // Criação de um objeto do tipo Product.
						
			if(item == 'i') { // Condição de produtos importados.
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				prod = new ImportedProduct(name, price, fee); // Armazena no objeto prod os dados dos produto importado.
			}
			else if (item == 'u') { // Condição de produtos usados.
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate manufactureDate = LocalDate.parse(sc.next(), fmt); // Captura a data formatada no padrão definido inicialmente.
				prod = new UsedProduct(name, price, manufactureDate); // Armazena no objeto prod os dados dos produto usado.
			}
			else {
				prod = new Product(name, price); // Armazena no objeto prod os dados dos produto padrão.
			}
			
			products.add(prod); // A depender do tipo de produto cadastrado o objeto é adicionado automaticamente a lista.
		}
		
		// =================================================================== FIM DO FOR ================================================================== //
		
		System.out.println("PRICE TAGS:");
		System.out.println();
		
		// For cuidando da exibição dos resultados.
		for(Product p : products) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}

}
