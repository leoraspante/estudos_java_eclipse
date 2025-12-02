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

	// Getters.
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	
	// Setters.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
