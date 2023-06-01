package academy.devdojo.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "         Luffy            ";
        String numeros = "012345";
        System.out.println(nome.charAt(0)); // Vai pegar o char dependendo da posição que inserir
        System.out.println(nome.length()); // Retorna o tamanho da String
        System.out.println(nome.replace("f", "l")); // Vai percorrer toda a string e vai fazer a troca de F para L
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, 2)); // O final do metodo substring sempre vai ser -1
        System.out.println(nome.trim());
    }
}
