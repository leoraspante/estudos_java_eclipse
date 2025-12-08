package entities;

public class Product {

	// Atributos.
	private String name;
	private Double price;
	
	// Construtores.
	public Product() {
		
	}
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	// Getters e Setters.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	// toString personalizado.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(", $");
		sb.append(String.format("%.2f", price));
		return sb.toString();
	}
}
