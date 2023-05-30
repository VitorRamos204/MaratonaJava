package academy.devdojo.javacore.Oexception.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 2));
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nenhum numero pode ser dividido por 0");
        }
        return a / b;
    }
}
