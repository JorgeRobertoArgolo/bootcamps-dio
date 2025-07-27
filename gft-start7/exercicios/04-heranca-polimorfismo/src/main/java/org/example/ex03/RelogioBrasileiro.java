package org.example.ex03;

public class RelogioBrasileiro extends Relogio {
    @Override
    public void sincronizarHorario(Relogio relogio) {
        this.hora = relogio.getHora();
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();
    }
}
