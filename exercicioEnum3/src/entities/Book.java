package entities;

public class Book {
	
	// Atributes.
	private String title;
	private Double price;
	private Author author;
	
	// Constructors
	public Book() {
	}
	
	public Book(String title, Double price, Author author) {
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	// Getters.
	public String getTitle() {
		return title;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	// Setters.
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	// Personalized toString.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title);
		sb.append(", Preço: R$");
		sb.append(String.format("%.2f", price));
		sb.append(System.lineSeparator());
		sb.append(author);
		return sb.toString();
	}

}
