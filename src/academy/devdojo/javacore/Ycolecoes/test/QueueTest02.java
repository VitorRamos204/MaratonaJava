package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(1L, "Vagabond Vol.1", 230, 4));
        mangas.add(new Manga(16L, "Vinland Saga Vol.1", 64.90, 100));
        mangas.add(new Manga(12L, "Berserk Deluxe Vol.1", 247.89, 2));
        mangas.add(new Manga(76L, "Blue Lock Vol.1", 28.80, 2));
        mangas.add(new Manga(25L, "Aragon", 28.80, 5));
        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll().getPreco());
        }
    }
}
