package academy.devdojo.javacore.Eblocosdeinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
    {
        System.out.println("Dentro do bloco");
    }
    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for(int episodio: episodios) {
            System.out.println(episodio + " ");
        }
    }
}
