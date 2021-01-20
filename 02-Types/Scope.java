public class Scope {


	static private int sum = 0;
 
	public static void display(){
 		System.out.println("sum in display = " + sum);
	}
	

	public static void display(int sum){
 		
 		System.out.println("sum in display(sum) = " + sum);
	
		// if I want to access this.sum
		System.out.println("Scope.sum " + Scope.sum);
	}
	

	public static void main( String[] args ) {
	 
		 int sum = 2;
		 
		 System.out.println("sum in main = " + sum );
		 display();

		 for ( int i=1; i<10; i++ ) {
		 	System.out.println( i );
		 }
	 
		 //i = i + 1;
		 
		 for ( int i=1; i<10; i++ ) {
		 	sum += i;
		 }
		 System.out.println("sum in main = " + sum );
		 display();
		 display(sum);
	}
 }

