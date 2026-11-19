package handson08;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public final class WriteUserInputMain {
    private static final DateTimeFormatter TIMESTAMP_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private WriteUserInputMain() {
    }

    public static void main(String[] args) {
        Path outputPath = Path.of("user_input.txt");
        System.out.println("Masukkan teks per baris. Ketik exit untuk selesai.");

        try (Scanner scanner = new Scanner(System.in);
             BufferedWriter writer = Files.newBufferedWriter(
                     outputPath, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                if (text.equalsIgnoreCase("exit")) {
                    break;
                }

                String timestamp = LocalDateTime.now().format(TIMESTAMP_FORMAT);
                writer.write(timestamp + " | " + text);
                writer.newLine();
            }
            System.out.println("Data disimpan ke " + outputPath.toAbsolutePath());
        } catch (IOException exception) {
            System.err.println("Gagal menyimpan input: " + exception.getMessage());
        }
    }
}