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
		System.out.println("Inserir saldo inicial");
		valor = scan.nextDouble();
		ContaBancaria contaCliente = new ContaBancaria("" , valor);
		contaCliente.setTitular(nomet);
		System.out.println(contaCliente.getTitular());
		System.out.println("Saldo inicial = " + contaCliente.getMostrarSaldo());
		
		System.out.println("Digite o valor para depósito");
		valor = scan.nextDouble();		
		contaCliente.setDepositar(valor);
     
		System.out.println("Digite o valor para saque");
		valor = scan.nextDouble();
		contaCliente.setSacar(valor);
	}

}
