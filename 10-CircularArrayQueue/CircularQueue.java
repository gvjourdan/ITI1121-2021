// In this implementation of a queue, we
// use a variable "size" to track empty
// and full queues


public class CircularQueue<E> implements Queue<E> {


    private int front, rear;
    private E[] q;
    private int size;
    private int capacity;
    private static final int INITIAL_CAPACITY = 1000;

    @SuppressWarnings("unchecked")
    public CircularQueue(){
        this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public CircularQueue(int capacity){
        this.capacity = capacity;
        q = (E[])new Object[capacity];
        front = rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public void enqueue( E o ) {
        if(o == null) {
            throw new NullPointerException("no null object in my queue !");
        }
        if(isFull()){
            throw new IllegalStateException("full queue");
        }
        if(isEmpty()){
            front = rear = 0; // actually not needed
        } else {
            rear = (rear+1)%capacity;
        }
        q[rear]=o;
        size ++;
    }


    public E dequeue() {
        if(isEmpty()){
            throw new IllegalStateException("empty queue");
        }
        E tmp = q[front];
        q[front] = null;
        size --;
        if(size == 0){
            front = rear = 0;
        } else {
            front = (front + 1) % capacity;
        }
        return tmp;
    }

     public E peek( E o ) {
        if(isEmpty())
            throw new IllegalStateException("Queue empty!");

        return q[front];
    }

    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("<");
        if(!isEmpty()){
            res.append(q[front]);
            for(int i = 1; i < size; i++){
                res.append(" " + q[(front + i)%capacity]);
            }
        }
        res.append("<");
        return res.toString();
    }
}
    
