import java.io.IOException;

class TestSolver {

    public static void main(String[] args) {

	if (args.length != 1) {
	    System.err.println("Usage: Test filename");
	    System.exit(1);
	}

	String filename = args[0];

	try {

	    Labyrinth labyrinth = Labyrinth.readFile(filename);
	    
	    String path = Solver.solve(labyrinth);

	    if (path == null) {

		System.out.println("this maze has no solution");

	    } else {

		System.out.println("solution = " + path);
		System.out.println();

		labyrinth.trace(path);

	    }

	    System.out.println(labyrinth);

	    System.out.println("with a stack");

	    labyrinth = Labyrinth.readFile(filename);
	    path = Solver.solveStack(labyrinth);

	    if (path == null) {

		System.out.println("this maze has no solution");

	    } else {

		System.out.println("solution = " + path);
		System.out.println();

		labyrinth.trace(path);

	    }

	    System.out.println(labyrinth);

	} catch (IOException e) {

	    System.out.println("error reading file: " + e.getMessage());

	} catch (IllegalArgumentException e) {

	    System.out.println("wrong format: " + e.getMessage());

	}

    }

}
