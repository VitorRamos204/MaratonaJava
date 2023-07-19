package academy.devdojo.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> grapichDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy");
        List<String> developers = List.of("William", "David", "Harrisson");
        List<String> students = List.of("Vitor", "Edipo", "Gustavo", "Guilherme");
        devdojo.add(grapichDesigners);
        devdojo.add(developers);
        devdojo.add(students);
        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }

        }
        System.out.println("=-=-=-=-=-=-=-=-=-");
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
