package entities;

public class Individual extends TaxPayer{

	// Atributos.
	private Double healthExpenditures;
	
	// Construtores;
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	// Getters e Setters.
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}
	
	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	// Métodos.
	@Override
	public Double tax() {
		double totalTax = 0.0; // Acumula o total de imposto a ser pago.
		double discount = 0.0; // Acumula o desconto obtido.
		
		if(super.getAnualIncome() < 20000) { // Condição de renda abaixo de 20k.
			totalTax = super.getAnualIncome() * 0.15; // Percentual de 15%.
		}
		else {
			totalTax = super.getAnualIncome() * 0.25; // Percentual de 25%.
		}
		
		if(healthExpenditures > 0) {
			discount = healthExpenditures * 0.5;
			totalTax -= discount;
		}
		
		return totalTax;
	}
}
