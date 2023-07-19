package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99),
            new LightNovel("Maou Gakuin", 2.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Monogatari", 5.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("No Game no Life", 4.00)));
    public static void main(String[] args) {
        List<String> collect = lightNovels.stream().sorted(Comparator.comparing(LightNovel::getTitle)).
                filter(ln -> ln.getPrice() <= 4).
                limit(3).
                map(LightNovel::getTitle).collect(Collectors.toList());
        System.out.println(collect);
    }
}
