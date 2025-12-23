package model.entities;

public class Item {
	
	// Atributos.
	private String name;
	private Double price;
	private Integer quantity;
	
	// Construtores.
	public Item() {
	}

	public Item(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	// Métodos
	public Double total() {
		return price * quantity;
	}
	
	// toString personalizado.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do produto: ");
		sb.append(name);
		sb.append(" Valor total: $");
		sb.append(total());
		return sb.toString();
	}
}