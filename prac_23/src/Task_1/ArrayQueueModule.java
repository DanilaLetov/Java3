package Task_1;

public class ArrayQueueModule {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    // Предусловие: элемент, который нужно добавить, не равен null.
    // Постусловие: элемент добавлен в конец очереди.
    public static void enqueue(Object element) {
        assert element != null;

        ensureCapacity(size + 1);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Предусловие: очередь не пустая.
    // Постусловие: ничего не меняется.
    public static Object element() {
        assert size > 0;

        return elements[head];
    }

    // Предусловие: очередь не пустая.
    // Постусловие: первый элемент удален из очереди и возвращен.
    public static Object dequeue() {
        assert size > 0;

        Object element = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    // Предусловие: ничего не требуется.
    // Постусловие: возвращается текущий размер очереди.
    public static int size() {
        return size;
    }

    // Предусловие: ничего не требуется.
    // Постусловие: возвращается true, если очередь пустая, и false в противном случае.
    public static boolean isEmpty() {
        return size == 0;
    }

    // Предусловие: ничего не требуется.
    // Постусловие: все элементы очереди удалены.
    public static void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    private static void ensureCapacity(int capacity) {
        if (capacity > elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}

