package Task_3;

public class Hunter<T> {
    private T[] array;

    public Hunter(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }
}
