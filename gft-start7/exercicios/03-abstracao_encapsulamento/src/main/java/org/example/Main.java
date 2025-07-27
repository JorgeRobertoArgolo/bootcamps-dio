package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercicio1();
        //exercicio2();
        exercicio3();
    }

    public static void exercicio1 () {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do depósito inicial: R$ ");
        double depositoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);

        int option;
        do {
            System.out.println("========================================================================");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sacar Dinheiro");
            System.out.println("5 - Pagar Boleto");
            System.out.println("6 - Verificar se conta está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.print("Opção : ");
            option = sc.nextInt();
            System.out.println("========================================================================");
            switch (option) {
                case 1 -> conta.consultarSaldo();
                case 2 -> conta.consultarChequeEspecial();
                case 3 -> {
                    System.out.print("Valor para depósito: R$ ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                }
                case 4 -> {
                    System.out.print("Valor para saque: R$ ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);
                }
                case 5 -> {
                    System.out.print("Valor do boleto: R$ ");
                    double valor = sc.nextDouble();
                    conta.pagarBoleto(valor);
                }
                case 6 -> conta.verificarUsoChequeEspecial();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);
    }

    public static void exercicio2 () {
        Carro carro = new Carro();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("========================================================================");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir velocidade");
            System.out.println("5 - Virar para esquerda");
            System.out.println("6 - Virar para direita");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Trocar marcha");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            System.out.println("========================================================================");
            switch (option) {
                case 1 -> carro.ligar();
                case 2 -> carro.desligar();
                case 3 -> carro.acelerar();
                case 4 -> carro.diminuirVelocidade();
                case 5 -> carro.virar("esquerda");
                case 6 -> carro.virar("direita");
                case 7 -> carro.verificarVelocidade();
                case 8 -> {
                    System.out.print("Informe nova marcha (0 a 6): ");
                    int novaMarcha = sc.nextInt();
                    carro.trocarMarcha(novaMarcha);
                }
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);

        sc.close();
    }

    public static void exercicio3 () {
        Scanner sc = new Scanner(System.in);
        int option;

        MaquinaPetshop maquinaPetshop = new MaquinaPetshop();

        do {
            System.out.println("========================================================================");
            System.out.println("1 - Colocar pet na máquina");
            System.out.println("2 - Retirar pet da máquina");
            System.out.println("3 - Dar banho no pet");
            System.out.println("4 - Abastecer com água (+2L)");
            System.out.println("5 - Abastecer com shampoo (+2L)");
            System.out.println("6 - Verificar nível de água");
            System.out.println("7 - Verificar nível de shampoo");
            System.out.println("8 - Verificar se há pet na máquina");
            System.out.println("9 - Limpar máquina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            option = sc.nextInt();
            System.out.println("========================================================================");

            switch (option) {
                case 1 -> maquinaPetshop.colocarPet();
                case 2 -> maquinaPetshop.retirarPet();
                case 3 -> maquinaPetshop.darBanho();
                case 4 -> maquinaPetshop.abastecerAgua();
                case 5 -> maquinaPetshop.abastecerShampoo();
                case 6 -> maquinaPetshop.verificarAgua();
                case 7 -> maquinaPetshop.verificarShampoo();
                case 8 -> maquinaPetshop.verificarPetNaMaquina();
                case 9 -> maquinaPetshop.limparMaquina();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 0);

        sc.close();
    }
}