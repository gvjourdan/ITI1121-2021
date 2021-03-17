public class LinkedQueue<D> implements Queue<D> {

    private static class Elem<T> {
        private T value;
        private Elem<T> next;
        private Elem(T value, Elem<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private Elem<D> front;
    private Elem<D> rear;

    public LinkedQueue(){
        front = rear = null;
    }

    public  boolean isEmpty(){
       return front == null ;       
    }

    public  void enqueue(D newElement){

        if(newElement == null) {
            throw new NullPointerException("no null object in my queue !");
        }
        
        Elem<D> newElem;
        newElem = new Elem<D>(newElement,null);
        if(isEmpty()) {
            front = newElem;
            rear = newElem;
        } else {
            rear.next = newElem;
            rear = newElem;
        }
    }


    public D dequeue() {

        if(isEmpty()) {
            throw new IllegalStateException("Dequeue method called on an empty queue");
        }

        D returnedValue;
        returnedValue = front.value;

        if(front.next == null) {   
            front = rear = null;
        } else {
            front = front.next;
        }
        return returnedValue;
    }

    public String toString() {
        
        String result = "[";
        if(!isEmpty()){
            Elem<D> p = front;
            result += p.value;
            while(p.next != null){
                p = p.next;
                result += ", " + p.value;
            }
        }
        result += "]";
        return result;
    }

}
