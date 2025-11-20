package entities;

public class Employee {
	
	// Definição dos atributos.
	private Integer id;
	private String name;
	private Double salary; 
	
	// Contrutor sem argumentos.
	public Employee() {
		
	}
	
	// Construtor com argumentos.
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Getters.
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public Double getSalary() {
		return salary;
	}
	
	// Setters.
	public Integer setId(Integer id) {
		return this.id = id;
	}
	public String setName(String name) {
		return this.name = name;
	}
	public Double setSalary(Double salary) {
		return this.salary = salary;
	}
	
	// Métodos.
	public void increaseSalary(double percentage) {
		salary += salary * percentage / 100.0;
		
	}

	// toString personalizada.
	@Override
	public String toString() { 
		return String.format("Id: %d, Name: %s, Salary: $ %.2f", id, name, salary);
	}
 
}
 