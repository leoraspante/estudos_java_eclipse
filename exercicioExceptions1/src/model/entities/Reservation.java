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
	
	public String updateDates(LocalDate checkIn, LocalDate checkOut) {
				
		if (checkIn.isAfter(checkOut)) {
			return "Check-out date must be after check-in date";
		}
		
		if(checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
			return "Reservation dates must be future dates";
		}
		
		if(checkIn.isBefore(this.checkIn) || checkOut.isBefore(this.checkOut)) {
			return "Reservation dates for update must be future dates";
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut; 
		
		return null; // Indica nenhum erro.
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
