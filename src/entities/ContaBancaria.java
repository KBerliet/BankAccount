package entities;

public class ContaBancaria {
	
	private int numConta;
	
	private String nomeTitular;
	
	private double saldo;

	//métodos
	
	public void depositar(double valor) {

		if (valor <=0)  {
			System.out.println("Valor inválido");
		}
		
		this.saldo += valor;
		System.out.println("Deposito realizado com sucesso!");
	}
	
	public void sacar(double valor) {
		if (valor <=0 || valor > saldo)  {
			System.out.println("Valor inválido");
		}
		else {
			this.saldo -= valor;
			System.out.println("\nSaque realizado com sucesso");
		}
		
	}
	
	public double exibirSaldo() {
		return saldo;
	}
	
}