package work_with_files;

import java.io.*;

public class CopyEx2_FileInputStream_FileOutputStream {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("/home/mirasa2907/Downloads/horses-3.jpg");
             FileOutputStream outputStream = new FileOutputStream("horses-3.jpg");)
        {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
