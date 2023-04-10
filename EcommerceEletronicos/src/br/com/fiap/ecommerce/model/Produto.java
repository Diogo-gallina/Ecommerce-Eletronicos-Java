package br.com.fiap.ecommerce.model;

public class Produto {
	private static int count = 1;
	
	private int id;
	private String nome;
	private String marca;
	private String categoria;
	private double precoVenda;
	private double precoCusto;
	private int quantidadeEstoque;
	
	
	public Produto(String nome, String marca, String categoria, double precoVenda, double precoCusto, int quantidadeEstoque) {
		this.id = count;
		this.nome = nome;
		this.marca = marca;
		this.categoria = categoria;
		this.precoVenda = precoVenda;
		this.precoCusto = precoCusto;
		this.quantidadeEstoque = quantidadeEstoque;
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
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	
	public void calcularLucro() {
		double lucro = precoVenda - precoCusto;
	}
	
	public void alterarQuantidade(int quantidade, int acao) {
		switch(acao) {
			case 1:
				this.quantidadeEstoque += quantidade;
			break;
			case 0:
				this.quantidadeEstoque += quantidade;
			break;
			default:
				System.out.println("escolha 1 ou 0.");
			break;
		}
	}

	@Override
	public String toString() {
		return "Produto\n[id=" + this.getId() + ", nome=" + this.getNome() + ", marca=" + this.getMarca() + ", categoria=" + this.getCategoria()
				+ ", precoVenda=" + this.getPrecoVenda() + ", precoCusto=" + this.getPrecoCusto() + ", QuantidadeEstoque= " 
				+ this.getQuantidadeEstoque() + "]\n";
	}
	
	
}
