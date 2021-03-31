public class DoublyLinkedList<E> implements List<E> {

    private static class Node<T> {

		private T value;

		private Node<T> previous;
		private Node<T> next;

		Node (T value, Node<T> previous, Node<T> next) {
		    this.value = value;
		    this.previous = previous;
		    this.next = next;
		}
    }

    private Node<E> head;
    private int size;
    private Node<E> tail;

    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public void addFirst( E o ) {

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }
        head = new Node<E>(o, null, head); 
		if (size == 0) {
		    tail = head;
		}
		else {
		    head.next.previous = head; 
		}
        size++;
    }

    public void add( E o ) {

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }

        tail = new Node<E>(o,tail, null);
		if (size == 0) {
		    head = tail;
		} else {
			tail.previous.next = tail;
		}
		size++;

    }

    public void add( int pos, E o) {

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }
        if ( pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }


        if(pos == 0){
            addFirst( o );
        } else if(pos == size){
            add( o );
        } else  {


		    Node<E> p = head;
		    
		    for (int i = 0; i < (pos-1); i++) {
			    p = p.next;
			}
		    
		    p.next = new Node<E> (o, p, p.next);
			p.next.next.previous = p.next;
			size++;
        }
    }
    
    public E removeFirst() {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        E savedValue = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        } else {
            head.previous = null;
        }
        size--;
        return savedValue;

    }

    public E removeLast() {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        E savedValue= tail.value;

        tail = tail.previous;

        if ( tail == null ) {
            head  = null;
        } else {
            tail.next = null;
        }
        size--;
        return savedValue;    
    }


    public boolean remove( E o ) {

        if ( size == 0 )
            return false;

        if ( head.value.equals( o ) ) {
            removeFirst();
            return true;
        } else if (tail.value.equals(o)){
        	removeLast();
        	return true;
        } else {
            Node<E> p = head;
            while ( p != null && ! p.value.equals( o ) ) {
                p = p.next;
            }
            if ( p == null ) {
                return false;
            } else {                
                p.previous.next = p.next;
                p.next.previous = p.previous;
                size--;
                return true;
            }  
        }
    }



    public E get( int pos ) {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        if ( pos < 0 || pos >= size) {
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

        if ( pos < 0 || pos >= size ) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }


        if ( pos == 0 ) {
            return removeFirst();
        } else if (pos == size-1) {
            return removeLast();
        }
        else {
            Node<E> p = head;

            for ( int i=0; i< pos; i++ ) {
                p = p.next;
            }
            p.next.previous = p.previous;
            p.previous.next = p.next;
            size --;
            return p.value;
        }
    }


    public boolean equals(DoublyLinkedList<E> otherList){

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

