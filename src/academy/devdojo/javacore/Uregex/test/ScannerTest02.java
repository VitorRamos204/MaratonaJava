package academy.devdojo.javacore.Uregex.test;


import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto01 = "Levi, Eren, Mikasa";
        Scanner scanner = new  Scanner(texto01);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
