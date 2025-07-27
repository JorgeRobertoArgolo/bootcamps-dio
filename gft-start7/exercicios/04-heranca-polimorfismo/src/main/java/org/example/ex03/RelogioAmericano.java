package org.example.ex03;

public class RelogioAmericano extends Relogio {
    @Override
    public void sincronizarHorario(Relogio relogio) {
        int h = relogio.getHora();
        if (h > 12) h -= 12;
        this.hora = h;
        this.minuto = relogio.getMinuto();
        this.segundo = relogio.getSegundo();
    }
    @Override
    public String formatarHora() {
        String periodo = hora < 12 ? "AM" : "PM";
        if (periodo.equals("PM")) {
            sincronizarHorario(this);
        }
        return String.format("%02d:%02d:%02d %s", hora, minuto, segundo, periodo);
    }
}
