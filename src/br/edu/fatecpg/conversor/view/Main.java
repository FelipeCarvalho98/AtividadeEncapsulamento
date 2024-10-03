package br.edu.fatecpg.conversor.view;
import br.edu.fatecpg.conversor.model.Conversor;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String texto;
        int quilometros;
        double temperaturaC;
		
        Conversor conversor = new Conversor();
        
        
        System.out.println("Insira o texto a ser maiusculo");
        texto = scan.nextLine();
        System.out.println("Insira os quilometros a virar milhas");
        quilometros = scan.nextInt();
        System.out.println("Insira a temperatura em C para virar F");
        temperaturaC = scan.nextDouble();
		
      System.out.println(conversor.Converter(texto)); 
        
      System.out.println(conversor.Converter(quilometros)); 
        
      System.out.println(conversor.Converter(temperaturaC)); 
	}

}
