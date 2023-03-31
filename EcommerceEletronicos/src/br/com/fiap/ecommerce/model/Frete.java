package br.com.fiap.ecommerce.model;

public class Frete {
	private String cepEnvio;
	private String cepDestino;
	private double valorFrete;
	
	public Frete(String cepEnvio, String cepDestino, double valorFrete) {
		this.cepEnvio = cepEnvio;
		this.cepDestino = cepDestino;
		this.valorFrete = valorFrete;
	}

	public String getCepEnvio() {
		return cepEnvio;
	}

	public void setCepEnvio(String cepEnvio) {
		this.cepEnvio = cepEnvio;
	}

	public String getCepDestino() {
		return cepDestino;
	}

	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}

	public double getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(double valorFrete) {
		this.valorFrete = valorFrete;
	}
	
	public void calcularFrete() {
		
	}
	
	
	
	
}
