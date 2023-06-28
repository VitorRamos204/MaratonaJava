package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphooneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}
public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphooneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(1L, "Vagabond Vol.1", 230, 0));
        mangas.add(new Manga(16L, "Vinland Saga Vol.1", 64.90, 100));
        mangas.add(new Manga(12L, "Berserk Deluxe Vol.1", 247.89, 2));
        mangas.add(new Manga(76L, "Blue Lock Vol.1", 28.80, 0));
        mangas.add(new Manga(25L, "Aragon", 28.80, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
