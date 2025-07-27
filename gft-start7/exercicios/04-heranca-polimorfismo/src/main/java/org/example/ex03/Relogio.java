package org.example.ex03;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) this.hora = hora;
    }
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) this.minuto = minuto;
    }
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) this.segundo = segundo;
    }

    public int getHora() { return hora; }
    public int getMinuto() { return minuto; }
    public int getSegundo() { return segundo; }

    public String formatarHora() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void sincronizarHorario(Relogio relogio);
}
