// Criação da classe Products, com seus atributos e métodos

package entities;

public class Product {
	
	// Atributos da classe.
	private String name;
	private double price;
	private int quantity;
	
	// Criação do construtor.
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Sobrecarga - Segundo construtor
	public Product (String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	// Método que permite a alteração do nome do produto.
	public void setName(String name) {
		this.name = name;
	}
	
	// Método que permite a captura do nome.
	public String getName() {
		return name;
	}
	
	// Método que permite a alteração do preço do produto.
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Método que permite a captura do preço.
	public double getPrice() {
		return price;
	}
	
	// Método que permite a captura da quantidade em estoque.
	public int getQuantity() {
		return quantity;
	}
	
	// Métodos da classe.
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; // This.quantity indica ao Java que desejo acesso ao atributo "quantity" da classe e não ao parâmetro da função.
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() { // Aqui definimos o formato de saída de dados quando solicitado o print da classe.
		return name + ", $ " + String.format("%.2f",price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock()); // Neste caso retornando uma saída personalizada.
	}
} 
