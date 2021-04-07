import java.util.NoSuchElementException;

public class LinkedList<E> implements List<E> {



// Iterator part
    
    private static class LinkedListIterator<E> implements Iterator<E> {


        private Node<E> currentIterator;
        private LinkedList<E> myList;

        public LinkedListIterator(LinkedList<E> myList) {
            this.myList = myList;
            currentIterator = null;
        }

        public E next() {
            if(currentIterator == null) {
                currentIterator = myList.head;
            } else {
                currentIterator = currentIterator.next;
            }
            if(currentIterator == null)
                throw new NoSuchElementException("Iterator at the end or list empty");
            return currentIterator.value;
        }

        public boolean hasNext(){
            if(currentIterator == null)
                return !myList.isEmpty();
            else
                return (currentIterator.next != null);
        }
    }
 
    public Iterator<E> iterator(){
        return new LinkedListIterator<E>(this);
    }


    private static class Node<E> {
        private E value;
        private Node<E> next;
        private Node( E value, Node<E> next ) {
            this.value = value;
            this.next = next;
        }
    }

    private Node<E> head;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst( E o ) {
        size++;    
        head = new Node<E>( o, head );
    }

    public void add( E o ) {

        Node<E> newNode = new Node<E>( o, null );
        size++;
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
        size--;

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
        size--;

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

    
    public boolean remove( E o ) {
        if ( head == null )
            return false;
        Node<E> toDelete = null;
        if ( head.value.equals( o ) ) {
            toDelete = head;
            head = head.next;
        } else {
            Node<E> p = head;
            while ( p.next != null && ! p.next.value.equals( o ) ) {
                p = p.next;
            }
            if ( p.next == null ) {
                return false;
            }
            toDelete = p.next;
            p.next = toDelete.next;
        }
        toDelete.value = null;
        toDelete.next = null;
        size--;
        return true;
    }

    public E get( int pos ) {

        if ( pos < 0 || pos >= size ) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }

        Node<E> p = head;
        
        for ( int i=0; i<pos; i++ ) {
            p = p.next;
        }

        return p.value;
    }

    public E remove( int pos ) {

        if ( pos < 0 || pos >= size ) {
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
        size--;
        return savedValue;
    }

    public boolean equals(LinkedList<E> otherList){

        if(otherList == null)
            return false;

        if(size != otherList.size())
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


