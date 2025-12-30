package model.entities;

import java.time.LocalDate;

public class Student {
	
	// Fields.
	private String name;
	private LocalDate birthDate;
	
	// Constructors.	
	public Student(String name, LocalDate birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	// Getters and Setters.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
		
}
