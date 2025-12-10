package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.enums.FuncionarioCargo;
import entities.enums.FuncionarioSetor;
import entities.enums.FuncionarioSexo;
import entities.enums.FuncionarioStatus;

public class Funcionario {

	// Padrão para exibição de data/hora.
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Data de cadastro.
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Data de nascimento.
	
	// Atributo estático para controlar os ID's.
	private static int contador = 0;
	
	// Atributos.
	private Integer id;
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	private FuncionarioSexo sexo;
	private FuncionarioCargo cargo;
	private FuncionarioSetor setor;
	private Double salario;
	private String email;
	private String telefone;
	private LocalDateTime dataAdmissao;
	private FuncionarioStatus status;
	
	// Construtor;
	public Funcionario(String nome, String cpf, LocalDate dataNascimento, FuncionarioSexo sexo, FuncionarioCargo cargo, FuncionarioSetor setor, Double salario, String email, String telefone) {
		contador++;
		this.id = contador;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cargo = cargo;
		this.setor = setor;
		this.salario = salario;
		this.email = email;
		this.telefone = telefone;
		this.dataAdmissao = LocalDateTime.now();
		this.status = FuncionarioStatus.ATIVO;
	}
	
	// Getters e Setters.
	public Integer getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public FuncionarioSexo getSexo() {
		return sexo;
	}
	
	public void setSexo(FuncionarioSexo sexo) {
		this.sexo = sexo;
	}
	
	public FuncionarioCargo getCargo() {
		return cargo;
	}
	
	public void setCargo(FuncionarioCargo cargo) {
		this.cargo = cargo;
	}
	
	public FuncionarioSetor getSetor() {
		return setor;
	}
	
	public void setSetor(FuncionarioSetor setor) {
		this.setor = setor;
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public LocalDateTime getDataAdmissao() {
		return dataAdmissao;
	}
	
	public FuncionarioStatus getStatus() {
		return status;
	}
	
	public void setStatus(FuncionarioStatus status) {
		this.status = status;
	}
	
	// toString personalizado.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		// Implementar código....
		
		
		return sb.toString();
	}
	
}
