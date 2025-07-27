package org.example.ex02;

public class Vendedor extends Usuario {
    private int qtdVendas;

    public Vendedor(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = false;
        this.qtdVendas = 0;
    }

    @Override
    public void login() {
        System.out.println("Vendedor logado.");
    }
    @Override
    public void logoff() {
        System.out.println("Vendedor saiu.");
    }
    public void realizarVenda() {
        qtdVendas++;
        System.out.println("Venda realizada...");
    }
    public void consultarVendas() {
        System.out.println("Vendas realizadas: " + qtdVendas);
    }
}
