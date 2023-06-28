package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Vagabond Vol.1", 230, 0));
        mangas.add(new Manga(16L, "Vinland Saga Vol.1", 64.90, 100));
        mangas.add(new Manga(12L, "Berserk Deluxe Vol.1", 247.89, 2));
        mangas.add(new Manga(76L, "Blue Lock Vol.1", 28.80, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while(mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        System.out.println(mangas);
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
