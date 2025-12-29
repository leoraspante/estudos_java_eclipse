package model.entities;

public class Student {
	
	// Fields
	private String name;
	private Double grade;

	
	// Constructors.
	public Student() {
	}
	
	public Student(String name, Double grade) {
		this.name = name;
		this.grade = grade;
	}


	// Getters and Setters.
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getGrade() {
		return grade;
	}


	public void setGrade(Double grade) {
		this.grade = grade;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do aluno: ");
		sb.append(name);
		sb.append(". Nota final: ");
		sb.append(String.format("%.2f", grade));
		return sb.toString();
	}
	
}

