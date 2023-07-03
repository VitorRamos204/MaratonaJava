package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Vitor");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");
        Manga manga1 = new Manga(1L, "Vagabond Vol.1", 230);
        Manga manga2 = new Manga(16L, "Vinland Saga Vol.1", 64.90);
        Manga manga3 = new Manga(12L, "Berserk Deluxe Vol.1", 247.89);
        Manga manga4 = new Manga(76L, "Blue Lock Vol.1", 28.80);
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);
        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println("Consumidor: " + entry.getKey().getNome() + " comprou o manga: " + entry.getValue().getNome());
        }


    }
}
