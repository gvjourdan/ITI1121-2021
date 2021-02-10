public class Test  {

	  public static void sort2( Comparable[] a ) {
	      if ( a[ 0 ].compareTo( a[ 1 ] ) > 0 ) {
	          Comparable tmp = a[ 0 ];
	          a[ 0 ] = a[ 1 ];
	          a[ 1 ] = tmp;
	      }
	  }

    public static void main(String[] args){
        
    	Shape[] shapeArray = new Shape[2];
    	shapeArray[0] = new Rectangle(10,100,10,100);
    	shapeArray[1] = new Circle(1,1,5);

    	System.out.println(shapeArray[0]);
    	System.out.println(shapeArray[1]);

    	sort2(shapeArray);

   		System.out.println(shapeArray[0]);
    	System.out.println(shapeArray[1]);

		 Time[] shapeTime = new Time[2];
		 
		 shapeTime[0] = new Time( 10,12,52);
		 shapeTime[1] = new Time(10,9,59);
		 
		 System.out.println(shapeTime[0]);
		 System.out.println(shapeTime[1]);
		 
		 sort2(shapeTime);
		 
		 System.out.println(shapeTime[0]);
		 System.out.println(shapeTime[1]);
		 


		Comparable[] mixedUp = new Comparable[2];
		 
		 mixedUp[0] = new Circle(1,1,5);
		 mixedUp[1] = new Time(10,9,59);
	 
		 System.out.println(mixedUp[0]);
		 System.out.println(mixedUp[1]);
		 
		 
		 sort2(mixedUp);
		 
		 System.out.println(mixedUp[0]);
		 System.out.println(mixedUp[1]);	 
 
    }
}

