package handson01;

public final class Handson01Main {
    private Handson01Main() {
    }

    public static void main(String[] args) {
        Account account = new Account(AccountType.DEPOSIT);
        System.out.println("Tipe akun: " + account);

        System.out.println("Semua tipe akun:");
        for (AccountType type : AccountType.values()) {
            System.out.println(type);
        }
    }
}