package handson09;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class EmployeeSerializationService {
    public void serialize(List<Employee> employees, Path file) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(file))) {
            output.writeObject(new ArrayList<>(employees));
        }
    }

    public List<Employee> deserialize(Path file) throws IOException, ClassNotFoundException {
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(file))) {
            Object value = input.readObject();
            if (!(value instanceof List<?>)) {
                throw new InvalidObjectException("Isi file bukan daftar Employee.");
            }

            List<Employee> employees = new ArrayList<>();
            for (Object item : (List<?>) value) {
                if (!(item instanceof Employee)) {
                    throw new InvalidObjectException("Daftar berisi objek selain Employee.");
                }
                employees.add((Employee) item);
            }
            return employees;
        }
    }
}