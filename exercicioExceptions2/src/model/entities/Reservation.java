package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
	
	// Atributes.
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;

	// Constructors.
	public Reservation() {
	}
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) {
		
		if(checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now()) ) { // Verifica se o check-in e check-out possuem data menor que a atual do sistema.
			throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
		}	
		if (checkIn.isAfter(checkOut)) { // verifica se o check-in possui data superior ao check-out.
			throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	// Getters and Setters.
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public LocalDate getCheckIn() {
		return checkIn;
	}
	
	public LocalDate getCheckOut() {
		return checkOut;
	}
	
	// Methods.
	public Integer duration() {
		int daysBetween = (int) ChronoUnit.DAYS.between(checkIn, checkOut);
		return daysBetween;
	}
	
	public void updateDates(LocalDate checkIn, LocalDate checkOut) {
		
		if(checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now()) ) { // Verifica se o check-in e check-out possuem data menor que a atual do sistema.
			throw new IllegalArgumentException("Error in reservation: Reservation dates for update must be future dates");
		}
				
		if (checkIn.isAfter(checkOut)) { // verifica se o check-in possui data superior ao check-out.
			throw new IllegalArgumentException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	// Personalized toString.
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: Room ");
		sb.append(roomNumber);
		sb.append(", check-in: ");
		sb.append(checkIn.format(fmt));
		sb.append(", check-out: ");
		sb.append(checkOut.format(fmt));
		sb.append(", ");
		sb.append(duration());
		sb.append(" nights");
		return sb.toString();
	}
		
}
