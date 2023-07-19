package academy.devdojo.javacore.Zgenerics.test;

import academy.devdojo.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
    }
    private static <T extends  Comparable> List<T> criarArrayComUmObjeto (T t){
        return List.of(t);

    }
}


