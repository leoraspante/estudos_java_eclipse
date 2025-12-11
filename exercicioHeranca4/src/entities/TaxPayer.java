package entities;

public abstract class TaxPayer {
	
	// Atributos.
	private String name;
	private Double anualIncome;

	// Construtores.
	public TaxPayer() {	
	}
	
	public TaxPayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}
	
	// Getters e Setters.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnualIncome() {
		return anualIncome;
	}
	
	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	// Métodos.
	public abstract Double tax();
}
