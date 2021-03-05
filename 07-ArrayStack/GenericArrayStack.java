public class GenericArrayStack<E> implements Stack<E> {

    // E is the type of the elements of this stack.  The specific type
    // will specified when a reference is declared and a stack is
    // actually created. E.g.:
    //
    // Stack<Integer> nums;
    // nums = new GenericArrayStack<Integer>( 10 );

    // Instance variables

    private E[] elems; // Used to store the elements of this ArrayStack
    private int top; // Designates the first free cell
    
    @SuppressWarnings( "unchecked" )

    // Constructor
    public GenericArrayStack( int capacity ) {
        // elems = new E[ capacity ]; // Does not work...
    	elems = (E[]) new Object[ capacity ];
    	top = 0;
    }

    // Returns true if this ArrayStack is empty
    public boolean isEmpty() {
    	return top == 0;
    }

    @SuppressWarnings( "unchecked" )

    public E push( E elem ) {


        if(top == elems.length){
            Object[] tmp = new Object[ 2*elems.length ];
            for(int i = 0; i < elems.length; i++){
                tmp[i]=elems[i];
            } 
            elems = (E[]) tmp;
        }

    	elems[ top ] = elem;
    	top++;

    	return elem;
    }

    public E pop() {
	// pre-condition: ! isEmpty()

    	E saved;

    	top--;
    	saved = elems[ top ];
    	elems[ top ] = null;

    	return saved;
    }

    public E peek() {
	// pre-condition: ! isEmpty()

    	return elems[ top-1 ];
    }
}
