package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
	
	// Atributos.
	private String name;
	private String email;
	private LocalDate birthDate;
	
	// Construtores.
	public Client() {
		
	}
	
	public Client(String name, String email, LocalDate birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	
	// Getters e Setters.
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	// toString personalizado.
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" (");
		sb.append(birthDate.format(fmt));
		sb.append(") - ");
		sb.append(email);

		return sb.toString();
	}
}
