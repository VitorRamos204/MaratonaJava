package academy.devdojo.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioDoProjeto = "home/vito/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path = Paths.get(diretorioDoProjeto, arquivoTxt);
        System.out.println(path);
        System.out.println(path.normalize());
    }
}
