package org.example;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chequeEspecialUsado;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
        this.chequeEspecialUsado = 0;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }

    public void consultarChequeEspecial() {
        System.out.printf("Limite de cheque especial: R$ %.2f\n", chequeEspecial);
        System.out.printf("Valor disponível: R$ %.2f\n", chequeEspecial - chequeEspecialUsado);
    }

    public void depositar(double valor) {
        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.20;
            double totalDivida = chequeEspecialUsado + taxa;

            if (valor >= totalDivida) {
                valor -= totalDivida;
                chequeEspecialUsado = 0;
                System.out.printf("R$ %.2f usado para quitar cheque especial com taxa. Saldo restante: R$ %.2f\n", totalDivida, valor);
            } else {
                chequeEspecialUsado -= valor / 1.2;
                valor = 0;
                System.out.println("Valor parcialmente usado para quitar cheque especial.");
            }
        }

        saldo += valor;
        System.out.printf("Depósito efetuado. Novo saldo: R$ %.2f\n", saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            double totalDisponivel = saldo + (chequeEspecial - chequeEspecialUsado);
            if (valor <= totalDisponivel) {
                double restante = valor - saldo;
                saldo = 0;
                chequeEspecialUsado += restante;
                System.out.println("Saque usando cheque especial.");
            } else {
                System.out.println("Saldo e cheque especial insuficientes.");
                return;
            }
        }
        System.out.printf("Saque efetuado. Novo saldo: R$ %.2f\n", saldo);
    }

    public void pagarBoleto(double valor) {
        sacar(valor);
    }

    public void verificarUsoChequeEspecial() {
        if (chequeEspecialUsado > 0) {
            System.out.printf("Você está usando R$ %.2f do cheque especial.\n", chequeEspecialUsado);
        } else {
            System.out.println("Você não está usando o cheque especial.");
        }
    }
}
