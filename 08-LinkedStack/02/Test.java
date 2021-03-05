/** ITI 1121/1521 Introduction to computer science II
 *
 *  This test program illustrates some of the advantages of Generics
 *  over the traditional Java implementation of a Stack.
 *
 *  @author Marcel Turcotte (turcotte@site.uottawa.ca>
 */


public class Test {

    public static void main( String[] args ) {


		System.out.println("LinkedStack<Integer>");
		Stack<Integer> num11;
		num11 = new LinkedStack<Integer>();

		num11.push( Integer.valueOf( 1 ) );
		num11.push( Integer.valueOf( 2 ) );
		num11.push( Integer.valueOf( 3 ) );

		while ( ! num11.isEmpty() ) {
			Integer num;
			num =  num11.pop();
			System.out.println( num );
		}

		System.out.println("GenericArrayStack<Integer>");
		num11 = new GenericArrayStack<Integer>(10);

		num11.push( Integer.valueOf( 1 ) );
		num11.push( Integer.valueOf( 2 ) );
		num11.push( Integer.valueOf( 3 ) );

		while ( ! num11.isEmpty() ) {
			Integer num;
			num = num11.pop();
			System.out.println( num );
		}



		System.out.println("LinkedStack<String>");
		Stack<String> op1;
		op1 = new LinkedStack<String>();

		op1.push( "plus" );
		op1.push( "mult" );
		op1.push( "div" );

		while ( ! op1.isEmpty() ) {
			String op;
			op = op1.pop();
			System.out.println( op );
		}

		//this line won't compile anymore
//		op1.push( Integer.valueOf( 4 ) ); 


		System.out.println("GenericArrayStack<String>");
		op1 = new GenericArrayStack<String>( 10 );

		op1.push( "plus" );
		op1.push( "mult" );
		op1.push( "div" );

		while ( ! op1.isEmpty() ) {
			String op;
			op =  op1.pop();
			System.out.println( op );
		}

		//this line won't compile anymore
//		op1.push( Integer.valueOf( 4 ) ); 

    }
}
