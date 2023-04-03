package br.com.fiap.ecommerce.model;

public class Produto {
	private static int count = 1;
	
	private int id;
	private String nome;
	private String marca;
	private String categoria;
	private double precoVenda;
	private double precoCusto;
	
	public Produto(String nome, String marca, String categoria, double precoVenda, double precoCusto) {
		this.id = count;
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.precoVenda = precoVenda;
		this.precoCusto = precoCusto;
		Produto.count += 1;
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

	@Override
	public String toString() {
		return "Produto [id=" + this.getId() + ", nome=" + this.getNome() + ", marca=" + this.getMarca() + ", categoria=" + this.getCategoria()
				+ ", precoVenda=" + this.getPrecoVenda() + ", precoCusto=" + this.getPrecoCusto() + "]\n";
	}
	
	
}
