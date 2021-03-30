public class Hanoi {

	private static int count = 1;

	private static void hanoi(int size, String from,
		String to, String using){

		if(size == 1){
			System.out.println(count++ + ") Move ring " 
				+ size + " from " + from + " to " + to);
		}
		else {
			hanoi(size-1, from, using, to);
			System.out.println(count++ + ") Move ring " 
				+ size + " from " + from + " to " + to);
			hanoi(size-1, using, to, from);
		}


	}
    public static void main( String[] args ) {

    	int size = Integer.parseInt(args[0]);
                
    	hanoi(size, "peg 1", "peg 3", "peg 2");

    }

}

