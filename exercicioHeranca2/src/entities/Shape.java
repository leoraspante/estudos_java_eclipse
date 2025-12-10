package entities;

import entities.enums.Color;

public abstract class Shape {
	
	// Atributos.
	private Color color;
	
	// Construtores.
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	// Getters e Setters.
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	// Métodos.
	public abstract Double area();

}
