package handson10;

import java.util.Objects;

public final class Pelanggan {
    private final String nama;
    private final String email;

    public Pelanggan(String nama, String email) {
        this.nama = Objects.requireNonNull(nama);
        this.email = Objects.requireNonNull(email);
    }

    @Override
    public String toString() {
        return "Pelanggan{" + nama + ", " + email + "}";
    }
}