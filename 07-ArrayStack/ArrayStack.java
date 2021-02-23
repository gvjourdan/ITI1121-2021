public class ArrayStack implements Stack {

    // Instance variables

    private Object[] elems; // Used to store the elements of this ArrayStack
    private int top; // Designates the first free cell
    
    // Constructor
    public ArrayStack( int capacity ) {
       elems = new Object[ capacity ];
       top = 0;
   }

    // Returns true if this ArrayStack is empty
   public boolean isEmpty() {
       return top == 0;
   }

   public Object push( Object elem ) {
	// Pre-condition: ! isFull()

       elems[ top ] = elem;
       top++;

       return elem;
   }
   public Object pop() {
	// Pre-condition: ! isEmpty()

       Object saved;

       top--;
       saved = elems[ top ];
       elems[ top ] = null;

       return saved;
   }

   public Object peek() {
	// Pre-condition: ! isEmpty()

       return elems[ top-1 ];
   }
}

