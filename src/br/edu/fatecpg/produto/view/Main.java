package br.edu.fatecpg.produto.view;
import java.util.Scanner;
import br.edu.fatecpg.produto.model.Produto;

public class Main {
  static Scanner scan = new Scanner(System.in);
	
  public static void main(String[] args) {
	 String nomeP;
	 int quantidadeP;
	 double precoP;
	  
	  System.out.println("Digite o nome do produto");
	  nomeP = scan.nextLine();
	  System.out.println("Digite a quantidade de produto");
	  quantidadeP = scan.nextInt();
	  System.out.println("Digite o preco do produto");
	  precoP = scan.nextDouble();
		
		Produto produtoMercado = new Produto(nomeP,quantidadeP,precoP);
		
		System.out.println(produtoMercado.getPreco());
		System.out.println(produtoMercado.getQuantidade());

		
		System.out.println("Insira o valor do produto a ser alterado");
      double valor = scan.nextDouble();
       produtoMercado.setPreco(valor);
		
       System.out.println("Insira a quantidade a ser alterada");
		int valorQ = scan.nextInt();
		produtoMercado.setQuantidade(valorQ);
		
		System.out.println(produtoMercado.getNome());
		System.out.println(produtoMercado.getPreco());
		System.out.println(produtoMercado.getQuantidade());

		}

}
