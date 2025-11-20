package util;

public class CurrencyConverter {
	
	// Constante representando o valor fixo do IOF.
	public static final double IOF = 0.06;
	
	// Definição dos métodos.
	public static double dollarToReal(double dollarValue, double dollarAmount) { // Realiza a conversão entre moedas.
		return dollarValue * dollarAmount * (1.0 + IOF);
	}
} 
