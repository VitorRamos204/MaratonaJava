package academy.devdojo.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(List.of("Vitor", "William", "Guts", "Thorfinn"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
    }
}
