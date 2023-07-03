package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Vitor");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(1L, "Vagabond Vol.1", 230);
        Manga manga2 = new Manga(16L, "Vinland Saga Vol.1", 64.90);
        Manga manga3 = new Manga(12L, "Berserk Deluxe Vol.1", 247.89);
        Manga manga4 = new Manga(76L, "Blue Lock Vol.1", 28.80);
        List<Manga> mangaConsumidor1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2List = List.of(manga4, manga1, manga2);
        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, mangaConsumidor1List);
        consumidorManga.put(consumidor2, mangaConsumidor2List);
        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorManga.entrySet()) {
            System.out.println("O consumidor " + entry.getKey().getNome() + " comprou os mangas: " + entry.getValue());

        }


    }
}
