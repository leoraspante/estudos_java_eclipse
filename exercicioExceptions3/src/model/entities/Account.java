package model.entities;

public class Account {
	
	// Atributes.
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	// Constructors.
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	// Getters and Setters.
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	// Methods.
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(amount > withdrawLimit) {
			System.out.println("Withdraw error: The amount exceeds withdraw limit");
		}
		else if(amount > balance) {
			System.out.println("Withdraw error: Not enough balance");
		}
		else {
			balance -= amount;
		}
	}
	
	// toString personalized.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Account holder: ");
		sb.append(holder);
		sb.append(System.lineSeparator());
		sb.append(String.format("Account balance: $ %.2f", balance));
		sb.append(System.lineSeparator());
		sb.append(String.format("Account withdraw limit: $ %.2f", withdrawLimit));
		sb.append(System.lineSeparator());
		return sb.toString();
	}
	
}
