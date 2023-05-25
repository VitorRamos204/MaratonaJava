package academy.devdojo.javacore.Dconstrutores.test;

import academy.devdojo.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Blue Lock", "TV", 22, "Esporte", "B8");
        anime.imprime();
    }

}
