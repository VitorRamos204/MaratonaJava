package academy.devdojo.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        boolean exists = file.exists();
        if (exists){
            System.out.println(file.delete());
        }
    }
}
