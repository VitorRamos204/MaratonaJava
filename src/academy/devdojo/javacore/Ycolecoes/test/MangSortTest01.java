package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
       mangas.add(new Manga(1L, "Vagabond Vol.1", 230));
       mangas.add(new Manga(16L, "Vinland Saga Vol.1", 64.90));
       mangas.add(new Manga(12L, "Berserk Deluxe Vol.1", 247.89));
       mangas.add(new Manga(76L, "Blue Lock Vol.1", 28.80));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("-=-=-=-=-=-=-=-=-=-=- =-=");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
