package academy.devdojo.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 2;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado");
        }
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado");
        }


    }
}
