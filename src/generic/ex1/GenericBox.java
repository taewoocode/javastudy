package generic.ex1;

public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    //T 타입 value반환
    public T get() {
        return value;
    }


}
