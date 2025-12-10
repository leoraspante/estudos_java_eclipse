package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
	
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	// Atributos.
	private LocalDate manufactureDate;
	
	// Construtores.
	public UsedProduct() {
		
	}
	
	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	// Getters e Setters.
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	// Métodos.
	@Override
	public String priceTag() {
		return String.format("%s (used) $ %.2f (Manufacture date: %s)", getName(), getPrice(), getManufactureDate().format(fmt));
	}
	
}
