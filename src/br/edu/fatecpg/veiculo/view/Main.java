package br.edu.fatecpg.veiculo.view;
import java.util.Scanner;
import br.edu.fatecpg.veiculo.model.Carro;


public class Main {
 static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
    String  chassiC,marcaC,modeloC;
    double motorC,capacidadeC,valorG;
    
    System.out.println("Insira chassi");
    chassiC = scan.nextLine();
    System.out.println("Insira Marca");
    marcaC = scan.nextLine();
    System.out.println("Insira Modelo");
    modeloC = scan.nextLine();
    System.out.println("Insira motor");
    motorC = scan.nextDouble();
    System.out.println("Insira Capacidade do tanque");
    capacidadeC = scan.nextDouble();
    System.out.println("Insira Valor gasolina");
    valorG = scan.nextDouble();
    
   Carro carroAle = new Carro(chassiC,marcaC,modeloC,motorC,capacidadeC,valorG)	;
      carroAle.desligar();
      carroAle.andar();
      System.out.println(carroAle.getChassi());
      System.out.println(carroAle.getMarca());
      System.out.println(carroAle.getModelo());
      System.out.println(carroAle.getMotor());
      System.out.println(carroAle.getCapacidadeTanque());
      System.out.println(carroAle.getValorGasolina());
       
     System.out.println(carroAle.calcularValor(valorG));
	
		

     
	}

}
