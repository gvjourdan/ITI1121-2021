// this implementation does not use an instance variable
// size and instead checks the references as required.
// It inefficiently uses the method size() for get( int pos )
// remove( int pos ) and equals(SinglyLinkedList<E> otherList)
// and add( int pos, E o)

public class SinglyLinkedList<E> implements List<E> {

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node(T value, Node<T> next ) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;

    public SinglyLinkedList() {
        head = null;
    }

    public int size() {
        int size = 0;
        Node<E> p = head;
        while(p!=null){
            p = p.next;
            size++;
        } 

        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void addFirst( E o ) {

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }
        Node<E> newNode = new Node<E>( o, null );
        if ( head == null ) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    
    public void addFirstAlternative( E o ) {    
        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }
        head = new Node<E>( o, head );
    }

    public void add( E o ) {

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }
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

    public void add( int pos, E o) {

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }
        if ( pos < 0 || pos > size()) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }


        if(pos == 0){
            addFirst( o );
        } else {

            Node<E> p = head;
            for(int i = 0; i < pos - 1; i++) {
                p = p.next;
            }
     
            p.next = new Node<E>( o, p.next );
        }
    }
    
    
    
    
    
    
    
    
    
    
    public E removeFirst() {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        E savedValue = head.value;
        head = head.next;
        return savedValue;
    }

    public E removeLast() {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        E savedValue;

        if ( head.next == null ) {
            savedValue = head.value; 
            head = null;
        } else {
            Node<E> p = head;
            while ( p.next.next != null ) {
                p = p.next;
            }
            savedValue = p.next.value;
            p.next = null;
        }
        return savedValue;    
    }


    public boolean remove( E o ) {

        if ( head == null )
            return false;

        if ( head.value.equals( o ) ) {
            head = head.next;
            return true;
        } else {
            Node<E> p = head;
            while ( p.next != null && ! p.next.value.equals( o ) ) {
                p = p.next;
            }
            if ( p.next == null ) {
                return false;
            } else {
               p.next = p.next.next;
               return true;
            }  
        }
    }

    public E get( int pos ) {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        if ( pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }

        Node<E> p = head;

        for ( int i=0; i<pos; i++ ) {
            p = p.next;
        }

        return p.value;
    }

 
    public E remove( int pos ) {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        if ( pos < 0 || pos >= size()) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }

        Node<E> toBeRemoved;

        if ( pos == 0 ) {
            toBeRemoved = head;
            head = head.next;
            // or return removeFirst();
        } else {
            Node<E> p = head;

            for ( int i=0; i<( pos-1); i++ ) {
                p = p.next;
            }
            toBeRemoved = p.next;
            p.next = p.next.next;
        }
        return toBeRemoved.value;
    }


    
    
    
    
    
    
    
    
    
    
    
    
    public boolean equals(SinglyLinkedList<E> otherList){

        int size = size();
        if((otherList == null) || (size != otherList.size()))
            return false;

        Node<E> thisCursor = head;
        Node<E> otherCursor = otherList.head;

        for(int i = 0; i < size; i++){
            if(!thisCursor.value.equals(otherCursor.value))
                return false;
            thisCursor = thisCursor.next;
            otherCursor = otherCursor.next;
        }

        return true;
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

