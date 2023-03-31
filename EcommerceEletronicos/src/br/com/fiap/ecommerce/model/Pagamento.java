package br.com.fiap.ecommerce.model;

public class Pagamento {
	private int id;
	private String tipoPagamento;
	private String numeroCartao;
	private short codigoSeguranca;
	private double valorPagamento;
	


	public Pagamento(int id, String tipoPagamento, String numeroCartao, short codigoSeguranca, double valorPagamento) {
		this.id = id;
		this.tipoPagamento = tipoPagamento;
		this.numeroCartao = numeroCartao;
		this.codigoSeguranca = codigoSeguranca;
		this.valorPagamento = valorPagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public short getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(short codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	@Override
	public String toString() {
		return "Pagamento [id=" + id + ", tipoPagamento=" + tipoPagamento + ", numeroCartao=" + numeroCartao
				+ ", codigoSeguranca=" + codigoSeguranca + ", valorPagamento=" + valorPagamento + "]";
	}



	
	
}
