// Descrição do exercício.

// Prática no tratamento de exceções, segunda solução ruim.

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato personalizado de captura e exibição de datas.
		
		// Primeira captura de dados.
		System.out.print("Room number: ");
		Integer roomNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(),fmt);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(),fmt);
		
		// Objetos para primeira verificação.
		Reservation temp = new Reservation(roomNumber, checkIn, checkOut);
		String error = temp.updateDates(checkIn, checkOut);
		
		if(error != null) {
			System.out.println("Reservation error: " + error);
			System.out.println();
		}
		else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			System.out.println();
			
			System.out.println("Enter data to update reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			LocalDate updatedCheckIn = LocalDate.parse(sc.next(), fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			LocalDate updatedCheckOut = LocalDate.parse(sc.next(), fmt);
			
			// Objetos para segunda verificação.
			Reservation updatedTemp = new Reservation(roomNumber, updatedCheckIn, updatedCheckOut);
			String updatedError = updatedTemp.updateDates(updatedCheckIn, updatedCheckOut);
			
			if(updatedError != null) {
				System.out.println("Reservation error: " + updatedError);
				System.out.println();
			}
			else {
				Reservation updatedReservation = new Reservation(roomNumber, updatedCheckIn, updatedCheckOut);
				System.out.println(updatedReservation);
				System.out.println();
			}
			
		}
		
		sc.close();
	}

}
