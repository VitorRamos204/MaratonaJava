package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Midoriya");

        for (Object o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Goku"));
        for (Object o : lista) {
            System.out.println(o);
        }
    }
    private static void add (List lista, Consumidor consumidor) {
        lista.add(consumidor);
    }
   }

