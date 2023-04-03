package br.com.fiap.ecommerce.view;

import br.com.fiap.ecommerce.model.*;
import java.util.*;


public class Main {
	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Produto> produtos;
	private static ArrayList<Cliente> clientes;
	private static ArrayList<Endereco> enderecos;
	private static ArrayList<Estoque> estoques;
	private static Map<Produto, Integer> carrinho;
	
	public static void main(String[] args) {
		produtos = new ArrayList();
		clientes = new ArrayList();
		enderecos = new ArrayList();
		estoques = new ArrayList();
		carrinho = new HashMap<>();
		menuInicial();
		
	}
	
	private static void menuInicial() {
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("----------------------GALLINA STORE------------------------");
		System.out.println("-----------------------------------------------------------\n");
		System.out.println("  -------------- Você deseja logar como: ---------------\n");
		System.out.println("  --------------------------------------------------------");
		System.out.println("            Opcao 1 - Cliente");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 2 - Funcionario");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 0 - Sair");
		System.out.println("-----------------------------------------------------------\n");
		
		int opcao = (scan.nextInt());
		switch (opcao){
			case 1:
				cadastroCliente();
				break;
			case 2: 
				loginFuncionario();
				break;
			case 0: 
				System.out.println("Volte sempre!");
				System.exit(opcao);
		}
	}
	
	private static void cadastroCliente() {
		System.out.println("Digite o seu Nome: ");
		String nome = scan.next();
		
		System.out.println("Digite o seu email: ");
		String email = scan.next();
		
		System.out.println("Informe o seu cep: ");
		String cep = scan.next();
		
		System.out.println("Informe o seu logradouro: ");
		String logradouro = scan.next();
		
		System.out.println("Numero: ");
		int numero = scan.nextInt();
		
		System.out.println("Complemento: ");
		String complemento = scan.next();
		
		Endereco endereco = new Endereco(1, cep, logradouro, numero, complemento);
		Cliente cliente = new Cliente(1, nome, email, endereco);
		
		clientes.add(cliente);
		enderecos.add(endereco);
		
		System.out.println("\nLogin realizado.\n");
		
		menu();
	}
	
	private static void loginFuncionario() {
		System.out.println("Digite a senha de acesso: ");
		String senha = scan.next();
		
		//A senha de acesso de funcionario é admin
		
		if (senha.equals("admin")) {
			menuFuncionario();
		}else {
			System.out.println("Senha incorreta!");
			menuInicial();
		}
	}
	
	private static void menuFuncionario() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("----------------------GALLINA STORE------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------\n\n");
		System.out.println("-------------------MENU DE FUNCIONARIOS---------------------");
		System.out.println("-----------------------------------------------------------\n");
		System.out.println("            Opcao 1 - Cadastrar produto");
		System.out.println("-----------------------------------------------------------"); 
		System.out.println("            Opcao 2 - Remover produto");
		System.out.println("-----------------------------------------------------------"); 
		System.out.println("            Opcao 3 - Listar produtos");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 4 - Voltar ao menu inicial");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 0 - Sair");
		System.out.println("-----------------------------------------------------------\n");

		int opcao = scan.nextInt();
		
		switch (opcao) {
			case 1:
				cadastrarProduto();
				break;
			case 2: 
				removerProduto();
				break;
			case 3: 
				listarProdutos();
				break;
			case 4: 
				menuInicial();
				break;
			case 0:
				System.exit(opcao);
		}
	}
	
	private static void menu() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("----------------------GALLINA STORE------------------------");
		System.out.println("-----------------------------------------------------------\n\n");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 1 - Ver meus dados");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 2 - Listar produtos");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 3 - Calcular Frete");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 4 - Comprar");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 5 - Ver Carrinho");
		System.out.println("-----------------------------------------------------------");
		System.out.println("            Opcao 0 - Sair");
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("\n\nDigite uma operação que deseja realizar: ");
		int opcao = scan.nextInt();
		
		switch(opcao) {
			case 1:
				dadosCliente();
			break;
			case 2:
				listarProdutos();
				break;
			case 3:
				//calcularFrete();
				break;
			case 4:
				comprarProduto();
				break;
			case 5:
				verCarrinho();
				break;
			case 0:
				System.out.println("Volte sempre!");
				System.exit(opcao);
				break;
			default:
				System.out.println("Opção inválida.");
				menu();
		}
	}
	
	private static void dadosCliente() {
		System.out.println("\n------------Seus dados------------\n");
		System.out.println(clientes.toString() + "\n");
		
		System.out.println("Digite 1 para voltar para o menu.");
		int opcao = scan.nextInt();
		
		if (opcao != 1) {
			System.out.println("\nOpcao invalida.");
			dadosCliente();
		}
		else {
			menu();
		}
		
		
	}
	
	private static void cadastrarProduto() {
		System.out.println("Digite o nome do produto:");
		String nome = scan.next();
		
		System.out.println("Digite a marca:");
		String marca = scan.next();
		
		System.out.println("Digite a categoria:");
		String categoria = scan.next();
		
		System.out.println("Digite o preco de venda:");
		double precoVenda = scan.nextDouble();
		
		System.out.println("Digite o preco de custo:");
		double preocCusto = scan.nextDouble();
		
		System.out.println("Digite a quantidade em estoque:");
		int quantidadeEstoque = scan.nextInt();
		
		Produto produto = new Produto(nome, marca, categoria, precoVenda, preocCusto);
		produtos.add(produto);
		
		System.out.println("\nProduto cadastrado!\n");
		menuFuncionario();
	}
	
	private static void removerProduto() {
		System.out.println("Produtos: \n");
		
		for (Produto p : produtos) {
			System.out.println(p + "\n");
		}
		
		System.out.println("\ninforme o código do produto que deseja excluir: ");
		
		int id = Integer.parseInt(scan.next());
		
		for (Produto p : produtos) {
			if (p.getId() == id) {
				produtos.remove(p.getId());
			}else {
				System.out.println("\nCódigo informado não condiz com os produtos");
				menuFuncionario();
			}
		}
		
	}
	
	private static void listarProdutos() {
		if (produtos.size() > 0) {
			System.out.println("Lista de produtos");
			
			for(Produto p : produtos) {
				System.out.println(p + "\n");
			}
		}
		else {
			System.out.println("\nNenhum produto foi adicionado a lista.");
		}
		
		menu();
	}
	
	private static void comprarProduto() {
		if (produtos.size() > 0) {
			System.out.println("Código do produto");
			
			System.out.println("--------------------Produtos----------------------");
			for(Produto p : produtos) {
				System.out.println(p + "\n");
			}
			
			int id = Integer.parseInt(scan.next());
			boolean temP = false;
			
			for (Produto p : produtos) {
				if (p.getId() == id) {
					int qtd = 0;
					try {
						//Checa se o produto já esta no carrinho, caso ttenha incrementa a quantidade
						qtd = carrinho.get(p);
						carrinho.put(p, qtd +1);
					}catch(NullPointerException e) {
						//Se o produto for o primeiro no carrinho
						carrinho.put(p, 1);
					}
					
					System.out.println(p.getNome() + "adicionado ao carrinho.");
					temP = true;
					
					if (temP) {
						System.out.println("Deseja adicionar outro produto ao carrinho?");
						System.out.println("Digite 1 para sim e 0 para finalizar compra.");
						int opcao = Integer.parseInt(scan.next());
						
						if (opcao == 1 ) {
							comprarProduto();
						}
						else {
							finalizarCompra();
						}
					}
				}else {
					System.out.println("\nProduto não encontrado.\n");
					menu();
				}
			}
			
		} else {
			System.out.println("\nNao exixtem produtos cadastrados\n");
			menu();
		}
	}
	
	private static void verCarrinho() {
		System.out.println("------------ Produtos no seu carrinho-------------");
		if (carrinho.size() > 0) {
			for (Produto p : carrinho.keySet()) {
				System.out.println("Produto: " + p + "\nQuantidade: " + carrinho.get(p));
			}
		}
		else {
			System.out.println("\nCarrinho vazio.\n");
		}
		
		menu();
	}
	
	private static void finalizarCompra() {
		Double valorTotal = 0.0;
		
		System.out.println("Seus produtos: ");
		
		for (Produto p : carrinho.keySet()) {
			int qtd = carrinho.get(p);
			valorTotal += p.getPrecoVenda() * qtd;
			System.out.println(p);
			System.out.println("Quantidade: " + qtd);
			System.out.println("=======================");
			
		}
		
		System.out.println("Valor da sua compra: " + valorTotal + "\n");
		carrinho.clear();
		
		System.out.println("\nObrigado pela preferencia!\n\n");
		menu();
	}
	
	
	
	
	
	
	
}
