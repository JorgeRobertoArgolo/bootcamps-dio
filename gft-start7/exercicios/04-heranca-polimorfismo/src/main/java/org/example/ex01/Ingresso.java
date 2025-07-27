package org.example.ex01;

public abstract class Ingresso {
    protected double valor;
    protected String nome;
    protected TipoFilme tipo;

    public Ingresso(double valor, String nome, TipoFilme tipo) {
        this.valor = valor;
        this.nome = nome;
        this.tipo = tipo;
    }

    public abstract double getValorReal();
}
