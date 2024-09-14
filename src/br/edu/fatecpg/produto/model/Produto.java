package br.edu.fatecpg.produto.model;

public class Produto {
 private String nome;
 private int quantidade;
 private double preco;

public Produto(String nm, int qntd, double prc) {
	 this.nome = nm;
	 this.quantidade = qntd;
	 this.preco = prc;
}

public String getNome() {
	return this.nome;
}
public int getQuantidade() {
	return this.quantidade;
}
public double getPreco() {
  return this.preco;	
}

public void setPreco(double vl) {
	if(vl > 0) {
		preco = vl;
	}
	else {
		System.out.println("Apenas valores igual ou maior que 1 real");
	}
}
public void setQuantidade(int vl) {	
	if(vl>0) {
		quantidade = vl;
	}
	else {
		System.out.println("Apenas valores maior igual a 0");
	}
}
}