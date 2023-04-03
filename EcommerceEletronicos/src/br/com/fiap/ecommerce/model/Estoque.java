package br.com.fiap.ecommerce.model;

import java.util.ArrayList;

public class Estoque {
	private int id;
	private ArrayList<Produto> produtos;
	private int quantidade;
	private String fornecedor;
	
	

	public Estoque(int id, ArrayList<Produto> produtos, int quantidade, String fornecedor) {
		this.id = id;
		this.produtos = produtos;
		this.quantidade = quantidade;
		this.fornecedor = fornecedor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
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





	public void atualizarQuantidade(int qtd) {
		if (qtd > 0) {
			this.quantidade += qtd;
		}else {
			this.quantidade -= qtd;
		}
	}
	
}
