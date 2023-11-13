package entities;

public class ContaPoupanca extends ContaBancaria{
	
	public ContaPoupanca(int numConta, String nomeTitular) {
        super(numConta, nomeTitular);
    }

    public void calcularJuros(double taxa) {
        setSaldo(getSaldo() * (1 - taxa));
    }
}
