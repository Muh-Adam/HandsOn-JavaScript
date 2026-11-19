package handson05;

import java.util.Objects;

public final class CompareUtil {
    private CompareUtil() {
    }

    public static <T extends Comparable<? super T>> boolean isEqual(T first, T second) {
        Objects.requireNonNull(first, "first tidak boleh null");
        Objects.requireNonNull(second, "second tidak boleh null");
        return first.compareTo(second) == 0;
    }
}