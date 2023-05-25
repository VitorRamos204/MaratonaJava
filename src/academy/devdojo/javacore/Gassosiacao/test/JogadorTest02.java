package academy.devdojo.javacore.Gassosiacao.test;

import academy.devdojo.javacore.Gassosiacao.dominio.Jogador;
import academy.devdojo.javacore.Gassosiacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ney");
        Time time = new Time("Barcelona");

        jogador1.setTime(time);
        jogador1.imprime();
    }

}
