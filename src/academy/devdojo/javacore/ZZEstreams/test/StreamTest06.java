package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99),
            new LightNovel("Maou Gakuin", 2.99),
            new LightNovel("Fullmetal Alchemist", 2.99),
            new LightNovel("Monogatari", 5.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("Oregairu", 3.99),
            new LightNovel("No Game no Life", 4.00)));
    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).findAny().ifPresent(System.out::println);
        lightNovels.stream().filter(ln -> ln.getPrice() > 3).sorted(Comparator.comparing(LightNovel::getPrice).reversed() ).findFirst().ifPresent(System.out::println);
    }
}
