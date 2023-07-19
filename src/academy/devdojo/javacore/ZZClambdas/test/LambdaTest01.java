package academy.devdojo.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> names = List.of("Vitor", "Goku", "Zoro", "William");
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        forEach(names, s -> System.out.println(s));
        forEach(integers, integer -> System.out.print(integer + " "));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
