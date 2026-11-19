package handson06;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public final class EmployeesMain {
    private EmployeesMain() {
    }

    public static void main(String[] args) {
        Path inputPath = Path.of("employees.txt");
        Path copyPath = Path.of("copy_employees.txt");

        if (Files.notExists(inputPath)) {
            System.out.println("File tidak ditemukan: " + inputPath.toAbsolutePath());
            return;
        }

        try {
            ArrayList<String> employees = new ArrayList<>(
                    Files.readAllLines(inputPath, StandardCharsets.UTF_8));
            employees.forEach(System.out::println);
            Files.write(copyPath, employees, StandardCharsets.UTF_8);
            System.out.println("Salinan disimpan ke " + copyPath.toAbsolutePath());
        } catch (IOException exception) {
            System.err.println("Gagal membaca atau menyalin file: " + exception.getMessage());
        }
    }
}