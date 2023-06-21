package academy.devdojo.javacore.Wnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta/novo_path.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastAcessTime = basicFileAttributes.lastAccessTime();
        FileTime lastModified = basicFileAttributes.lastModifiedTime();

        System.out.println("Creation time: " + creationTime);
        System.out.println("Last access time: " + lastAcessTime);
        System.out.println("Last modified time: " + lastModified);

        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModified, newCreationTime ,creationTime);


    }
}
