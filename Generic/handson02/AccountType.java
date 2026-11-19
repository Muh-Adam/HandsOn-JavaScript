package handson02;

public enum AccountType {
    SAVINGS("SA", 0.025),
    CREDIT("CR", 0.120);

    private final String code;
    private final double interestRate;

    AccountType(String code, double interestRate) {
        this.code = code;
        this.interestRate = interestRate;
    }

    public String getCode() {
        return code;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return name() + " - kode: " + code
                + ", suku bunga: " + String.format("%.1f%%", interestRate * 100);
    }
}