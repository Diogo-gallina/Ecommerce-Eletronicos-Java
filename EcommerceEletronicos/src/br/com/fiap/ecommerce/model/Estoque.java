package br.com.fiap.ecommerce.model;

public class Estoque {
	private int id;
	private String produto;
	private int quantidade;
	private String fornecedor;
	private double precoCusto;
	
	public Estoque(int id, String produto, int quantidade, String fornecedor, double precoCusto) {
		this.id = id;
		this.produto = produto;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
		this.precoCusto = precoCusto;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public void adicionarProduto() {
		
	}
	
	public void removerProduto() {
		
	}
	
	public void atualizarQuantidade() {
		
	}
	
}
