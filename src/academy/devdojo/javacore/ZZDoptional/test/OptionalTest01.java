package academy.devdojo.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.of("vitu");
        Optional<String> stringOptional2 = Optional.ofNullable(null);
        Optional<String> stringOptional3 = Optional.empty();
        System.out.println(stringOptional);
        System.out.println(stringOptional2);
        System.out.println(stringOptional3);
        System.out.println("-=-=-=-=-=-=");

        Optional<String> nameOptional = Optional.ofNullable(findName("Vitor"));
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        System.out.println(nameOptional);

    }
    private static String findName(String name){
        List<String> list = List.of("Vitor", "William", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1) {
            return list.get(i);
        }
        return null;
    }
}
