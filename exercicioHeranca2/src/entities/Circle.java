package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	// Atributos.
	private Double radius;
	
	// Construtores.
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}
	
	// Getters e Setters.
	public Double getRadius() {
		return radius;
	}
	
	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	// Métodos.
	@Override
	public Double area() {
		return Math.pow(radius, 2) * Math.PI;
	}

}
