package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99),
            new LightNovel("Maou Gakuin", 2.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Monogatari", 5.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("No Game no Life", 4.00)));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().collect(Collectors.counting()));
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        double sum = lightNovels.stream().mapToDouble(LightNovel::getPrice).sum();
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        String collect1 = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(collect1);
    }
}
