package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import util.InputUtils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		Integer number = InputUtils.readInt(sc, "Number: ");
		String holder = InputUtils.readNameString(sc, "Holder: ");
		Double balance = InputUtils.readDouble(sc, "Initial balance: ");
		Double withdrawLimit = InputUtils.readDouble(sc, "Withdraw limit: ");
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("First account data");
		System.out.println();
		System.out.println(acc);
		
		System.out.println();
		Double withdrawAmount = InputUtils.readDouble(sc, "Enter amount for withdraw: ");
		
		acc.withdraw(withdrawAmount);
		
		System.out.println();
		System.out.println("Updated account data");
		System.out.println();
		System.out.println(acc);
		
		sc.close();
	}

}
