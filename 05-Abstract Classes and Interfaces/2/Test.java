
public class Test {


/*
	public static void sort2( Time[] a ) {
	    if ( a[ 0 ].after( a[ 1 ] ) ) {
	        Time tmp = a[ 0 ];
	        a[ 0 ] = a[ 1 ];
	        a[ 1 ] = tmp;
	    }
	}
	public static void sort2( Shape[] a ) {
	    if ( a[ 0 ].compareTo( a[ 1 ] ) > 0 ) {
	        Shape tmp = a[ 0 ];
	        a[ 0 ] = a[ 1 ];
	        a[ 1 ] = tmp;
	    }
	}
*/
	public static void sort2( Comparable[] a ) {
	    if ( a[ 0 ].compareTo( a[ 1 ] ) > 0 ) {
	        Comparable tmp = a[ 0 ];
	        a[ 0 ] = a[ 1 ];
	        a[ 1 ] = tmp;
	    }
	}

	public static void main(String[] args){


		Time[] t;
		t = new Time[2];
		t[0] = new Time(11,30,23);
		t[1] = new Time(9,45,54);
		System.out.println("Before: t[0] = " + t[0] +
			", t[1] = " + t[1]);
		sort2(t);
		System.out.println("After: t[0] = " + t[0] +
			", t[1] = " + t[1]);

		Shape[] s;
		s = new Shape[2];
		s[0] = new Circle(2,2,5);
		s[1] = new Rectangle(5,7,1,2);
		System.out.println("Before: s[0] = " + s[0] +
			", s[1] = " + s[1]);
		sort2(s);
		System.out.println("After: s[0] = " + s[0] +
			", s[1] = " + s[1]);
	}

}
