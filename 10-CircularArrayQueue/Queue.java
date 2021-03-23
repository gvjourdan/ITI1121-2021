public interface Queue<E> {
    boolean isEmpty();
    void enqueue( E o );
    E dequeue();
}
