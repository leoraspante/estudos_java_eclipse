package entities;

public class ImportedProduct extends Product{
	
	// Atributos.
	private Double customsFee;
	
	// Construtores.
	public ImportedProduct() {
		
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	// Getters e Setters.
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// Métodos.
	@Override
	public String priceTag() {
		return String.format("%s $ %.2f (Customs fee: $ %.2f)",getName(), totalPrice(), getCustomsFee());
	}
	
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}

}
