package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeto(new Barco("Canoa"));
    }
    private static <T> void criarArrayComUmObjeto (T t){
        List<T> list = List.of(t);
        System.out.println(list);

    }
}


