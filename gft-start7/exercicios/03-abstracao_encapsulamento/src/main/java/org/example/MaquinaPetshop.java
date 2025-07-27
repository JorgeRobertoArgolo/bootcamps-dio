package org.example;

public class MaquinaPetshop {
    private int nivelAgua = 0;
    private int nivelShampoo = 0;
    private boolean petNaMaquina = false;
    private boolean petEstaLimpo = false;
    private boolean precisaLimpeza = false;

    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    public void colocarPet() {
        if (this.petNaMaquina) {
            System.out.println("Já existe um pet na máquina.");
        } else if (this.precisaLimpeza) {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet.");
        } else {
            this.petNaMaquina = true;
            this.petEstaLimpo = false;
            System.out.println("Pet colocado na máquina.");
        }
    }

    public void retirarPet() {
        if (!this.petNaMaquina) {
            System.out.println("Não há pet na máquina.");
        } else {
            if (!this.petEstaLimpo) {
                this.precisaLimpeza = true;
                System.out.println("Pet retirado da máquina sujo. Será necessário limpar a máquina.");
            } else {
                System.out.println("Pet limpo retirado da máquina com sucesso.");
            }
            this.petNaMaquina = false;
            this.petEstaLimpo = false;
        }
    }

    public void darBanho() {
        if (!this.petNaMaquina) {
            System.out.println("Não há pet na máquina para tomar banho.");
        } else if (this.nivelAgua < 10 || this.nivelShampoo < 2) {
            System.out.println("Nível insuficiente de água ou shampoo para o banho.");
        } else {
            this.nivelAgua -= 10;
            this.nivelShampoo -= 2;
            this.petEstaLimpo = true;
            this.precisaLimpeza = false;
            System.out.println("Pet tomou banho e está limpo!");
        }
    }

    public void abastecerAgua() {
        if (this.nivelAgua + 2 <= MAX_AGUA) {
            this.nivelAgua += 2;
            System.out.println("2 litros de água adicionados. Nível atual: " + this.nivelAgua + " litros.");
        } else {
            System.out.println("Não é possível adicionar mais água. Capacidade máxima atingida.");
        }
    }

    public void abastecerShampoo() {
        if (this.nivelShampoo + 2 <= MAX_SHAMPOO) {
            this.nivelShampoo += 2;
            System.out.println("2 litros de shampoo adicionados. Nível atual: " + this.nivelShampoo + " litros.");
        } else {
            System.out.println("Não é possível adicionar mais shampoo. Capacidade máxima atingida.");
        }
    }

    public void verificarAgua() {
        System.out.println("Nível de água: " + this.nivelAgua + " litros.");
    }

    public void verificarShampoo() {
        System.out.println("Nível de shampoo: " + this.nivelShampoo + " litros.");
    }

    public void verificarPetNaMaquina() {
        if (this.petNaMaquina) {
            System.out.println("Existe um pet na máquina.");
        } else {
            System.out.println("Não há pet na máquina.");
        }
    }

    public void limparMaquina() {
        if (!this.precisaLimpeza) {
            System.out.println("A máquina não precisa ser limpa.");
            return;
        }

        if (this.nivelAgua >= 3 && this.nivelShampoo >= 1) {
            this.nivelAgua -= 3;
            this.nivelShampoo -= 1;
            this.precisaLimpeza = false;
            System.out.println("Máquina limpa com sucesso!");
        } else {
            System.out.println("Nível insuficiente de água ou shampoo para limpeza.");
        }
    }
}
