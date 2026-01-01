package model.entities;

import java.time.LocalDate;

public class Employee {
	
	// Fields.
	private String name;
	private String cpf;
	private LocalDate birthDate;
	private Double baseSalary;
	
	// Constructors.
	public Employee() {
	}
	
	public Employee(String name, String cpf, LocalDate birthDate, Double baseSalary) {
		this.name = name;
		this.cpf = cpf;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
	}

	// Getters and Setters.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
}
