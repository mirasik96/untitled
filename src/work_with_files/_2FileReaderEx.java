package work_with_files;

import java.io.FileReader;
import java.io.IOException;

public class _2FileReaderEx {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("test2.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println();
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
        }

        // try with resources
        try (FileReader readerTryWithResources = new FileReader("test2.txt")) {
            int character;
            while ((character = readerTryWithResources.read()) != -1) {
                System.out.println((char) character);
            }
            System.out.println();
            System.out.println("Done");
        }
    }
}
