package handson09;

import java.io.Serializable;
import java.util.Objects;

public final class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = Objects.requireNonNull(name, "name tidak boleh null");
        if (age < 0) {
            throw new IllegalArgumentException("age tidak boleh negatif");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }
}