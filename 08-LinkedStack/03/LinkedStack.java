public class LinkedStack<E> implements Stack<E> {

    private Elem<E> top;

    private static class Elem<F> {
        private F value;
        private Elem<F> next;

        private Elem(F value, Elem<F> next){
            this.value = value;
            this.next = next;
        }
    }

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

    public String toString(){
        String result;
        result = "[";
        Elem<E> p = top;
        while(p != null){
            result += p.value; // or p.value.toString();
            p = p.next;
            if(p!=null) {
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
   
}

