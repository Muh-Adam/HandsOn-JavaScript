package handson02;

public final class Handson02Main {
    private Handson02Main() {
    }

    public static void main(String[] args) {
        for (AccountType type : AccountType.values()) {
            System.out.println("Nama: " + type.name()
                    + ", kode: " + type.getCode()
                    + ", suku bunga: "
                    + String.format("%.1f%%", type.getInterestRate() * 100));
        }
    }
}