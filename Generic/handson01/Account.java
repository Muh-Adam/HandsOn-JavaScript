package handson01;

import java.util.Objects;

public final class Account {
    private final AccountType type;

    public Account(AccountType type) {
        this.type = Objects.requireNonNull(type, "type tidak boleh null");
    }

    public AccountType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}