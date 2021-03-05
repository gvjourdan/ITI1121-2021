public class LinkedStack<E> implements Stack<E> {

    private Elem<E> top;

    public LinkedStack(){
        top = null;
    }


    public  boolean isEmpty() {
        return top == null;
    }

    public  E push(E newVal) {
        
        top = new Elem<E>(newVal,top);
        
        return  newVal;
    }

    public  E pop() {
        E val = top.value;
        top = top.next;
        return val;
    }

    public  E peek() {
        return top.value;
    }
   
}
