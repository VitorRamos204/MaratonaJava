package academy.devdojo.javacore.Gassosiacao.test;

import academy.devdojo.javacore.Gassosiacao.dominio.Jogador;
import academy.devdojo.javacore.Gassosiacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Zico");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};
        jogador.setTime(time);
        jogador.setTime(time);

        time.setJogadores(jogadores);


        System.out.println("-=-=-=-=-= Jogador -=-=-=-=-= ");
        jogador.imprime();
        jogador2.imprime();
        System.out.println("-=-=-=-=-= Time -=-=-=-=-= ");
        time.imprime();
    }
}
