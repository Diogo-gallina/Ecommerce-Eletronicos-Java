package br.com.fiap.ecommerce.view;
import br.com.fiap.ecommerce.model.*;

public class Main {
	public static void main(String[] args) {
		Produto p = new Produto(1, "iphone 13", "Aplle", "Celular", 3000, 2000, 30);
		
		p.retornoDados();
		System.out.println(p.retornoDados());
		
	}
}
