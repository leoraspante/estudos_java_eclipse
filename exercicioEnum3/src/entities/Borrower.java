package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Borrower {
	
	// Atributes.
	private String name;
	private String email;
	private LocalDate birthDate;
	
	// Constructors.
	public Borrower() {
	}
	
	public Borrower(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	// Getters.
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	// Setters.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	// Personalized toString.
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(System.lineSeparator());
		sb.append("Email: ");
		sb.append(email);
		sb.append(". Data de Nascimento: ");
		sb.append(birthDate.format(fmt));
		return sb.toString();
	}

}
