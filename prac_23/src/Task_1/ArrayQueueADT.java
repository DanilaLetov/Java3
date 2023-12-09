package Task_1;

public class ArrayQueueADT {
    private Object[] elements = new Object[10];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    // Предусловие: элемент, который нужно добавить, не равен null.
    // Постусловие: элемент добавлен в конец очереди.
    public static void enqueue(ArrayQueueADT queue, Object element) {
        assert element != null;

        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail +
                1) % queue.elements.length;
        queue.size++;
    }

    // Предусловие: очередь не пустая.
    // Постусловие: ничего не меняется.
    public static Object element(ArrayQueueADT queue) {
        assert queue.size > 0;

        return queue.elements[queue.head];
    }

    // Предусловие: очередь не пустая.
    // Постусловие: первый элемент удален из очереди и возвращен.
    public static Object dequeue(ArrayQueueADT queue) {
        assert queue.size > 0;

        Object element = queue.elements[queue.head];
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return element;
    }

    // Предусловие: ничего не требуется.
    // Постусловие: возвращается текущий размер очереди.
    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Предусловие: ничего не требуется.
    // Постусловие: возвращается true, если очередь пустая, и false в противном случае.
    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Предусловие: ничего не требуется.
    // Постусловие: все элементы очереди удалены.
    public static void clear(ArrayQueueADT queue) {
        queue.elements = new Object[10];
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            int newCapacity = queue.elements.length * 2;
            Object[] newElements = new Object[newCapacity];
            for (int i = 0; i < queue.size; i++) {
                newElements[i] = queue.elements[(queue.head + i) % queue.elements.length];
            }
            queue.elements = newElements;
            queue.head = 0;
            queue.tail = queue.size;
        }
    }
}
