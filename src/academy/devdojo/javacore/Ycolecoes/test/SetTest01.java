package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "Vagabond Vol.1", 230, 0));
        mangas.add(new Manga(16L, "Vinland Saga Vol.1", 64.90, 100));
        mangas.add(new Manga(12L, "Berserk Deluxe Vol.1", 247.89, 2));
        mangas.add(new Manga(76L, "Blue Lock Vol.1", 28.80, 0));
        mangas.add(new Manga(76L, "Blue Lock Vol.1", 28.80, 0));

        for (Manga manga: mangas) {
            System.out.println(manga);
        }

    }
}
