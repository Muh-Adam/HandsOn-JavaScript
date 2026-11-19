package handson07;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

public final class ReportBackupMain {
    private ReportBackupMain() {
    }

    public static void main(String[] args) {
        Path report = Path.of("report.txt");
        Path backup = Path.of("backup", "report.txt");
        Path log = Path.of("log.txt");

        try {
            Files.write(report, java.util.List.of("Report Generated", "Status: OK"),
                    StandardCharsets.UTF_8);

            if (Files.exists(report)) {
                Files.createDirectories(backup.getParent());
                Files.copy(report, backup, StandardCopyOption.REPLACE_EXISTING);
                appendLog(log, "Backup berhasil dibuat: " + backup);
                System.out.println("Backup berhasil dibuat.");
            } else {
                appendLog(log, "Backup gagal: file sumber tidak ditemukan.");
                System.out.println("File laporan tidak ditemukan, backup dibatalkan.");
            }
        } catch (IOException exception) {
            System.err.println("Operasi laporan/backup gagal: " + exception.getMessage());
            try {
                appendLog(log, "Operasi gagal: " + exception.getMessage());
            } catch (IOException logException) {
                System.err.println("Log gagal ditulis: " + logException.getMessage());
            }
        }
    }

    private static void appendLog(Path log, String message) throws IOException {
        String line = LocalDateTime.now() + " - " + message + System.lineSeparator();
        Files.writeString(log, line, StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}