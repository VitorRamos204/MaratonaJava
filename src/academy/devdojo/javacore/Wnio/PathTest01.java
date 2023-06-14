package academy.devdojo.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("E:\\MaratonaJava\\file.txt");
        Path path2 = Paths.get("E:\\MaratonaJava", "file.txt");
        Path path3 = Paths.get("E:\\MaratonaJava\\file.txt");
        Path path4  = Paths.get("E:\\MaratonaJava\\file.txt");
        System.out.println(path1.getFileName());
    }
}
