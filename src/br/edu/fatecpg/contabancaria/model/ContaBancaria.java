package br.edu.fatecpg.contabancaria.model;

public class ContaBancaria {
  private String titular;
  private double saldo;

  public ContaBancaria(String nt,double sd) {
	  this.titular = nt;
	  this.saldo = sd;
  }
  
  public String getTitular() {
	  return this.titular;
  }
  public void setTitular(String nt) {
	  this.titular = nt;
  }
  public double getMostrarSaldo() {
	  return this.saldo;
  }
  public void setSaldoInicial(double vl) {
	  this.saldo = vl;
  }

  public void setDepositar(double vl) {
	  if(vl > 0 ) {
		  saldo += vl;
		  System.out.println("o depoósito de " + vl + " deu certo , saldo atual :" + saldo);
	  } else {
		  System.out.println("Apenas depositos acima de 0 reais");
	  }
 
	   }
  public void setSacar(double vl) {	
	   if (vl > 0 && vl < saldo) {
		   saldo -= vl;
		   System.out.println("o saque de " + vl + "deu certo , saldo atual :" + saldo);
	   }
	   else {
		   System.out.println("apenas saques acima de 0 reais ou que saldo disponivel");
	   }
  }
}
 