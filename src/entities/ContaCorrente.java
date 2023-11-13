package entities;

public class ContaCorrente extends ContaBancaria {

	    public ContaCorrente(int numConta, String nomeTitular) {
	        super(numConta, nomeTitular);
	    }

	    public void aplicarTaxaManutencao(double taxa) {
	        setSaldo(getSaldo() - taxa);
	    }
	}