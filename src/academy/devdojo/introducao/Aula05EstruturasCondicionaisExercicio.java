package academy.devdojo.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        double salario = 68508;
        if (salario <= 34712) {
            System.out.println("A taxa sera de 9.70%");
        }
        else if (salario >= 34713 && salario < 68507) {
            System.out.println("A taxa sera de 37.35%");
        }
        else {
            System.out.println("A taxa sera de 49.50%");
        }
    }
}
