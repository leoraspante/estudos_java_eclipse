package entities;

public class Student {
	// Atributos da classe.
	public String nome;
	public double primeiroTrimestre;
	public double segundoTrimestre;
	public double terceiroTrimestre;
	
	public double gradeCalculator() {
		return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
	}
	public void passChecker() {
		double aux;
		if (gradeCalculator() >= 60) {
			System.out.printf("FINAL GRADE = %.2f%n", gradeCalculator());
			System.out.println("PASS");
		}
		else {
			aux = 60 - gradeCalculator();
			System.out.printf("FINAL GRADE = %.2f%,", gradeCalculator());
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aux);
			return; 
		}
	}
}
