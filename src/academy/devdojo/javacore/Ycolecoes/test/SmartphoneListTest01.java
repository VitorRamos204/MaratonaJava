package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("0012", "LG");
        Smartphone smartphone2 = new Smartphone("2654", "Apple");
        Smartphone smartphone3 = new Smartphone("2768", "Samsung");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(smartphone1);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);
        for(Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone smartphone4 = new Smartphone("2654", "Apple");
        System.out.println(smartphones.contains(smartphone4));
        int indexOfSmartphone = smartphones.indexOf(smartphone4);
        System.out.println(indexOfSmartphone);
    }
}
