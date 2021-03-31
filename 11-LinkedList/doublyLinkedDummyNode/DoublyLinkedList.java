
public class DoublyLinkedList<E> implements List<E> {

	private static class Node<T> {

		private T value;
		private Node<T> next;
		private Node<T> previous;

		private Node(T value, Node<T> previous, Node<T> next ){
			this.value = value;
			this.next = next;
			this.previous = previous;
		}
	}

	private Node<E> head;
	private int size = 0 ;

	public DoublyLinkedList(){
		size = 0;
		head = new Node<E>(null,null,null);
		head.next = head.previous = head;
	}


	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public void addFirst(E o){

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }

		Node<E> newNode = new Node<E>(o, head, head.next);
		head.next = newNode;
		newNode.next.previous = newNode;
		size++;
	}

	public void add(E o){

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }

		Node<E> newNode = new Node<E>(o, head.previous, head);
		head.previous = newNode;
		newNode.previous.next = newNode;
		size++;

	}

    public void add( int pos, E o) {

        if(o == null) {
            throw new NullPointerException("Can't add null reference to the list");
        }
        if ( pos < 0 || pos > size) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }


	    Node<E> p = head;
	    
	    for (int i = 0; i < pos; i++) {
		    p = p.next;
		}
	    
	    p.next = new Node<E> (o, p, p.next);
		p.next.next.previous = p.next;
		size++;
        
    }
    
    
	public E removeFirst() {
		if(isEmpty())
			throw new IllegalStateException("Empty list!");

		E savedValue = head.next.value;
		head.next = head.next.next;
		head.next.previous = head;
		size--;
		return savedValue;
	}

	public E removeLast(){
		if(isEmpty())
			throw new IllegalStateException("Empty list!");

		E savedValue = head.previous.value;
		head.previous = head.previous.previous;
		head.previous.next = head;
		size--;
		return savedValue;

	}	

	public boolean remove(E o) {
		if (isEmpty()) return false;

		Node<E> p = head.next;
		while((p != head) && !(p.value.equals(o))) {
				p = p.next;
		}
		if(p == head)
			return false;
		
		p.next.previous = p.previous;
		p.previous.next = p.next;
		size --;
		return true;

	}
   
    public E get( int pos ) {

        if(isEmpty())
            throw new IllegalStateException("Empty list!");

        if ( pos < 0 || pos >= size ) {
            throw new IndexOutOfBoundsException( Integer.toString( pos ) );
        }

        Node<E> p = head.next;
        
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

        Node<E> p = head.next;
        
        for ( int i=0; i<pos; i++ ) {
            p = p.next;
        }

		p.next.previous = p.previous;
		p.previous.next = p.next;
		size --;
		return p.value;
    }

  	public boolean equals(DoublyLinkedList<E> otherList){

    	if(otherList == null)
    		return false;

    	if(size != otherList.size())
    		return false;

    	Node<E> thisCursor = head.next;
    	Node<E> otherCursor = otherList.head.next;

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
 	 	 	Node<E> cursor = head.next;
    		res.append(cursor.value);
    		while(cursor.next != head){
    			cursor = cursor.next;
	    		res.append(" " + cursor.value);
    		}
    	}
    	res.append("]");
    	return res.toString();
    }
}

