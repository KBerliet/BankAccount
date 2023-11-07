package application;

import entities.ContaBancaria;

public class Main {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.depositar(100.00);
		
		System.out.printf("\nSaldo da conta: " + conta.exibirSaldo());
		
		conta.sacar(50.00);
		
		System.out.println("\nSaldo da conta: " + conta.exibirSaldo());

	}
}