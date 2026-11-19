package penilaian.mahasiswa.penyimpanan;

public final class ConsoleGradeRepository implements GradeRepository {
    @Override
    public void simpanDatabase(String nama, double nilai) {
        System.out.println("Menyimpan ke database: " + nama + " = " + nilai);
    }
}