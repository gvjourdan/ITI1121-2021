public class Test {

    private static void testCircularQueueV2(){
        
        Queue<Integer> queue = new CircularQueueV2<Integer>();

        for ( int i=0; i<10; i++ ) {
            queue.enqueue( Integer.valueOf( i ) );
        }

        while ( ! queue.isEmpty() ){
            System.out.println( queue );
            System.out.println( queue.dequeue() );
        }


        Queue<String> queue2 = new CircularQueueV2<String>(3);
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
        try{
            queue2.enqueue( "c" );
            queue2.enqueue( "d" );
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println(queue2);

    }

    private static void testCircularQueue(){
        
        Queue<Integer> queue = new CircularQueue<Integer>();

        for ( int i=0; i<10; i++ ) {
            queue.enqueue( Integer.valueOf( i ) );
        }

        while ( ! queue.isEmpty() ){
            System.out.println( queue );
            System.out.println( queue.dequeue() );
        }


        Queue<String> queue2 = new CircularQueue<String>(3);
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
        try{
            queue2.enqueue( "c" );
            queue2.enqueue( "d" );
        } catch(IllegalStateException e){
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println(queue2);

    }

    public static void main( String[] args ) {

        System.out.println("Testing CircularQueue...");
        testCircularQueue();

        System.out.println("Testing CircularQueueV2...");
        testCircularQueueV2();

    }
}