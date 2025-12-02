package entities;

public class OrderItem {
	
	// Atributos.
	private Integer quantity;
	private Double price;
	private Product product;
	
	// Construtores.
	public OrderItem() {
	}
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	// Getters.
	public Integer getQuantity() {
		return quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	// Setters.
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	// Métodos.
	public Double subTotal() {
		return price * quantity;
	}
	
	// toString personalizado.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName());
		sb.append(", $");
		sb.append(String.format("%.2f", price));
		sb.append(", Quantity: ");
		sb.append(quantity);
		sb.append(", ");
		sb.append("Subtotal: $");
		sb.append(String.format("%.2f", subTotal()));
		return sb.toString();
	}
	
	
	
	
	
	
}






