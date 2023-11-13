package entities;

public class ContaBancaria {
    private int numConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(int numConta, String nomeTitular) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }
	
	  // Getters e Setters
	
    public int getNumConta() {
        return numConta;
    }

    public void setNumeroConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return nomeTitular;
    }

    public void setTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
