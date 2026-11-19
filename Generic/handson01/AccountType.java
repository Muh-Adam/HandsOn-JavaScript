package handson01;

public enum AccountType {
    SAVINGS("Akun Tabungan"),
    CREDIT("Akun Kredit"),
    DEPOSIT("Akun Deposito");

    private final String description;

    AccountType(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description + " (" + name() + ")";
    }
}