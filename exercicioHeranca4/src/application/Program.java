package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		// Mensagem de apresentação e instrução.
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		// For coletando e registrando os dados.
		for(int i = 0; i<n; i++) {
			System.out.printf("%nTax payer #%d data:%n", i+1);
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().toLowerCase().charAt(0); // Converte para minúsculo e captura o primeiro caractere.
			sc.nextLine(); // Consome quebra de linha pendente.
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
						
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
			
		}
		
		System.out.println(); // Quebra de linha para melhor legibilidade.
		System.out.println("TAXES PAID:");
		
		double acumulatedTaxes = 0.0; // Inicialização de variável armazenando impostos.
		for(TaxPayer tp : list) {
			System.out.printf("%s: $ %.2f%n", tp.getName(), tp.tax());
			acumulatedTaxes += tp.tax();
		}
		
		System.out.printf("%nTOTAL TAXES: $ %.2f", acumulatedTaxes);
		
		
		
		sc.close();
	}

}
