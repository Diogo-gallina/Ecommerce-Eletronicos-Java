package br.com.fiap.ecommerce.model;

public class Produto {
	
	private int id;
	private String nome;
	private String marca;
	private String categoria;
	private double precoVenda;
	private double precoCusto;
	private int quantidadeEstoque;
	
	public Produto(int id, String nome, String marca, String categoria, double precoVenda, double precoCusto, int quantidadeEstoque) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.precoVenda = precoVenda;
		this.precoCusto = precoCusto;
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



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getCategoria() {
		return categoria;
	}



	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	public double getPrecoVenda() {
		return precoVenda;
	}



	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}



	public double getPrecoCusto() {
		return precoCusto;
	}



	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}



	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}



	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", marca=" + marca + ", categoria=" + categoria
				+ ", precoVenda=" + precoVenda + ", precoCusto=" + precoCusto + ", quantidadeEstoque="
				+ quantidadeEstoque + "]";
	}
	
	
}
