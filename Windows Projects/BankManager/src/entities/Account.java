package entities;

public class Account {

	// Atributos da classe.
	private int number;
	private String name;
	private double balance;
	
	// Criação do construtor.
	public Account (int number, String name, double balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	// Método que permite a captura do nome do cliente.
	public String getName() {
		return name;
	}
	
	// Método que permite a captura do número da conta.
	public int getNumber() {
		return number;
	}
	
	// Método que permite a captura do saldo da conta.
	public double getBalance() {
		return balance;
	}
	
	// Métodos da classe
	
	// Operação de Depósito.
	public void addBalance(double balance) {
		this.balance += balance;
	}
	
	// Operação de saque.
	public void removeBalance(double balance) {
		double tax = 5.00;
		this.balance -= balance + tax;
	}
}
