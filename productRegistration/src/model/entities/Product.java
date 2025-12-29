package model.entities;

public class Product {
	
	// Fields.
	private String name;
	private Double price;
	private Integer quantity;
	
	// Constructors.
	public Product() {
	}
	
	public Product(String name, Double price, Integer quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Getters and Setters.
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
	
	// Methods.
	public Double totalValue() {
		return price * quantity;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Produto: ");
		sb.append(name);
		sb.append(", preço unitário R$: ");
		sb.append(price);
		sb.append(", estoque: ");
		sb.append(quantity);
		sb.append(" unidades. Valor total em estoque R$: ");
		sb.append(String.format("%.2f", totalValue()));
		return sb.toString();
	}
	

}
