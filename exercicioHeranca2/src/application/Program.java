package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // Usa ponto como separador decimal.
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>(); // Cria uma lista do tipo Color.
		
		// Mensagem de apresentação e captura de dados.
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine(); // Consome quebra de linha pendente.
		
		// For capturando e registrando os dados.
		for(int i=0; i<n; i++) {
			System.out.printf("Shape #%d data:%n", i+1);
			System.out.print("Rectangle or Circle (r/c)? ");
			char shape = sc.next().charAt(0);
			System.out.print("Color (BLACK/RED/BLUE): ");
			Color color = Color.valueOf(sc.next().toUpperCase());
			
			if(shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(color, width, height)); // Cria e adiciona um objeto do tipo Rectangle a lista.
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius)); // Cria e adiciona um objeto do tipo Circle a lista.
			}
		}
		
		System.out.println(); //Quebra de linha para melhor legibilidade.
		System.out.println("SHAPE AREAS:");
		
		// For each imprimindo os valores armazenados na lista.
		for(Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		sc.close();
	}

}
