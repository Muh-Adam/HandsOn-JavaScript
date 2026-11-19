package handson09;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public final class Handson09Main {
    private Handson09Main() {
    }

    public static void main(String[] args) {
        Path file = Path.of("employees.ser");
        EmployeeSerializationService service = new EmployeeSerializationService();
        List<Employee> employees = List.of(
                new Employee("John", 30),
                new Employee("Siti", 25),
                new Employee("Budi", 41));

        try {
            service.serialize(employees, file);
            System.out.println("Data berhasil diserialisasi.");
            for (Employee employee : service.deserialize(file)) {
                System.out.println("Deserialized: " + employee);
            }
        } catch (IOException | ClassNotFoundException exception) {
            System.err.println("Proses serialisasi gagal: " + exception.getMessage());
        }
    }
}