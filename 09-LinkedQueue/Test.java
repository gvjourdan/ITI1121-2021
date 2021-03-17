public class Test {

    public static void main( String[] args ) {

        Queue<Integer> queue = new LinkedQueue<Integer>();

        for ( int i=0; i<10; i++ ) {
            queue.enqueue( new Integer( i ) );
        }

        while ( ! queue.isEmpty() ){
            System.out.println( queue );
            System.out.println( queue.dequeue() );
        }


        Queue<String> queue2 = new LinkedQueue<String>();
        queue2.enqueue( "a" );
        queue2.enqueue( "b" );
        queue2.enqueue( "c" );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        queue2.enqueue( "d" );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);
        System.out.println( queue2.dequeue() );
        System.out.println(queue2);

        try{
            queue2.dequeue();
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

        try{
            queue2.enqueue( "a" );
            queue2.enqueue( "b" );
            System.out.println(queue2);
            queue2.enqueue( null );
        } catch(NullPointerException e){
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}