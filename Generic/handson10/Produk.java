package handson10;

import java.util.Objects;

public final class Produk<T, U> {
    private final T dataUtama;
    private final U dataTambahan;
    private final Integer stok;

    public Produk(T dataUtama, U dataTambahan, Integer stok) {
        this.dataUtama = Objects.requireNonNull(dataUtama, "dataUtama tidak boleh null");
        this.dataTambahan = Objects.requireNonNull(dataTambahan, "dataTambahan tidak boleh null");
        if (stok != null && stok < 0) {
            throw new IllegalArgumentException("stok tidak boleh negatif");
        }
        this.stok = stok;
    }

    public T getDataUtama() {
        return dataUtama;
    }

    public U getDataTambahan() {
        return dataTambahan;
    }

    public Integer getStok() {
        return stok;
    }

    @Override
    public String toString() {
        return dataUtama + "," + dataTambahan + "," + (stok == null ? "N/A" : stok);
    }
}