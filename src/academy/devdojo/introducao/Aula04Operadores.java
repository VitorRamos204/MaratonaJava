package academy.devdojo.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int soma = numero01 * numero02;
        System.out.println(soma);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // Operadores relacionais < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);

        // Operadores lógicos AND (&&) OR || NOT !

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMenorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Compravel? " + isPlaystationCincoCompravel);

        // Operadores atribuicao =, += -=, *= /= %=

        double bonus = 1800D;
        bonus += 1000;
    }

}
