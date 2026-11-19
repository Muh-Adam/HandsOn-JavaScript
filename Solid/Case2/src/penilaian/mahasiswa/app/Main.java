package penilaian.mahasiswa.app;

import penilaian.mahasiswa.laporan.GradeReportPrinter;
import penilaian.mahasiswa.nilai.StudentGrader;
import penilaian.mahasiswa.penyimpanan.ConsoleGradeRepository;
import penilaian.mahasiswa.penyimpanan.GradeRepository;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        String nama = "Andi";

        StudentGrader studentGrader = new StudentGrader();
        double nilai = studentGrader.hitungNilaiAkhir(80, 85, 90);

        GradeReportPrinter reportPrinter = new GradeReportPrinter();
        reportPrinter.cetakLaporan(nama, nilai);

        GradeRepository gradeRepository = new ConsoleGradeRepository();
        gradeRepository.simpanDatabase(nama, nilai);
    }
}