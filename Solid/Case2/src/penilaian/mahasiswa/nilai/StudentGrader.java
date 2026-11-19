package penilaian.mahasiswa.nilai;

public final class StudentGrader {
    public double hitungNilaiAkhir(double tugas, double uts, double uas) {
        validasiNilai(tugas, "tugas");
        validasiNilai(uts, "UTS");
        validasiNilai(uas, "UAS");

        return (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    private void validasiNilai(double nilai, String komponen) {
        if (!Double.isFinite(nilai) || nilai < 0 || nilai > 100) {
            throw new IllegalArgumentException(
                    "Nilai " + komponen + " harus berada pada rentang 0 sampai 100.");
        }
    }
}