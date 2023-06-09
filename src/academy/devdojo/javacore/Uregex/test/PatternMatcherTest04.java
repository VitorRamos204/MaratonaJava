package academy.devdojo.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
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
        String regex = "([0-255]{0,2})\\.+([0-255]{0,2})\\.+([0-255]{0,2})$";
        String texto = "000.12.12.034 121.234.12.12 23.45.12.56 00.12.123.123123.123 122.23 Hello.IP";
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
