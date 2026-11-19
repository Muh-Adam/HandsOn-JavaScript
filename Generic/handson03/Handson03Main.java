package handson03;

public final class Handson03Main {
    private Handson03Main() {
    }

    public static void main(String[] args) {
        Cell<Integer> integerCell = new Cell<>();
        integerCell.setValue(25);
        System.out.println("Nilai integer: " + integerCell.getValue());
        integerCell.displayType();

        Cell<String> stringCell = new Cell<>();
        stringCell.setValue("Belajar Java Generic");
        System.out.println("Nilai string: " + stringCell.getValue());
        stringCell.displayType();
    }
}