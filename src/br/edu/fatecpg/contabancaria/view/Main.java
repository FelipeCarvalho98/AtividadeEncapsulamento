package br.edu.fatecpg.contabancaria.view;

import java.util.Scanner;

import br.edu.fatecpg.contabancaria.model.ContaBancaria;

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomet;
		double valor;
		System.out.println("Inserir nome cliente");
		nomet = scan.nextLine();		
		ContaBancaria contaCliente = new ContaBancaria("" , 0);
		contaCliente.setTitular(nomet);
		System.out.println(contaCliente.getTitular());
		System.out.println("Saldo inicial = " + contaCliente.getMostrarSaldo());
		
	}

}
