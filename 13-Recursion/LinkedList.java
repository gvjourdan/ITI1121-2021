
public class LinkedList<E extends Comparable<E>>  {
    private static class Node<E> {
        private E value;
        private Node<E> next;
        private Node( E value, Node<E> next ) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;


    public int size() { 
        return size(head);
    }


    private int size(Node<E> p) { 

        // base case
        if(p == null){
            return 0;
        } else {
            // general case
            return( 1 + size(p.next));
        }
    }

    public E findMax() {
        if(head == null){
            throw new IllegalStateException("empty list");
        }

        return findMax(head);
    }


    private E findMax(Node<E> p) {

        // base case
        if(p.next ==null){
            return p.value;
        } else {// general case
            E answer = findMax(p.next);
            if(p.value.compareTo(answer)> 0 ){
                return p.value;
            } else {
                return answer;
            }
        }

    }

     public E get( int pos ) {

        if(pos < 0){
            throw new IndexOutOfBoundsException();
        }

        return get(pos, head);
     }

     private E get( int pos, Node<E> p) {

        if(p ==null){
            throw new IndexOutOfBoundsException();
        }
        // base case
        if(pos == 0) {
            return p.value;
        }
        else { // general case
            return get(pos-1, p.next);
        }
     }

     // index of the leftMost instance of obj
     public int indexOf(E obj){
        return indexOf(obj, head);
     }

     private int indexOf(E obj, Node<E> p){
        
        // base case
        if(p == null){ 
            return -1;
        }

        // also base case
        if(p.value.equals(obj)){
            return 0;
        }

        // general case
        int answer = indexOf(obj, p.next);
   
        if(answer == -1){
            return -1;
        } 
        
        return answer + 1;
        

     }


    public int indexOfLast(E obj ) {
        if(obj == null) {
            throw new NullPointerException("null parameter");
        }
        return indexOfLast(obj, head);
    }

    private int indexOfLast(E obj, Node<E> p) {
        
        // base case
        if(p == null) {
            return -1;
        }

        // general case
        int result = indexOfLast(obj, p.next);
        if(result == -1){
            if(p.value.equals(obj)){
                return 0;
            } else {
                return -1;
            }
        } else {
            return result + 1;
        }
    }



    public boolean contains( E o ) {
        if(o == null) {
            throw new NullPointerException("null parameter");
        }
        return contains(head, o);
    }

    private boolean contains( Node<E> p, E o ) {
        if(p == null) { // base case
            return false;
        } else if(p.value.equals(o)){ // base case
            return true;
        } else { 
            // general case
            return contains(p.next, o);
        }

    }

    
    
    
    
    
    
    public boolean isIncreasing() {
        return isIncreasing( head );
    }

    private boolean isIncreasing(Node<E> p) {
        if(p == null || p.next == null){ // base case
            return true;
        } else if(p.value.compareTo(p.next.value) > 0) {
            return false;
        } else { // general case
            return isIncreasing(p.next);
        }

    }

    public void remove( E o ) {
        if(o == null) {
            throw new NullPointerException("null parameter");
        }
        if ( head == null ) {
            throw new java.util.NoSuchElementException();
        }
        if ( head.value.equals( o ) ) {
            head = head.next;
        } else { 
            remove( head, o );
        }
    }

    private void remove(Node<E> p, E o ) {
        if ( p.next == null ) { 
            throw new java.util.NoSuchElementException();
        }
       
        if ( p.next.value.equals( o ) ) {
            p.next = p.next.next;
        } else { // general case
            remove( p.next, o );
        }

    }

    
    
    
    
    
    
    
    
    
    
    
    
    // Public part

    public boolean equals( LinkedList<E> other ) {
        if ( other == null ) {
            return false;
        }
        return equals( head, other.head );
    }

    // Private

    private boolean equals( Node<E> p, Node<E> q ) {
        if ( p == null || q == null ) {
            return p == null && q == null;
        }
        if ( ! equals( p.value, q.value ) ) {
            return false;
        }
        return equals( p.next, q.next );
    }

    // Auxiliary

    private boolean equals( E a, E b ) {
        if ( a == null || b == null ) {
            return ( a == null && b == null );
        } else {
            return a.equals( b );
        }
    }



// old iterative methods

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst( E o ) {
        head = new Node<E>( o, head );
    }

    public void add( E o ) {

        Node<E> newNode = new Node<E>( o, null );
        if ( head == null ) {
            head = newNode;
        } else {
            Node<E> p = head;
            while ( p.next != null )
                p = p.next;
            p.next = newNode;
        }
    }

    
    public E removeFirst() {

        if(isEmpty())
            throw new IllegalStateException("Emty list!");


        E savedValue = head.value;

        Node<E> first = head;
        head = head.next;

        first.next = null;  // memory ``scrubbing''
        first.value = null;

        return savedValue;
    }


    public E removeLast() {

        if(isEmpty())
            throw new IllegalStateException("Emty list!");

        E savedValue;

        if ( head.next == null ) {
            savedValue = head.value; 
            head.value = null;
            head = null;
        } else {
            Node<E> p = head;
            while ( p.next.next != null ) {
                p = p.next;
            }
            Node<E> last = p.next;
            savedValue = last.value;
            last.value = null;
            p.next = null;
        }
        return savedValue;
    }


    public E remove( int pos ) {

        if ( pos < 0 || pos >= size() ) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }

        E savedValue;
        Node<E> toBeRemoved;

        if ( pos == 0 ) {
            toBeRemoved = head;
            head = head.next;
        } else {
            Node<E> p = head;

            for ( int i=0; i<( pos-1 ); i++ ) {
                p = p.next;
            }
            toBeRemoved = p.next;
            p.next = p.next.next;
        }
        savedValue = toBeRemoved.value;
        toBeRemoved.value = null;
        toBeRemoved.next = null;
        return savedValue;
    }



    public String toString(){
        StringBuffer res = new StringBuffer();
        res.append("[");
        if(!isEmpty()){
            Node<E> cursor = head;
            res.append(cursor.value);
            while(cursor.next != null){
                cursor = cursor.next;
                res.append(" " + cursor.value);
            }
        }
        res.append("]");
        return res.toString();
    }
}





