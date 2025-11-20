package entities;

public class Product {
	
	// Definição dos atributos.
	private String nomeProduto;
	private double precoProduto;
	
	// Definição de métodos para a leitura e alteração do atributo privado.
	public String getNomeProduto() {
		return nomeProduto;
	}
	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

}
