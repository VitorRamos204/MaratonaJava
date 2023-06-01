package academy.devdojo.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "William"; // String constant pool
        String nome2 = "William";
        nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 Variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3); // Vai retornar falso por que nome2 e nome3 estão em diferentes lugares no Heap
        System.out.println(nome2 == nome3.intern()); // Porem quando fazemos dessa forma, vai retornar true, por que quando usados o metodos intern estamos pegando o valor canonico da string que neste caso é William

    }
}
