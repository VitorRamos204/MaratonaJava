package academy.devdojo.javacore.ZZEstreams.test;

import academy.devdojo.javacore.ZZEstreams.domain.Category;
import academy.devdojo.javacore.ZZEstreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Classroom Elite", 8.99, Category.DRAMA),
            new LightNovel("Maou Gakuin", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 2.99, Category.FANTASY),
            new LightNovel("Monogatari", 5.99, Category.ROMANCE),
            new LightNovel("Oregairu", 3.99, Category.ROMANCE),
            new LightNovel("Oregairu", 3.99, Category.ROMANCE),
            new LightNovel("No Game no Life", 4.00, Category.FANTASY)));
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case FANTASY:
                    fantasy.add(lightNovel); break;
                case DRAMA:
                    drama.add(lightNovel); break;
                case ROMANCE:
                    romance.add(lightNovel); break;
            }
        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.ROMANCE, romance);
        categoryListMap.put(Category.FANTASY, fantasy);

        System.out.println(categoryListMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);

    }
}
