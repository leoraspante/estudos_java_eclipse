package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	// Atributos.
	private LocalDateTime moment;
	private OrderStatus status;
	private Client client;
	
	List<OrderItem> items = new ArrayList<>();
	
	// Construtores.
	public Order() {
		
	}
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	// Getters e Setters.
	public LocalDateTime getMoment() {
		return moment;
	}
	
	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}
	
	public OrderStatus getStatus() {
		return status;
	}
	
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	// Métodos para manipulação da lista.
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	// Métodos.
	public Double total() {
		double sum = 0.0;
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}
	
	
	// toString personalizado.
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:");
		sb.append(System.lineSeparator());
		sb.append("Order moment: ");
		sb.append(moment.format(fmt));
		sb.append(System.lineSeparator());
		sb.append("Order status: ");
		sb.append(status);
		sb.append(System.lineSeparator());
		sb.append("Client: ");
		sb.append(client);
		sb.append(System.lineSeparator());
		sb.append("Order items:");
		sb.append(System.lineSeparator());
		for(OrderItem item : items) {
			sb.append(item);
			sb.append(System.lineSeparator());
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f",total()));
		return sb.toString();
	}
}
