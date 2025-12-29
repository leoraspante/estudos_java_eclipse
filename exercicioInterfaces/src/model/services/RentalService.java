package model.services;

import model.entities.Invoice;
import model.entities.Rent;

public class RentalService {

	// Atributos.
	private Double pricePerHour;
	private Double pricePerDay;
	
	// Associações.
	private BrazilTaxService taxService;
	
	// Construtores.
	public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	// Getters e Setters.
	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public BrazilTaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}

	// Métodos.
	public void processInvoice(Rent rent) {
		rent.setInvoice(new Invoice());
	}
	
	
	
}
