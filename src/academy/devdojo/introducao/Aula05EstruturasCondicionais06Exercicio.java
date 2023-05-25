package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais06Exercicio {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7 imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 0;
        switch (dia) {
            case 1:
                System.out.println("Final de semana (Domingo)");
                break;
            case 2:
                System.out.println("Segunda-feira (dia util)");
                break;
            case 3:
                System.out.println("Terça-feira (dia util)");
                break;
            case 4:
                System.out.println("Quarta-feira (dia util)");
                break;
            case 5:
                System.out.println("Quinta-feira (dia util)");
                break;
            case 6:
                System.out.println("Sexta-feira (dia util)");
                break;
            case 7:
                System.out.println("Final de semana (Sábado)");
                break;
            default:
                System.out.println("Digite apenas digítos de 1 a 7");
                break;
        }

    }
}
