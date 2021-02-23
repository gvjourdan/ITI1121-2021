/** ITI 1121/1521 Introduction to computer science II
 *
 *
 *  @author Marcel Turcotte (turcotte@site.uottawa.ca>
 */



public class Test {

    public static void main( String[] args ) {



		Stack num1;
		num1 = new ArrayStack( 10 );

		num1.push( Integer.valueOf( 1 ) );
		num1.push( Integer.valueOf( 2 ) );
		num1.push( Integer.valueOf( 3 ) );

		while ( ! num1.isEmpty() ) {
		    Integer num;
		    num = (Integer) num1.pop();
		    System.out.println( num );
		}


		Stack op1;
		op1 = new ArrayStack( 10 );

		op1.push( "plus" );
		op1.push( "mult" );
		op1.push( "div" );

		while ( ! op1.isEmpty() ) {
		    String op;
		    op = (String) op1.pop();
		    System.out.println( op );
		}

		op1.push( Integer.valueOf( 4 ) ); 
		

	}
    
}

