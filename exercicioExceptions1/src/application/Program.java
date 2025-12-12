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
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		

		System.out.print("Room number: ");
		Integer roomNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(),fmt);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(),fmt);
		
		Reservation reservation = null;
		
		if(checkIn.isAfter(checkOut)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}
		else {
			reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			System.out.println();
		}
		
		System.out.println("Enter data to update reservation:");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate updatedCheckIn = LocalDate.parse(sc.next(), fmt);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate updatedCheckOut = LocalDate.parse(sc.next(), fmt);

		if(updatedCheckIn.isBefore(checkOut) || updatedCheckOut.isBefore(checkIn)) {
			System.out.println("Error in reservation: Reservation dates for update must be future dates");
		}
		else{
			if(updatedCheckIn.isAfter(updatedCheckOut)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}
			else {
				reservation.updateDates(updatedCheckIn, updatedCheckOut);
				System.out.println(reservation);
				System.out.println();
			}
		}
		
		sc.close();
	}

}
