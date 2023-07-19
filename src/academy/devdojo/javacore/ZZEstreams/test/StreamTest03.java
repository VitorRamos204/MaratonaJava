package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99),
            new LightNovel("Maou Gakuin", 2.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Monogatari", 5.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("No Game no Life", 4.00)));
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream.filter(lightNovel -> lightNovel.getPrice() <= 4).count();
        long distinct = lightNovels.stream().distinct().filter(lightNovel -> lightNovel.getPrice() <= 4).count();
        System.out.println(count);
        System.out.println(distinct);

    }
}
