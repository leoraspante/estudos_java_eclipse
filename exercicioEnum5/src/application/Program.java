package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato de data pré definido.
		
		// Captura e registro dos dados do cliente.
		System.out.println("Enter Client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt);
		
		Client client = new Client(name, email, birthDate); // Cria o objeto client registrando os dados coletados.
		
		System.out.println();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.nextLine().toUpperCase()); // Permite o usuário informar o valor do enum.
		System.out.print("how many items to this order? ");
		int n = sc.nextInt();
		sc.nextLine(); // Consome quebra de linha pendente.
		
		Order order = new Order(LocalDateTime.now(), status, client);
		
		// For capturando e registrando os itens do pedido.
		for(int i = 0; i<n; i++) {
			System.out.printf("Enter #%d item data:%n", i+1);
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int prodQuantity = sc.nextInt();
			sc.nextLine(); // Consome quebra de linha pendente.
			
			Product product = new Product(prodName, prodPrice);
			OrderItem item = new OrderItem(prodQuantity, prodPrice, product);
			order.addItem(item);
		}
		System.out.println(order);
		
		
		
		sc.close();
	}

}
