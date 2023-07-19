package academy.devdojo.javacore.ZZDoptional.test;

import academy.devdojo.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.javacore.ZZDoptional.repository.MangaRepository;

import java.lang.management.MemoryNotificationInfo;

public class OptionalTest02 {
    public static void main(String[] args) {
        MangaRepository.findByTitle("Berserk").ifPresent(m -> m.setTitle("Berserk Golden Age Arc"));
        Manga manga = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        Manga createNewMangaINotExists = MangaRepository.findByTitle("Fate Apocrypha").orElseGet(() -> new Manga(3, "Fate Apocrypha", 20));
        System.out.println(manga);
        System.out.println(createNewMangaINotExists);

    }
}
