package org.example.ex01;

public class IngressoFamilia extends Ingresso {
    private int qtdPessoas;

    public IngressoFamilia(double valor, String nome, TipoFilme tipo, int qtdPessoas) {
        super(valor, nome, tipo);
        this.qtdPessoas = qtdPessoas;
    }

    @Override
    public double getValorReal() {
        double total = valor * qtdPessoas;
        if (qtdPessoas > 3) {
            total *= 0.95;
        }
        return total;
    }
}
