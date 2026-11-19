package handson05;

public final class Handson05Main {
    private Handson05Main() {
    }

    public static void main(String[] args) {
        System.out.println("Integer: " + CompareUtil.isEqual(5, 5));
        System.out.println("String: " + CompareUtil.isEqual("Hello", "World"));
        System.out.println("Double: " + CompareUtil.isEqual(3.14, 3.14));
        System.out.println("Character: " + CompareUtil.isEqual('A', 'A'));
    }
}