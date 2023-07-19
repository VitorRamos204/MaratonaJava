package academy.devdojo.javacore.ZZClambdas.test;


import academy.devdojo.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.javacore.ZZClambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

// Reference to a constructor
public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparator = () -> new AnimeComparators();
        AnimeComparators animeComparators = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Oshi no Ko", 11), new Anime("Berserk", 43), new Anime("Dragon Ball Z", 293)));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
    }
}
