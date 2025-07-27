package org.example.ex02;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;

    public abstract void login();
    public abstract void logoff();
    public void alterarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
    }
}
