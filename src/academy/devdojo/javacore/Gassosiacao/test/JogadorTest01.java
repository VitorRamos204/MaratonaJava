package academy.devdojo.javacore.Gassosiacao.test;

import academy.devdojo.javacore.Gassosiacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Neymar");
        Jogador j2 = new Jogador("Cristiano Ronaldo");
        Jogador j3 = new Jogador("Messi");
        Jogador[] jogadores = {j1, j2, j3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();

        }

    }
}
