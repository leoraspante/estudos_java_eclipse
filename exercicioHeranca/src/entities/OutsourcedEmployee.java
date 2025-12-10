package entities;

public class OutsourcedEmployee extends Employee {

	// Atributos.
	private Double additionalCharge;
	
	// Construtores.
	public OutsourcedEmployee() {
		super();
	}
	
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge; 
	}
	
	// Getters e Setters.
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	// Método.
	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	// toString personalizado. SERÁ AJUSTADO NO FINAL CONFORME SOLICITADO PELO EXERCÍCIO.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// Personalizar a saída.
		return sb.toString();
		}
}
