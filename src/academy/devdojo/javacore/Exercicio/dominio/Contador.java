package academy.devdojo.javacore.Exercicio.dominio;

public class Contador {
    private int contador;
    public int zerar() {
        return this.contador = 0;
    }
    public int incrementar(int incrementa) {
        return this.contador += incrementa;
    }
    public void retornaValorContador(){
        System.out.print("O valor está em: " + getContador());


    }

    public int getContador() {
        return contador;
    }

}
