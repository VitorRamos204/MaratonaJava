package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Vagabond");
        mangas.add("Berserk");
        mangas.add("Vinland Saga");
        mangas.add("Blue Lock");
        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>(6);
        dinheiros.add(100.21);
        dinheiros.add(26.67);
        dinheiros.add(21.21);
        dinheiros.add(89.21);
        Collections.sort(dinheiros);
        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-=-=-=-=-=-=-=-=-");
        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }
    }
}
