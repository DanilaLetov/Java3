package Task_1;

import java.util.ArrayList;

public class Converter {
    public <T> ArrayList<T> convertToList(T[] array) {
        ArrayList<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
