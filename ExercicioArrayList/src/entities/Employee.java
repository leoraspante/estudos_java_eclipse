package entities;

public class Employee {
	
	private int id;
	private String name;
	private double salary; 
	
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	

	public int getId() {
		return id;
	}
	
	public void increaseSalary(double percentage) { // Método para aumento de salário.
		salary += salary * percentage / 100.0;
		
	}

	@Override
	public String toString() { 
		return String.format("Id: %d, Name: %s, Salary: $ %.2f", id, name, salary);
	}
 
}
 