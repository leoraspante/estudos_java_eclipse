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
	
	// Getters e Setters.
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	// Métodos.
	public Double subTotal() {
		double sum = price * quantity;
		return  sum;
	}
	
	// toString personalizado.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.toString());
		sb.append(", Quantity: ");
		sb.append(quantity);
		sb.append(", Subtotal: $");
		sb.append(String.format("%.2f",subTotal()));
		return sb.toString();
	}
}
