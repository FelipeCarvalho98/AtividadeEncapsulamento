package br.edu.fatecpg.contabancaria.model;

public class ContaBancaria {
  private String titular;
  private double saldo;
  private double deposito;
  private double saque;
  
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

  public void setDepoistar(double vl) {
	  if(vl > 0 ) {
		  saldo += vl;
		  System.out.println("o depoósito de " + vl + " deu certo , saldo atual :" + saldo);
	  } else {
		  System.out.println("Ap");
	  }
  }
}
 // sysout