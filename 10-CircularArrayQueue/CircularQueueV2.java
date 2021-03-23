// In this implementation of a queue, we
// use rear = -1 for an empty queue

public class CircularQueueV2<E> implements Queue<E> {

  

    private int capacity ;
    private E[] q;
    private int front, rear;
    private static final int INITIAL_CAPACITY = 1000;


    @SuppressWarnings("unchecked")
    public CircularQueueV2() {
       this(INITIAL_CAPACITY);
    }

    @SuppressWarnings("unchecked")
    public CircularQueueV2(int capacity) {
        this.capacity = capacity;
        q = (E[])new Object[capacity];
        rear = -1;
        front = 0;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull(){
        return (rear != -1) && ((rear+1)%capacity == front);
    }

    public void enqueue( E o ) {
        if(o == null) {
            throw new NullPointerException("no null object in my queue !");
        }
        if(isFull()){
            throw new IllegalStateException("Queue full!");
        }

        rear = (rear + 1)% capacity;
        q[rear] = o;
    }

    public E peek() {
        if(isEmpty()){
            throw new IllegalStateException("Queue empty!");
        }

        return q[front];
    }
    
    
    public E dequeue() {
        if(isEmpty()){
            throw new IllegalStateException("Queue empty!");
        }
        E val = q[front];
        q[front] = null;
        if(front == rear) {
            rear = -1;
            front = 0;
        } else {
            front = (front+1)% capacity; 
        }       
        return val;
    }

    public String toString() {
        StringBuffer res = new StringBuffer();
        res.append("<");
        if(!isEmpty()){
            int cursor = front;
            res.append(q[cursor]);
            while(cursor != rear) {
                cursor = (cursor + 1)%capacity;
                res.append(" " + q[cursor]);
            }
        }
        res.append("<");
        return res.toString();
    }
}
