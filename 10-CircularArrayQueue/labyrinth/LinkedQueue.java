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


    public  boolean isEmpty(){
       return front == null ;       
    }

    public  void enqueue(D newElement){

        if(newElement == null) {
            throw new NullPointerException("no null object in my queue !");
        }
        
        Elem<D> newGuy;
        newGuy = new Elem<D>(newElement,null);
        if(isEmpty()) {
            front = newGuy;
            rear = newGuy;
        } else {
            rear.next = newGuy;
            rear = newGuy;
        }
    }


    public D dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Empty queue");
        }

        D returnedValue = front.value;

        if(front != null && front.next == null) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        return returnedValue;
    }

    public String toString(){

        StringBuffer answer = new StringBuffer();
        answer.append("[");
        if(!isEmpty()){
            Elem<D> cursor = front;
            answer.append(cursor.value);
            while(cursor.next != null){
                cursor = cursor.next; 
                answer.append(", " + cursor.value);
            }
        }
        answer.append("]");
        return answer.toString();
    }

}




































/*
import java.io.*;
public class LinkedQueue<E> implements Queue<E> {

    private static class Elem<T> {
        private T value;
        private Elem<T> next;

        private Elem(T value, Elem<T> next){
            this.value = value;
            this.next=next;
        }
    }

    private Elem<E> front;
    private Elem<E> rear;

    public boolean isEmpty() {
        return front == null ;
    }

    public void enqueue( E o ) {
        Elem<E> newGuy = new Elem<E>(o, null);

        if(isEmpty()){
            front = newGuy;
            rear = newGuy ;
        } else {
            rear.next = newGuy;
            rear = rear.next;
        }
    }
    public E dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Empty queue");
        }

        E returnedValue = front.value;

        if(front != null && front.next == null) {
            front = null;
            rear = null;
        } else {
            front = front.next;
        }
        return returnedValue;
    }

    public String toString(){

        StringBuffer answer = new StringBuffer();
        answer.append("[");
        if(!isEmpty()){
            Elem<E> cursor = front;
            answer.append(cursor.value);
            while(cursor.next != null){
                cursor = cursor.next; 
                answer.append(", " + cursor.value);
            }
        }
        answer.append("]");
        return answer.toString();
    }

    public E peek(){
        if(isEmpty()) {
            throw new IllegalStateException("Empty queue");
        }
        return front.value;
    }
    
}
*/
























/*
    private static class Elem<T> {
        private T value;
        private Elem<T> next;
        private Elem(T value, Elem<T> next){
            this.value = value;
            this.next = next;
        }
    }

    private Elem<E> front;
    private Elem<E> rear;
    public boolean isEmpty(){
        return front == null;
    }

    public E peek(){
        if(isEmpty()){
            throw new IllegalStateException("Empty queue!");
        }

        return front.value;
    }

    public void enqueue(E e){
        Elem<E> newElem = new Elem<E>(e, null);
        if(isEmpty()){
            front = newElem;
            rear = newElem;
        } else {
            rear.next = newElem;
            rear = rear.next;
        }

    }

    public E dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Empty queue!");
        }
        
        E result = front.value;

        if(front.next == null){
            front = null;
            rear = null;
        } else{
            front = front.next;
        }
        return result;
    }

    public String toString(){
        StringBuffer answer = new StringBuffer();
        answer.append("[");
        if(! isEmpty()){
            Elem<E> cursor = front;
            answer.append(cursor.value);
            while(cursor.next != null){
                cursor = cursor.next;
                answer.append(", " + cursor.value);
            }            
        }
        answer.append("]");
        return answer.toString();

    }

    */
