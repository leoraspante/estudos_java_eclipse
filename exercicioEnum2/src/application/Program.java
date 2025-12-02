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
    	
    	// Bloco coletando dados do cliente.
    	System.out.println("Enter client data:"); 
    	System.out.print("Name: ");
    	String name = sc.nextLine();
    	System.out.print("Email: ");
    	String email = sc.nextLine();
    	System.out.print("BirthDate (DD/MM/YYYY): ");
    	String birthDate = sc.next();
    	
    	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Modelo de formatação esperado.
    	LocalDate birthDateConverted = LocalDate.parse(birthDate, fmt); // Realiza a formatação seguindo modelo predefinido.
    	
    	Client client = new Client(name, email, birthDateConverted); // Criação do objeto client.
    	
    	System.out.println(); // Quebra de linha para melhor visualização.    	
    	
    	// Bloco coletando dados do pedido.
    	System.out.println("Enter order data:");
    	System.out.print("Status: ");
    	OrderStatus status = OrderStatus.valueOf(sc.next());
    	
    	// Criação do pedido.
    	Order order = new Order(LocalDateTime.now(), status, client);
    	
    	System.out.print("How many items to this order? ");
    	int n = sc.nextInt();
    	sc.nextLine(); // Consome quebra de linha pendente.
    	System.out.println(); // Quebra de linha para melhor visualização.    	
    	
    	for(int i=0; i<n; i++) {
    		System.out.printf("Enter #%d item data:%n", i+1);
    		System.out.print("Product name: ");
    		String productName = sc.nextLine();
    		System.out.print("Product price: ");
    		double productPrice = sc.nextDouble();
    		System.out.print("Quantity: ");
    		int productQuantity = sc.nextInt();
    		sc.nextLine(); // Consome quebra de linha pendente.
    		
    		Product product = new Product(productName, productPrice);
    		OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
    		order.addItem(orderItem);
    		
    		System.out.println(); // Quebra de linha para melhor visualização.
    		
    	}
    	
    	System.out.println(); // Quebra de linha para melhor visualização.   
    	System.out.println(order);
    	
    	
    	sc.close();
    }
}

