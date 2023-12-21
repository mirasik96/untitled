package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
    public static void main(String[] args) throws IOException {
        String rubai = "Madiyar 25 jas";
        String s = "privet";
        FileWriter writer = null;
        try {
            writer = new FileWriter("test2.txt", true);
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally{
            writer.close();
        }

        // try with resources
        try (FileWriter writerTryWithResources = new FileWriter("test2.txt", true)) {
            for (int i = 0; i < rubai.length(); i++) {
                writerTryWithResources.write(rubai.charAt(i));
            }
            writerTryWithResources.write(s);
            System.out.println("Done");
        }
    }
}
