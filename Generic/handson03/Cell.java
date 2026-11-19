package handson03;

public final class Cell<T> {
    private T data;

    public void setValue(T data) {
        this.data = data;
    }

    public T getValue() {
        return data;
    }

    public void displayType() {
        String typeName = data == null ? "belum diisi" : data.getClass().getSimpleName();
        System.out.println("Tipe data: " + typeName);
    }
}