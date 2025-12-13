// Descrição do exercício.

// Prática no tratamento de exceções, terceira solução boa.

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Reservation;
import util.InputUtils;
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato personalizado de captura e exibição de datas.
		
		try {
			// Primeira captura de dados.
			int roomNumber = InputUtils.readInt(sc, "Room number: ");
			LocalDate checkIn = InputUtils.readDate(sc, "Check-in date (dd/MM/yyyy): ", fmt);
			LocalDate checkOut = InputUtils.readDate(sc, "Check-out date (dd/MM/yyyy): ", fmt);
			
			// Criação do objeto reservation com os parâmetros coletados.
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			System.out.println();
			
			// Segunda captura de dados.
			System.out.println("Enter data to update reservation:");
			checkIn = InputUtils.readDate(sc, "Check-in date (dd/MM/yyyy): ", fmt);
			checkOut = InputUtils.readDate(sc, "Check-out date (dd/MM/yyyy): ", fmt);
	
			// Atualização do objeto reservation com os dados atualizados.
			reservation.updateDates(checkIn, checkOut);
			System.out.println(reservation);
			System.out.println();
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
