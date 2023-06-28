package academy.devdojo.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16);
        List<String> nomes2 = new ArrayList(16);
        nomes.add("Vitor");
        nomes.add("DevDojo Academy");
        nomes2.add("Senna");
        nomes2.add("Jiraya");
//        nomes.remove("Vitor");
        nomes.addAll(nomes2);
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }
        System.out.println();
        int size = nomes.size();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 0; i < size; i++) {
            System.out.print(nomes.get(i) + " ");
        }
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
