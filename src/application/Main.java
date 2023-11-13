package application;

import entities.ContaBancaria;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, "Kevinn CC");
        cc.depositar(1000);
        cc.aplicarTaxaManutencao(50);
        cc.exibirSaldo();

        ContaPoupanca cp = new ContaPoupanca(2, "João CP");
        cp.depositar(2000);
        cp.calcularJuros(0.05);
        cp.exibirSaldo();

        ContaBancaria[] contas = new ContaBancaria[1];
        contas[0] = new ContaCorrente(3, "Arthur CC");


        for (ContaBancaria conta : contas) {
            conta.depositar(500);
            conta.sacar(200);
            conta.exibirSaldo();
        }
    }
}