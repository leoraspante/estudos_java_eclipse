package entities;

import java.time.LocalDate;

import entities.enums.AlunoStatus;

public class Aluno {
	
	//Atributos.
	private String name;
	private LocalDate birthDate;
	private AlunoStatus status;
	
	// Construtores.
	public Aluno() {
	}
	
	public Aluno(String name, LocalDate birthDate, AlunoStatus status) {
		this.name = name;
		this.birthDate = birthDate;
		this.status = status;
	}

	// Getters.
	public String getName() {
		return name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public AlunoStatus getStatus() {
		return status;
	}
	
	// Setters.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void setStatus(AlunoStatus status) {
		this.status = status;
	}
	
	// toString personalizado.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do Aluno: ");
		sb.append(name);
		sb.append(". Data de nascimento: ");
		sb.append(birthDate);
		sb.append(", status: ");
		sb.append(status);
		return sb.toString();
	}
	
	
	
	
	
	
}
