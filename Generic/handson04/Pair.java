package handson04;

import java.util.Objects;

public final class Pair<T1, T2> {
    private final T1 first;
    private final T2 second;

    public Pair(T1 first, T2 second) {
        this.first = first;
        this.second = second;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    public void showTypes() {
        String firstType = first == null ? "null" : first.getClass().getSimpleName();
        String secondType = second == null ? "null" : second.getClass().getSimpleName();
        System.out.println(firstType + " & " + secondType);
    }

    /** Returns a new pair with the generic types reversed. */
    public Pair<T2, T1> swap() {
        return new Pair<>(second, first);
    }

    @Override
    public String toString() {
        return "Pair{" + first + ", " + second + "}";
    }
}