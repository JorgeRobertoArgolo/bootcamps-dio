package org.example.ex02;

public class Atendente extends Usuario {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
        this.valorCaixa = 0;
    }

    @Override
    public void login() {
        System.out.println("Atendente logado.");
    }
    @Override
    public void logoff() {
        System.out.println("Atendente saiu.");
    }
    public void receberPagamento(double valor) {
        valorCaixa += valor;
        System.out.println("Pagamento recebido: R$" + valor);
    }
    public void fecharCaixa() {
        System.out.println("Caixa fechado. Valor em caixa: R$" + valorCaixa);
    }
}
