package Day57_Exceptions2;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNotFoundDemo {
    public static void main(String[] args) throws IOException {
        System.out.println("Before Try Catch ");
        Files.readAllLines(Paths.get("file.txt"));

    }
}
