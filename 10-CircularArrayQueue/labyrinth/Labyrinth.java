import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

import java.io.IOException;
import java.io.Reader;
import java.io.FileReader;
import java.io.StringReader;
import java.io.BufferedReader;

/**
 * The <b>Labyrinth</b> class. A valid input contains only #, I, O and spaces:
 *
 * <pre>
 * #I#############
 * #       #     #
 * # ### # # ### #
 * #   # #   ### #
 * ### ########  #
 * #   #   ####  #
 * # ### ###### ##
 * # #    ##### ##
 * #   ##     # ##
 * ############O##
 * </pre>
 *
 * @author Marcel Turcotte 
 */

public class Labyrinth {

    // constants

	public static final char LEFT  = 'L';
	public static final char RIGHT = 'R';
	public static final char UP    = 'U';
	public static final char DOWN  = 'D';

	public static final char[] MOVES = { LEFT, RIGHT, UP, DOWN };

	public static final char WALL  = '#';
	public static final char EMPTY = ' ';
	public static final char PATH  = '.';

	public static final char IN    = 'I';
	public static final char OUT   = 'O';

	public static final String newline = System.getProperty("line.separator");

    // instance variables

	private int rows;
	private int columns;

	private char[][] grid;

	private int entranceRow;
	private int entranceCol;

	private Labyrinth(char[][] grid, int entranceRow, int entranceCol) {
		this.grid = grid;

		rows = grid.length;
		columns = grid[0].length; // the grid is valid, therefore grid[0] exists
		
		this.entranceRow = entranceRow;
		this.entranceCol = entranceCol;
}

    /**
     * Creates a new labyrinth object from an array of Strings.
     * A valid input contains only #, I, O and spaces.
     *
     * @return a labyrinth.
     * @throws IllegalArgumentException if the input is not 
     * correctly formatted.
     */

    public static Labyrinth createLabyrinth(String[] lines) {

    	int rows = lines.length;

    	if (rows == 0)
    		throw new IllegalArgumentException("number of rows is 0");

    	int columns = lines[0].length();

    	for (int i=1; i<rows; i++)
    		if (lines[i].length() != columns)
    			throw new IllegalArgumentException("rows have different sizes: 0, " + i);

    		char[][] grid = new char[rows][];

    		for (int i=0; i<rows; i++) {
    			grid[i] = lines[i].toCharArray();
    		}

    		int iEntrance = -1, jEntrance = -1;
    		int iExit = -1, jExit = -1;

    		for (int i=0; i<rows; i++) {
    			for (int j=0; j<columns; j++) {
    				switch (grid[i][j]) {
    					case IN: 
    					iEntrance = i;
    					jEntrance = j;
    					break;
    					case OUT: 
    					iExit = i;
    					jExit = j;
    					break;
    				}
    			}
    		}

    		if (iEntrance == -1)
    			throw new IllegalArgumentException("has no entrance");

    		if (iExit == -1)
    			throw new IllegalArgumentException("has no exit");

    		return new Labyrinth(grid, iEntrance, jEntrance);
    	}

    // Creates array of Strings from a list of Strings.

    private static String[] toStringArray(List l) {
    		String[] result = new String[l.size()];
    		int i = 0;

    		Iterator j= l.iterator();

    		while (j.hasNext())
    			result[i++] = (String) j.next();

    		return result;
    	}

    /**
     * Checks if a path is valid.
     *
     * @return true if the input path does cut across obstacles.
     */

    public boolean checkPath(String path) {

    	int row, col;

    	boolean[][] visited = new boolean[rows][columns];

    	row = entranceRow;
    	col = entranceCol;

    	boolean valid = (grid[row][col] == IN);
    	int pos=0;

    	while (valid && pos < path.length()) {
    		char direction = path.charAt(pos++);
    		switch (direction) {
    			case LEFT:
    			col--;
    			break;
    			case RIGHT:
    			col++;
    			break;
    			case UP:
    			row--;
    			break;
    			case DOWN:
    			row++;
    			break;
    			default:
    			valid = false;
    		}
    		if ((row >= 0) && (row < rows) && (col >= 0) && (col < columns))
    			if (visited[row][col] || grid[row][col] == WALL)
    				valid = false;
    			else
    				visited[row][col] = true;
    			else
    				valid = false;
    		}

    		return valid;
    	}

    /**
     * Checks if a path reaches the exit.  No validation is
     * made, use the method checkPath before applying
     * reaches goal.
     *
     * @return true if the input path reaches the exit.
     */

    public boolean reachesGoal(String path) {

    	int row = entranceRow;
    	int col = entranceCol;

    	for (int pos=0; pos < path.length(); pos++) {
    		char direction = path.charAt(pos);
    		switch (direction) {
    			case LEFT:  col--; break;
    			case RIGHT:	col++; break;
    			case UP:	row--; break;
    			case DOWN:	row++;break;
    		}
    	}

    	return grid[row][col] == OUT;
    }

    /**
     * Traces the path through the maze.  No validation is
     * made, use the method checkPath before applying
     * this method.
     *
     */

    public void trace(String path) {

    	int row = entranceRow;
    	int col = entranceCol;

    	for (int pos=0; pos < path.length(); pos++) {
    		char direction = path.charAt(pos);
    		switch (direction) {
    			case LEFT:  col--; break;
    			case RIGHT:	col++; break;
    			case UP:	row--; break;
    			case DOWN:	row++; break;
    		}
    		grid[row][col] = PATH;
    	}
    }


    /**
     * Creates a String representation of the labyrinth.
     * @return a String representation of the labyrinth.
     */

    public String toString() {

    	StringBuffer out = new StringBuffer();

    	for (int i=0; i<rows; i++) {
    		for (int j=0; j<columns; j++) {
    			out.append(grid[i][j]);
    		}
    		out.append(newline);
    	}

    	return out.toString();
    }

    /**
     * Reads a labyrinth description from a file and
     * creates an new instance (if the labyrinth is
     * valid).
     *
     * @return a labyrinth object.
     * @throws IOException, IllegalArgumentException.
     * 
     */

    public static Labyrinth readFile(String filename) throws IOException {
    	return read(new FileReader(filename));
    }

    /**
     * Reads a labyrinth description from a String and
     * creates an new instance (if the labyrinth is
     * valid).
     *
     * @return a labyrinth object.
     * @throws IOException, IllegalArgumentException.
     * 
     */

    public static Labyrinth readString(String lines) throws IOException {
    	return read(new StringReader(lines));
    }

    private static Labyrinth read(Reader in) throws IOException {

    	BufferedReader buffer = new BufferedReader(in);

    	List<String> lines = new LinkedList<String>();

    	String line = buffer.readLine();

    	while (line != null) {

    		lines.add(line);
    		line = buffer.readLine();

    	}

    	if (buffer != null)
    		buffer.close();

    	return createLabyrinth(toStringArray(lines));
    }

}
