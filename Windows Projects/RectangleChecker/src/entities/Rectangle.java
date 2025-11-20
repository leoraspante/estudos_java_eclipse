// Criação da classe Rectangle com seus atributos e métodos.

package entities;

public class Rectangle {

	// Atributos da classe.
	public double width; // largura do retângulo.
	public double height; // Altura do retângulo.
		
	// Definição dos métodos da classe.
	public double Area() { // Calcula a área do retângulo.
		return width * height;
	}
	public double Perimeter() { // Calcula o perímetro do retângulo.
		return 2 * (width + height);
	}
	public double Diagonal() { // Calcula a diagonal do retângulo.
		double powWidth, powHeight;
		powWidth = Math.pow(width, 2); // Potênciação da largura ao quadrado.
		powHeight = Math.pow(height, 2); // Potênciação da altura ao quadrado.
		return Math.sqrt(powWidth + powHeight); // Raiz quadrada, retornando o resultado.
	}
	public String toString() {
		return String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f", Area(), Perimeter(), Diagonal());
		
	} 
}
