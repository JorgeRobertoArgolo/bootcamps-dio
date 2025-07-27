package org.example.ex01;

public class MeiaEntrada extends Ingresso{
    public MeiaEntrada(double valor, String nomeFilme, TipoFilme tipo) {
        super(valor, nomeFilme, tipo);
    }

    @Override
    public double getValorReal() {
        return this.valor / 2;
    }
}
