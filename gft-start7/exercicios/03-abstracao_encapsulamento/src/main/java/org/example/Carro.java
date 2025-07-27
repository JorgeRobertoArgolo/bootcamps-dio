package org.example;

public class Carro {
    private boolean ligado;
    private int velocidade;
    private int marcha;

    public Carro() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
    }

    public void ligar() {
        if (!this.ligado) {
            this.ligado = true;
            System.out.println("Carro ligado.");
        } else {
            System.out.println("Carro já está ligado.");
        }
    }

    public void desligar() {
        if (this.ligado && this.marcha == 0 && this.velocidade == 0) {
            this.ligado = false;
            System.out.println("Carro desligado.");
        } else if (!this.ligado) {
            System.out.println("Carro já está desligado.");
        } else {
            System.out.println("Para desligar o carro, ele deve estar parado e em ponto morto.");
        }
    }

    public void acelerar() {
        if (!this.ligado) {
            System.out.println("Carro desligado. Ligue o carro primeiro.");
            return;
        }

        if (this.marcha == 0) {
            System.out.println("Não é possível acelerar em ponto morto.");
            return;
        }

        if (this.velocidade >= 120) {
            System.out.println("Velocidade máxima atingida.");
            return;
        }

        int novaVelocidade = this.velocidade + 1;

        if (!velocidadeCompativelComMarcha(novaVelocidade)) {
            System.out.println("Velocidade incompatível com a marcha atual.");
            return;
        }

        this.velocidade = novaVelocidade;
        System.out.println("Acelerando. Velocidade atual: " + this.velocidade + " km/h");
    }

    public void diminuirVelocidade() {
        if (!this.ligado) {
            System.out.println("Carro desligado. Ligue o carro primeiro.");
            return;
        }

        if (this.velocidade > 0) {
            this.velocidade--;
            System.out.println("Diminuindo velocidade. Velocidade atual: " + this.velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }

    public void virar(String direcao) {
        if (!this.ligado) {
            System.out.println("Carro desligado. Ligue o carro primeiro.");
            return;
        }

        if (this.velocidade >= 1 && this.velocidade <= 40) {
            System.out.println("Virando para a " + direcao);
        } else {
            System.out.println("Velocidade incompatível para virar. Deve estar entre 1 km/h e 40 km/h");
        }
    }

    public void verificarVelocidade() {
        System.out.println("Velocidade atual: " + this.velocidade + " km/h");
    }

    public void trocarMarcha(int novaMarcha) {
        if (!this.ligado) {
            System.out.println("Carro desligado.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida.");
            return;
        }

        if (Math.abs(novaMarcha - this.marcha) != 1) {
            System.out.println("Não é permitido pular marchas.");
            return;
        }

        if (!velocidadeCompativelComMarcha(this.velocidade, novaMarcha)) {
            System.out.println("Velocidade atual incompatível com a nova marcha.");
            return;
        }

        this.marcha = novaMarcha;
        System.out.println("Marcha alterada para: " + this.marcha);
    }

    private boolean velocidadeCompativelComMarcha(int velocidade) {
        return velocidadeCompativelComMarcha(velocidade, this.marcha);
    }

    private boolean velocidadeCompativelComMarcha(int velocidade, int marcha) {
        return switch (marcha) {
            case 0 -> velocidade == 0;
            case 1 -> velocidade >= 0 && velocidade <= 20;
            case 2 -> velocidade >= 20 && velocidade <= 40;
            case 3 -> velocidade >= 40 && velocidade <= 60;
            case 4 -> velocidade >= 60 && velocidade <= 80;
            case 5 -> velocidade >= 80 && velocidade <= 100;
            case 6 -> velocidade >= 100 && velocidade <= 120;
            default -> false;
        };
    }
}
