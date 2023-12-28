package work_with_files._6programmer2;

import work_with_files._6programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee employee;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employee1.bin"))) {
            employee = (Employee) inputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
