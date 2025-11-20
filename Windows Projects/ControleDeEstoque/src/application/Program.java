package application;

// Importação de classes, Locale e Scanner.
import java.util.Locale;
import java.util.Scanner;

// Importação da classe Product.
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		// Habilitação do Locale para US.
		Locale.setDefault(Locale.US);
		
		// Habilitação do Scanner para a captura de dados através da variável input.
		Scanner input = new Scanner(System.in);
		
		// Definição de variáveis para a captura de dados do produto.
		System.out.println("Enter product data:");
		System.out.printf("Name: ");
		String name = input.nextLine();
		System.out.printf("Price: ");
		double price = input.nextDouble();
		Product product = new Product(name, price);
		
		// Chamando o método setName, alterando o name para "Computer".
		product.setName("Computer");
		
		// Chamando o método getName, permitindo a impressão do nome.
		System.out.println("Updated name: " + product.getName());
		
		// Chamando o método setPrice, permitindo a alteração do valor do produto.
		product.setPrice(1200.00);
		
		// Chamando o método getPrice, permitindo a impressão do valor.
		System.out.println("Updated price: " + product.getPrice());
		
		// Saída de dados. 
		System.out.println(); // Espaçamento para legibilidade.
		System.out.println("Product data: " + product); // Saída personalizada com toString.
		
		// Nova saída com novo input de dados.
		System.out.println();
		System.out.printf("Enter the number of products to be added in stock: ");
		int quantity = input.nextInt();
		product.addProducts(quantity);
		
		// Saída atualizada de dados.
		System.out.println();
		System.out.println("Updated data: " + product);
		
		// Nova saída com remoção de dados.
		System.out.println();
		System.out.printf("Enter the number of products to be removed from stock: ");
		quantity = input.nextInt();
		product.removeProducts(quantity);
		
		// Saída atualizada de dados.
		System.out.println();
		System.out.println("Updated data: " + product);
		
		// Fechamento do Scanner.
		input.close();

	}

}
