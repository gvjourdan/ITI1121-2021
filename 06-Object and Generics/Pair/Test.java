class Test {

	public static void test1(){
		PairShape pairShape = new PairShape(new Rectangle( 10, 100, 10, 100 ),new Circle(1,1,5));
		Shape first = (Shape)pairShape.getFirst();
		Shape second = (Shape)pairShape.getSecond();

		System.out.println("First: " + first);
		System.out.println("Second: " + second);

		PairTime pairTime = new PairTime(new Time(12,23,15), new Time(10,34,58));
		Time time1 = (Time)pairTime.getFirst();
		Time time2 = (Time)pairTime.getSecond();

		System.out.println("First: " + time1);
		System.out.println("Second: " + time2);		
	}

/*
	public static void testObject(){
		Pair pairShape = new Pair(new Rectangle( 10, 100, 10, 100 ),new Circle(1,1,5));
		Shape first = (Shape)pairShape.getFirst();
		Shape second = (Shape)pairShape.getSecond();

		System.out.println("First: " + first);
		System.out.println("Second: " + second);

		Pair PairTime = new Pair(new Time(12,23,15), new Time(10,34,58));
		Time time1 = (Time)PairTime.getFirst();
		Time time2 = (Time)PairTime.getSecond();

		System.out.println("First: " + time1);
		System.out.println("Second: " + time2);

		Pair pairString = new Pair("Java","Python");
		String string1 = (String) pairString.getFirst();
		String string2 = (String) pairString.getSecond();
		System.out.println("First: " + string1);
		System.out.println("Second: " + string2);

		Pair pair = new Pair("Java",23);
		String val1 = (String) pair.getFirst();
		Integer val2 = (Integer) pair.getSecond();
		System.out.println("First: " + val1);
		System.out.println("Second: " + val2);
		 
	}
*/
/*
	public static void testGeneric(){		
		Pair<Shape> pairShape = new Pair<Shape>(new Rectangle( 10, 100, 10, 100 ),new Circle(1,1,5));
		Shape first = pairShape.getFirst();
		Shape second = pairShape.getSecond();
		
		System.out.println("First: " + first);
		System.out.println("Second: " + second);
		
		Pair<Time> PairTime = new Pair<Time>(new Time(12,23,15), new Time(10,34,58));
		Time time1 = PairTime.getFirst();
		Time time2 = PairTime.getSecond();
		
		System.out.println("First: " + time1);
		System.out.println("Second: " + time2);
		
		Pair<String> pairString = new Pair<String>("Java","Python");
		String string1 = pairString.getFirst();
		String string2 = pairString.getSecond();
		System.out.println("First: " + string1);
		System.out.println("Second: " + string2);
		 
	}
*/

	public static void test2Generics(){
		Pair<Shape,Shape> pairShape = new Pair<Shape,Shape>(new Rectangle( 10, 100, 10, 100 ),new Circle(1,1,5));
		Shape first = pairShape.getFirst();
		Shape second = pairShape.getSecond();
		
		System.out.println("First: " + first);
		System.out.println("Second: " + second);
		
		Pair<Time,Time> PairTime = new Pair<Time,Time>(new Time(12,23,15), new Time(10,34,58));
		Time time1 = PairTime.getFirst();
		Time time2 = PairTime.getSecond();
		
		System.out.println("First: " + time1);
		System.out.println("Second: " + time2);
		
		Pair<String,String> pairString = new Pair<String,String>("Java","Python");
		String string1 = pairString.getFirst();
		String string2 = pairString.getSecond();
		System.out.println("First: " + string1);
		System.out.println("Second: " + string2);
		
		Pair<String,Integer> pair = new Pair<String,Integer> ("Java",23);
		String val1 = pair.getFirst();
		Integer val2 = pair.getSecond();
		System.out.println("First: " + val1);
		System.out.println("Second: " + val2);	
	}

	public static void main( String[] args ) {

//		test1();
//		testObject();
//		testGeneric();
		test2Generics();
	}
}
