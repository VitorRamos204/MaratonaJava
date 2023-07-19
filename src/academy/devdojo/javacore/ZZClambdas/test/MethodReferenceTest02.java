package academy.devdojo.javacore.ZZClambdas.test;

import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Oshi no Ko", 11), new Anime("Berserk", 43), new Anime("Dragon Ball Z", 293)));
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodeNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
