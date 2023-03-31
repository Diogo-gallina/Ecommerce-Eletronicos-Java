package br.com.fiap.ecommerce.view;
import br.com.fiap.ecommerce.model.*;

public class Main {
	public static void main(String[] args) {
		Cliente cliente = new Cliente(1, "Eduardo", "Eduardo@email.com", "11 98605145", null);
		Endereco endereco = new Endereco(1, "151614", "Av guanabara", 152, "Casa 5");
		Produto produto = new Produto(1, "iphone 13", "Aplle", "Celular", 3000, 2000, 30);
		Pagamento pagamento = new Pagamento(1, "asd", "64", (short) 123, 254);
		
		System.out.println(cliente.toString());
		System.out.println("\n\n" + endereco.toString());
		System.out.println("\n\n" + produto.toString());
		System.out.println("\n\n" + pagamento.toString());
		
	}
}
