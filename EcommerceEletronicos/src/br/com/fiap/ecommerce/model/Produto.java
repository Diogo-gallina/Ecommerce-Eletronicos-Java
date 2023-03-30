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

	public String getNome() {
		return nome;
	}

	public String getMarca() {
		return marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public String retornoDados() {
		return "id: " + this.getId() + "\nnome: " + this.getNome() +"\nMarca: "+ this.getMarca() + "\nCategoria: "+ this.getCategoria() + "\nPreco Venda: "+ this.getPrecoVenda() +"\nPreco Custo: "+ this.getPrecoCusto() + "\nQuantidade Estoque: " + this.getQuantidadeEstoque();
	}

	
	
}
