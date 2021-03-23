class Test {

    public static void main(String[] args) {

	String[] grid = 
	    {
		"#I#############",
		"#       #     #",
		"# ### # # ### #",
		"#   # #   ### #",
		"### ########  #",
		"#   #   ####  #",
		"# ### ###### ##",
		"# #    ##### ##",
		"#   ##     # ##",
		"############O##" 
	    };

	try {

	    Labyrinth labyrinth = Labyrinth.createLabyrinth(grid);

	    String path = Solver.solve(labyrinth);

	    if (path == null) {

		System.out.println("this maze has no solution");

	    } else {

		System.out.println("solution = " + path);
		System.out.println();

		labyrinth.trace(path);

	    }

	    System.out.println(labyrinth);

	} catch (IllegalArgumentException e) {
	    System.err.println("wrong format: " + e.getMessage());
	}


    }

}
