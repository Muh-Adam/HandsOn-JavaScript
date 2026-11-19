package handson10;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public final class ProdukWriterNew {
    private ProdukWriterNew() {
    }

    public static void main(String[] args) {
        List<Produk<?, ?>> records = new ArrayList<>();
        records.add(new Produk<>("Laptop", 15000000.0, 5));
        records.add(new Produk<>("Mouse", 150000, 20));
        records.add(new Produk<>(
                new Pelanggan("Alya", "alya@example.com"),
                new Transaksi("TRX-001", 350000.0), null));

        Path filePath = Path.of("produk_output.txt");
        try {
            List<String> lines = new ArrayList<>();
            for (Produk<?, ?> record : records) {
                lines.add(record.toString());
            }

            Files.write(filePath, lines, StandardCharsets.UTF_8);
            System.out.println("Data berhasil disimpan menggunakan NIO.2.");

            List<String> savedLines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
            System.out.println("Isi file:");
            savedLines.forEach(System.out::println);
        } catch (IOException exception) {
            System.err.println("Gagal menyimpan atau membaca file: " + exception.getMessage());
        }
    }
}