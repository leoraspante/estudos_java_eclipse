package model.entities;

import java.time.LocalDate;

public class Salesman extends Employee{

	// Fields.
	private Double comissionBonus;

	// Constructors.
	public Salesman(String name, String cpf, LocalDate birthDate, Double baseSalary, Double comissionBonus) {
		super(name, cpf, birthDate, baseSalary);
		this.comissionBonus = comissionBonus;
	}

	// Getters and Setters.
	public Double getComissionBonus() {
		return comissionBonus;
	}

	public void setComissionBonus(Double comissionBonus) {
		this.comissionBonus = comissionBonus;
	}
	
	// Methods.
	public double getSalary() {
		return super.getBaseSalary() + comissionBonus;
	}
	
}
