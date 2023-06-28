package academy.devdojo.javacore.Ycolecoes.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone("0012", "Apple");
        Smartphone smartphone2 = new Smartphone("0012", "Apple");
        System.out.println(smartphone1.equals(smartphone2));
    }
}
