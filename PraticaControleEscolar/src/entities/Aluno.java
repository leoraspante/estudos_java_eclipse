package entities;

public class Aluno {
	
	private String nome;
	private String endereco;
	private String dataNasc;
	private String nomePai;
	private String nomeMae;
	private int matricula;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	// Construtor para cadastro de aluno.
	public Aluno(String nome, String endereco, String dataNasc, String nomePai, String nomeMae) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
	}
	
	
}
