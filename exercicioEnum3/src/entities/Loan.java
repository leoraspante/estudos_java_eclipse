package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.enums.LoanStatus;

public class Loan {
	
	// Atributes.
	private LocalDateTime loanDate;
	private LocalDate dueDate;
	private LoanStatus status;
	private Borrower borrower;
	private Book book;
	
	// Constructors.
	public Loan() {
	}
	
	public Loan(LocalDateTime loanDate, LocalDate dueDate, LoanStatus status, Borrower borrower, Book book) {
		this.loanDate = loanDate;
		this.dueDate = dueDate;
		this.status = status;
		this.borrower = borrower;
		this.book = book;
	}
	
	// Getters.
	public LocalDateTime getLoanDate() {
		return loanDate;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public LoanStatus getStatus() {
		return status;
	}
	
	public Borrower getBorrower() {
		return borrower;
	}
	
	public Book getBook() {
		return book;
	}
	
	// Setters.
	public void setLoanDate(LocalDateTime loanDate) {
		this.loanDate = loanDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	
	public void setStatus(LoanStatus status) {
		this.status = status;
	}
	
	public void setBorrower(Borrower borrower) {
		this.borrower = borrower;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	
	// Personalized toString.
	@Override
	public String toString() {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		StringBuilder sb = new StringBuilder();
		sb.append("Locatário ");
		sb.append(borrower);
		sb.append(". Dia/Hora da locação: ");
		sb.append(loanDate.format(fmt));
		sb.append(System.lineSeparator());
		sb.append("Livro escolhido: ");
		sb.append(book);
		sb.append(". Data de devolução: ");
		sb.append(dueDate.format(fmt1));
		sb.append(". Status: ");
		sb.append(status);
		return sb.toString();		
	} 
	
}
