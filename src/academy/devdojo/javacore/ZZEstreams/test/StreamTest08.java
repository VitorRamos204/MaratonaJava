package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99),
            new LightNovel("Maou Gakuin", 2.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Monogatari", 5.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("No Game no Life", 4.00)));

    public static void main(String[] args) {
        lightNovels.stream().map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        System.out.println("-=-=-=-=-=-=-=-=-=");

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();
        System.out.println(sum);
    }
}
