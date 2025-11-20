package entities;

public class Employee {
	
	// Definição dos atributos.
	public String name;
	public double grossSalary;
	public double tax;
	
	// Definição dos métodos;
	public double netSalary() { // Retorna o salário líquido.
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) { // Retorna o salário com aumento.
		grossSalary += (grossSalary * percentage) / 100;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}


