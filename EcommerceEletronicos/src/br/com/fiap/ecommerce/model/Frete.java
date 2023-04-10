package br.com.fiap.ecommerce.model;

public class Frete {
	private int id;
	private String cepEnvio;
	private String cepDestino;
	private double valorFrete;
	
	public Frete() {

	}
	
	public Frete(String cepEnvio, String cepDestino) {
		this.cepEnvio = cepEnvio;
		this.cepDestino = cepDestino;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public void calcularFrete(double distancia) {
		valorFrete = distancia * 0.88;
	}
	
	
	
	
}
