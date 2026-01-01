package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.enums.EmployeeType;
import model.services.Service;
import model.utils.Utils;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Service.menuOptions(sc);
	
		//==============================================================================================================//
		System.out.println("Cadastro de funcionários");
		int minValue = -1;
		int employeeQuantity = Utils.readInt(sc, "Informe funcionários deseja cadastrar: ", minValue);
		
		for(int i=0; i<employeeQuantity; i++) {
			String name = Utils.readName(sc, "Nome: ");
			boolean trueCpf = false;
			do {
				String cpf = Utils.readCpf(sc, "CPF: ");
				
				trueCpf = Utils.checkCpf(cpf);
				if(trueCpf) {
					System.out.println("CPF Válido");
				}
				else {
					System.out.printf("%nCPF Inválido, tente novamente.%n%n");
				}
			} while(!trueCpf);
			LocalDate birthDate = Utils.readDate(sc, "Data de nascimento (dd/MM/yyyy): ", fmt);
			EmployeeType jobTitle = Service.readEmployeetype(sc, "Cargo: ");
		}
		
		
		
		
		
		
		
		
		
		//==============================================================================================================//
		sc.close();
	}

}
