package handson10;

import java.util.Objects;

public final class Transaksi {
    private final String nomor;
    private final double total;

    public Transaksi(String nomor, double total) {
        this.nomor = Objects.requireNonNull(nomor);
        if (!Double.isFinite(total) || total < 0) {
            throw new IllegalArgumentException("total transaksi harus bernilai positif");
        }
        this.total = total;
    }

    @Override
    public String toString() {
        return "Transaksi{" + nomor + ", total=" + total + "}";
    }
}