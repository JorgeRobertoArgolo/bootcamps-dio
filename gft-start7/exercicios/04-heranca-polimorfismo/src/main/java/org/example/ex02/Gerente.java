package org.example.ex02;

public class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = true;
    }

    @Override
    public void login() {
        System.out.println("Gerente logado.");
    }
    @Override
    public void logoff() {
        System.out.println("Gerente saiu.");
    }
    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatorio financeiro...");
    }
    public void consultarVendas() {
        System.out.println("Consultando vendas...");
    }
}
