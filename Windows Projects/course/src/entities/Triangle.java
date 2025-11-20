// Criação da classe Triangle.

package entities;

// Nome da classe, definida como public.
public class Triangle {
	// Lados do triângulo "abc" recebendo dados do tipo double.
	public double a;
	public double b;
	public double c;
	
	// Criação da função para realizar o cálculo de área do triângulo.
	public double area() {
		double p = (a + b + c)/2.00;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		
	}
}
