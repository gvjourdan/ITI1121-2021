public interface Queue<E> {
    boolean isEmpty();
    void enqueue(E newElement);
    E dequeue();
}

