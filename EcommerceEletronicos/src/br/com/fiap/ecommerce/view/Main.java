package br.com.fiap.ecommerce.view;
import br.com.fiap.ecommerce.model.*;

public class Main {
	public static void main(String[] args) {
		Produto produto = new Produto(1, "iphone 13", "Aplle", "Celular", 3000, 2000, 30);
		Endereco endereco = new Endereco(1, "151614", "Av guanabara", 152, "Casa 5");

		System.out.println(produto.dadosProduto());
		System.out.println("\n\n" + endereco.dadosEndereco());
		
	}
}
