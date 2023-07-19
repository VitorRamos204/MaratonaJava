package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;
import academy.devdojo.javacore.ZZEstreams.domain.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99, Category.DRAMA),
            new LightNovel("Maou Gakuin", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 2.99, Category.FANTASY),
            new LightNovel("Monogatari", 5.99, Category.ROMANCE),
            new LightNovel("Oregairu", 3.99, Category.ROMANCE),
            new LightNovel("Oregairu", 3.99, Category.ROMANCE),
            new LightNovel("No Game no Life", 4.00, Category.FANTASY)));
    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);
    }
}
