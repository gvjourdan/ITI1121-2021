import java.io.IOException;

class TestLabyrinth {

    public static void main(String[] args) {

	if (args.length != 2) {
	    System.err.println("Usage: Test filename path");
	    System.exit(1);
	}

	String filename = args[0];
	String path = args[1];

	try {

	    Labyrinth l = Labyrinth.readFile(filename);

	    if (l.checkPath(path)) {

		System.out.println("this path is valid");

		l.trace(path);

		if (l.reachesGoal(path))
		    System.out.println("this path reaches the exit");
		else
		    System.out.println("this path does not reach the exit");

	    } else
		System.out.println("this path is not valid");

	    System.out.println(l);

	} catch (IOException e) {
	    System.out.println("error reading file: " + e.getMessage());
	} catch (IllegalArgumentException e) {
	    System.out.println("wrong format: " + e.getMessage());
	}

    }

}
