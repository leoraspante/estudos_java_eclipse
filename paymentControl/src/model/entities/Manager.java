package model.entities;

import java.time.LocalDate;

public class Manager extends Employee{

	// Fields.
	private Double managementBonus;

	// Constructors.
	public Manager(String name, String cpf, LocalDate birthDate, Double baseSalary, Double managementBonus) {
		super(name, cpf, birthDate, baseSalary);
		this.managementBonus = managementBonus;
	}

	// Getters and Setters.
	public Double getManagementBonus() {
		return managementBonus;
	}

	public void setManagementBonus(Double managementBonus) {
		this.managementBonus = managementBonus;
	}
	
	// Methods.
	public double getSalary() {
		return super.getBaseSalary() + managementBonus;
	}
	
}
