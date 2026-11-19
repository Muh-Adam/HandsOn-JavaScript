package handson04;

public final class Handson04Main {
    private Handson04Main() {
    }

    public static void main(String[] args) {
        Pair<Integer, String> scoreAndName = new Pair<>(95, "Alya");
        System.out.println(scoreAndName);
        scoreAndName.showTypes();
        System.out.println("Setelah swap: " + scoreAndName.swap());

        Pair<Double, Boolean> priceAndAvailable = new Pair<>(19.95, true);
        System.out.println(priceAndAvailable);
        priceAndAvailable.showTypes();
        System.out.println("Setelah swap: " + priceAndAvailable.swap());
    }
}