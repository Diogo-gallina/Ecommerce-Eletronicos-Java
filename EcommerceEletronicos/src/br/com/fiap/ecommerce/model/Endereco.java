package br.com.fiap.ecommerce.model;

public class Endereco {
	private int id;
	private String cep;
	private String logradouro;
	private int numero;
	private String complemento;
	
	public Endereco(int id, String cep, String logradouro, int numero, String complemento) {
		this.id = id;
		this.cep =cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco\n[id: " + id + ", cep: " + cep + ", logradouro: " + logradouro + ", numero: " + numero
				+ ", complemento: " + complemento + "]";
	}
	
	
}
