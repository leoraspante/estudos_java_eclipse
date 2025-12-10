package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.enums.ClienteSexo;
import entities.enums.ClienteStatus;
import entities.enums.ClienteTipo;

public class Cliente {
	
	// Padrão para exibição de data/hora.
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); // Data de cadastro.
	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Data de nascimento.
	
	// Atributo estático para controlar os ID's.
	private static int contador = 0;
	
	// Atributos.
	private Integer id;
	private String nome;
	private String razaoSocial;
	private String nomeFantasia;
	private String inscricaoEstadual;
	private String responsavel;
	private String setorAtividade;
	private String email;
	private String telefone;
	private String endereco;
	private String cpf;
	private String cnpj;
	private String rg;
	private LocalDate dataNascimento;
	private LocalDateTime dataCadastro;
	private ClienteTipo tipoCliente;
	private ClienteStatus status;
	private ClienteSexo sexo;
	
	// Construtor pessoa física.
	public Cliente(String nome, String email, String telefone, String endereco, String cpf, String rg, LocalDate dataNascimento, ClienteSexo sexo) {
		contador++;
		this.id = contador;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.tipoCliente = ClienteTipo.PESSOA_FISICA;
		this.status = ClienteStatus.ATIVO;
		this.dataCadastro = LocalDateTime.now();
	}
	
	// Construtor pessoa jurídica.
	public Cliente(String razaoSocial, String nomeFantasia, String email, String telefone, String cnpj, String inscricaoEstadual, String responsavel, String setorAtividade) {
		contador++;
		this.id = contador;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.responsavel = responsavel;
		this.setorAtividade = setorAtividade;
		this.tipoCliente = ClienteTipo.PESSOA_JURIDICA;
		this.status = ClienteStatus.ATIVO;
		this.dataCadastro = LocalDateTime.now();
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
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public String getSetorAtividade() {
		return setorAtividade;
	}
	
	public void setSetorAtividade(String setorAtividade) {
		this.setorAtividade = setorAtividade;
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
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public LocalDateTime getDataCadastro() {
		return dataCadastro;
	}
	
	public ClienteTipo getTipoCliente() {
		return tipoCliente;
	}
	
	public void setTipoCliente(ClienteTipo tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	public ClienteStatus getStatus() {
		return status;
	}
	
	public void setStatus(ClienteStatus status) {
		this.status = status;
	}
	
	public ClienteSexo getSexo() {
		return sexo;
	}
	
	public void setSexo(ClienteSexo sexo) {
		this.sexo = sexo;
	}
	
	
	// toString personalizado.
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(String.format("Cliente [ID=%d]%n", id));
		sb.append(String.format("Tipo: %s%n", tipoCliente));
		sb.append(String.format("Data de Cadastro: %s%n", dataCadastro.format(fmt)));
		
		if(tipoCliente == ClienteTipo.PESSOA_FISICA) {
			sb.append(String.format("Nome: %s%n", nome));
			sb.append(String.format("CPF: %s%n", cpf));
			sb.append(String.format("RG: %s%n", rg));
			sb.append(String.format("Data de Nascimento: %s%n", dataNascimento.format(fmt1)));
			sb.append(String.format("Sexo: %s%n", sexo));
		} else {
			sb.append(String.format("Razão Social: %s%n", razaoSocial));
			sb.append(String.format("Nome Fantasia: %s%n", nomeFantasia));
			sb.append(String.format("CNPJ: %s%n", cnpj));
			sb.append(String.format("Inscrição Estadual: %s%n", inscricaoEstadual));
			sb.append(String.format("Responsavel: %s%n", responsavel));
			sb.append(String.format("Setor / Atividade: %s%n", setorAtividade));
		}
		sb.append(String.format("Email: %s%n", email));
		sb.append(String.format("Telefone: %s%n", telefone));
		sb.append(String.format("Endereço: %s%n", endereco));
		return sb.toString();
	}
	
}
