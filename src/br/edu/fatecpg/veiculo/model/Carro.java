package br.edu.fatecpg.veiculo.model;

public class Carro {
   private String chassi;
   private String marca;
   private String modelo;
   private String placa;
   private double motor;
   private boolean estado;
   private double capacidadeTanque;
   private double valorGasolina;
   
   
   
   public Carro(String ch,String mrc, String mod,double motor,double cpt,double vlg) {	
	   this.chassi = ch;
	   this.marca = mrc;
	   this.modelo = mod;
	   this.motor = motor;
	   this.estado = false;
	   this.capacidadeTanque = cpt;
	   this.valorGasolina = vlg;
	  }
   public String getChassi() {
	   return this.chassi;
   }
   public void setChassi(String ch) {
	  this.chassi = ch;
   }
   public String getMarca() {
	   return this.marca;
   }
   public void setMarca(String mrc) {
	  this.marca = mrc;
   }
   public String getModelo() {
	   return this.modelo;
   }
   public void setModelo(String mod) {
	   this.modelo = mod;
   }
   public double getMotor() {
	   return this.motor;
   }
  public void setMotor(Double motor) {
	  this.motor = motor;
  }
 public double getCapacidadeTanque() {  
	 return this.capacidadeTanque;
 }
 public void setCapacidadeTanque(Double cpt) {
	 this.capacidadeTanque = cpt;
 }
  public double getValorGasolina() { 
	  return this.valorGasolina;
  }
  public void setValorGasolina(Double vlg) {
	  this.valorGasolina = vlg;
  }
   
  public double calcularValor(double vlg) { 
	  double vltotal = capacidadeTanque * valorGasolina;
	  return vltotal;
  }
  
   public void ligar() {
	   this.estado = true; 
	   System.out.println("ligou!");
   
}
   public void desligar() {
	   System.out.println("Desligou!");
	   this.estado = false;
   }
   public void andar() {
	   if(estado == true) {
		   System.out.println("Carro andando");
	   }else {
		   System.out.println("Carro desligado impossivel andar");
	   }
   }
}

