package entities;

public class MyNumbers {

	private int number;
	
	public MyNumbers(int number) {
		this.number = number;
	}
	
	public double getNumber() {
		return this.number;
	}
	
	@ Override
	public String toString() {
		return "" + number;
	}
}

