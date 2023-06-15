package academy.devdojo.javacore.Wnio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/vito");
        Path clazz = Paths.get("/home/vito/devdojo/OlaMundo.java");
        Path pathToClass = dir.relativize(clazz);
        System.out.println(pathToClass);

        Path absoluto1 = Paths.get("/home/vito");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/vito/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.291303");

        System.out.println(absoluto1.relativize(absoluto3));
        System.out.println(absoluto3.relativize(absoluto1));
        System.out.println(absoluto1.relativize(absoluto2));
        System.out.println(relativo1.relativize(relativo2));
        System.out.println(relativo2.relativize(relativo1));
    }
}
