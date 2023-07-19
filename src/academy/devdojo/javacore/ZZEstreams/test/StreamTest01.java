package academy.devdojo.javacore.ZZEstreams.test;


import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 1. Ordene todos os light novel por titulo
// 2. Retrieve the first 3 light novels with price less than 4
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99),
            new LightNovel("Maou Gakuin", 2.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Monogatari", 5.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("No Game no Life", 4.00)));
    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> lightNovelsLessThan4 = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4.00) {
                lightNovelsLessThan4.add(lightNovel.getTitle());
            }
            if (lightNovelsLessThan4.size() >= 3) {
                break;
            }
        }
        System.out.println(lightNovels); // 1 task
        System.out.println(lightNovelsLessThan4); // 2 task
    }

}
