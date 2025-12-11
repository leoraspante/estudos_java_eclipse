package entities;

public class Company extends TaxPayer {

	// Atributos.
	private int numberOfEmployees;

	// Construtores.
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	// Getters e Setters.
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	// Métodos.
	@Override
	public Double tax() {
		double totalTax = 0.0; // Acumula o tal de imposto devido.
		
		if(numberOfEmployees > 10) {
			totalTax = super.getAnualIncome() * 0.14;
		}
		else {
			totalTax = super.getAnualIncome() * 0.16;
		}
		return totalTax;
	}
}
