public class Test {
    
    public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();

		for (int i=0; i<10; i++) {
			l.add(Integer.valueOf(i));
		}

		java.util.Iterator<Integer> theIterator = l.iterator();
		while (theIterator.hasNext()) {
		    System.out.println(theIterator.next());
		}

		int sizeOfTest = 10000;
		for (int i=11; i<=sizeOfTest; i++) {
			l.add(Integer.valueOf(i));
		}

		Integer dummy;
		theIterator = l.iterator();
		long start = System.currentTimeMillis();
		for(int i = 0; i < sizeOfTest; i++){
			dummy = theIterator.next();
		}
		long stop = System.currentTimeMillis();
		System.out.println("Time with iterator: " + (stop-start));

		start = System.currentTimeMillis();
		for(int i = 0; i < sizeOfTest; i++){
			dummy = l.get(i);
		}
		stop = System.currentTimeMillis();
		System.out.println("Time with get: " + (stop-start));


		start = System.currentTimeMillis();
		for(Integer i: l ){
			//do something
		}
		stop = System.currentTimeMillis();
		System.out.println("Time with iterator: " + (stop-start));


    }
}
