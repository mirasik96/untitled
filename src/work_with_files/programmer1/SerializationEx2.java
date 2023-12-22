package work_with_files.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Nissan tilda", "white");
        Employee employee = new Employee("Mariya", "Ivanova", "IT", 500, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employee1.bin"))) {
            outputStream.writeObject(employee);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
