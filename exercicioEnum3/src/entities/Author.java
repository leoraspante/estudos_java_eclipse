package entities;

public class Author {
	
	// Atributes.
	private String name;
	private String email;
	
	// Constructors
	public Author() {
	}
	
	public Author(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	// Getters.
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	// Setters.
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// Personalized toString.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do autor: ");
		sb.append(name);
		return sb.toString();
	}
}
