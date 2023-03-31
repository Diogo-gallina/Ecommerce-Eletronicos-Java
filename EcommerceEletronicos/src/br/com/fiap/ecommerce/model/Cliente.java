package br.com.fiap.ecommerce.model;

public class Cliente {
	private int id;;
	private String nome;
	private String email;
	private String celular;
	private Endereco endereco;
	
	public Cliente(int id, String nome, String email, String celular, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.celular = celular;
		this.endereco = endereco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", celular=" + celular + ", endereco="
				+ endereco + "]";
	}
	

	
}
