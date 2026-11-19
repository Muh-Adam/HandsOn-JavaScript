package penilaian.mahasiswa.penyimpanan;

public interface GradeRepository {
    void simpanDatabase(String nama, double nilai);
}