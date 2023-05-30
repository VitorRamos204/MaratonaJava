package academy.devdojo.javacore.Exercicio.teste;

import academy.devdojo.javacore.Exercicio.dominio.Contador;

public class ContadorTest01 {
    public static void main(String[] args) {
        Contador cont = new Contador();
        System.out.println(cont.getContador());
        cont.incrementar(5);
        System.out.println(cont.getContador());
        cont.zerar();
        System.out.println(cont.getContador());
        cont.retornaValorContador();
        cont.incrementar(5);
        cont.retornaValorContador();

    }
}
