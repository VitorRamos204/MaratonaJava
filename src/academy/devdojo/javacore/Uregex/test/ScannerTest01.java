package academy.devdojo.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto01 = "Levi, Eren, Mikasa";
        String[] nomes = texto01.split(" ");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }
}
