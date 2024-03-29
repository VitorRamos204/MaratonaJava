package academy.devdojo.javacore.ZZDoptional.repository;

import academy.devdojo.javacore.ZZDoptional.domain.Manga;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "Berserk", 389), new Manga(2, "Fate/Zero", 150));

    public static Optional<Manga> findByTitle(String title) {
         return findBy(m -> m.getTitle().equals(title));
    }


    public static Optional<Manga> findById(Integer id) {
        return findBy(m -> m.getId().equals(id));
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;
        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }
        }
        return Optional.ofNullable(found);
    }
}
