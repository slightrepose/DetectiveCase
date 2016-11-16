package DavidAndKristy;

import java.util.Scanner;

public class DavidDotsBoxes {

	public static Scanner in = new Scanner(System.in);
	public static int inputInt;
	public static String[][] grid;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of rows between 3 and 9.");
		int row = in.nextInt();
		System.out.println("Enter number of columns between 3 and 9.");
		int col = in.nextInt();
		setGrid(row,col); // setter.
		// test vertical line
		printGrid(); // printer.
		setVertLn(new int[] {0,2}, new int[] {0,3});
	}
	public static void setGrid(int row, int col){
		// to connect two points, we'll use 'o--' instead of 'o', IF horizontal.
		grid = new String[(2 * (row + 1)) - 1][col + 1];
		String token; // string that will be given to column.
		for(int y = 0; y < grid.length; ++y){ // traverse through the rows.
			/*
			*  When creating lines, there are Vertical and Horizontal lines.
			*  Horizontal lines will be easy to make and are nothing special.
			*  But vertical lines are different, since they require a String Line of its.
			*  We will draw both lines by dividing the rows by two types.
			*
			*  The rows will be divided into two types -> even or odd.
			*  Even -> the dots will be drawn.
			*  Odd -> space will be allocated for future VERTICAL lines.
			*
			*  A token will be used to give the column the value needed.
			*  token -> if even: regular row with dot. if odd: special row that will be used to allocate space.
			* */
			if(y % 2 == 0) token = "o  "; // even row.
			else token = ""; // odd row.
			for(int x = 0; x < grid[y].length; ++x){ // traverse through the column.
				grid[y][x] = token; // set the value to the token based on the type of row.
			}
		}
	}
	public static void printGrid(){
		// procedure to print the grid array.
		for(int y = 0; y < grid.length; ++y){
			for(int x = 0; x < grid[y].length; ++x){
				System.out.print(grid[y][x]);
			}
			System.out.println(""); // every row needs a new line.
		}
	}
	public static int getY(int[] coord){
		return coord[1];
	}
	public static int getX(int[] coord){
		return coord[0];
	}
	public static void setVertLn(int[] start, int[] end){

		/*
		 *  Procedure to print a vertical line.
		 *  Parameters -> coordinates for first point and second point.
		 *  
		 *  parameter -> [xCoord,yCoord];
		 * 
		 * */
		System.out.println("\n\n\n");
		int[] max = (start[1] < end[1]) ? end : start; // get greater yCoord.
		
		/*
		 *  We need to update the REAL coordinates of the points.
		 *  But since we're only using the 
		 * */
		if(max[0] != 0) max[0] = max[0] + 1; // give actual coordinate
		
		
		
		if(getY(max) % 2 == 0) grid[getY(max) + 1][getX(max) * 3] = "|";
		else grid[getY(max)][getX(max) * 3] = "|";
		printGrid();
	}

}
