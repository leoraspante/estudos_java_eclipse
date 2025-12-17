package model.entities;

import java.time.LocalDate;

public class Pessoa {
	
	// Atributos.
	private static int contadorId = 0;
	private Integer id;
	private String nomeCompleto;
	private String cpf;
	private LocalDate dataNascimento;
	private String email;
	private String telefone;
	private Endereco endereco;
	
	// Construtores.
	public Pessoa() {
	}


}
