package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // Metacaracteres basicos
        // \d = Todos os digitos
        // \D = Tudo que não for dígito
        // \s = Espaços em brancos \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = tudo de a-ZA-Z, digitos, _
        // \W = Tudo que não for incluso no \w
        // [] = Range
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de N ate M
        // ()
        // |
        // $
        // . 1.3 = 123, 133, 1@3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, @#!jotaro@gmail.com, #@!#$, 4902@tanjiro@mail.br, test@gmail.com.br, sakura@mail";
        System.out.println("!@#$jotaro@gmail.com".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice:  0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
