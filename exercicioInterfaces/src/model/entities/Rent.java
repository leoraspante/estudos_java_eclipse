package model.entities;

import java.time.Duration;
import java.time.LocalDateTime;

public class Rent {

	// Atributos.
	private LocalDateTime rentTime;
	private LocalDateTime returnTime;
	
	// Associações.
	private Car car;
	private Invoice invoice;
	
	// Contrutores.
	public Rent() {
	}
	
	public Rent(LocalDateTime rentTime, LocalDateTime returnTime, Car car) {
		this.rentTime = rentTime;
		this.returnTime = returnTime;
		this.car = car;
	}

	// Getters e Setters.
	public LocalDateTime getRentTime() {
		return rentTime;
	}

	public void setRentTime(LocalDateTime rentTime) {
		this.rentTime = rentTime;
	}

	public LocalDateTime getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(LocalDateTime returnTime) {
		this.returnTime = returnTime;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}	
	
	// Métodos
	public Duration parkingDuration(LocalDateTime rentTime, LocalDateTime returnTime) {
		return Duration.between(rentTime, returnTime);
	}
	
}
