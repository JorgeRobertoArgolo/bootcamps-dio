package org.example;

import org.example.ex03.Relogio;
import org.example.ex03.RelogioAmericano;
import org.example.ex03.RelogioBrasileiro;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new RelogioBrasileiro();
        relogio.setHora(19);
        relogio.setMinuto(50);
        relogio.setSegundo(30);

        relogio.sincronizarHorario(relogio);
        System.out.println(relogio.formatarHora());

        Relogio relogio2 = new RelogioAmericano();
        relogio2.setHora(13);
        relogio2.setMinuto(50);
        relogio2.setSegundo(30);

        System.out.println(relogio2.formatarHora());
    }
}