
/*
 * Find the four numbers in the 20 x 20 grid that produce the largest product in the same direction (up, down, left, right, or diagonally). 
 */

import java.io.*;
import java.util.*;

public class LargestProductInAGrid {
	public static void main(String[] args) throws IOException{
		int[][] testGrid = testReadGrid("testGrid.txt");
		
		System.out.println("The sum of the test grid is: " + sumTestGrid(testGrid));	// should display '39'
		
	}
	
	// ========================================================================
	
	// find the greatest product for the 3 adjacent numbers going down
	public static int greatestProductDown(int[][] grid){
		int product = 0;
		int max = 0;
		
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < grid.length; col++){
				
			}
		}
		
		return product;
	}
	
	// ========================================================================
	
	@SuppressWarnings("resource")
	public static int[][] readGrid(String filename){
		int[][] grid = new int[20][20];
		
		// read the text file containing the grid and place the numbers in a 2-dimensional 20x20 array
		// assume that the format of the file is correct
		Scanner scan = null;
		try {
			scan = new Scanner(new File(filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int row = 0; row < 20; row++){
			for(int col = 0; col < 20; col++){
				grid[row][col] = scan.nextInt();
			}
		}
		
		return grid;
	}
	
	@SuppressWarnings("resource")
	public static int[][] testReadGrid(String filename) throws IOException{
		int[][] grid = new int[5][5];
		
		// read the text file containing the grid and place the numbers in a 2-dimensional 3x3 array
		// assume that the format of the file is correct
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid.length; col++){
				grid[row][col] = scanner.nextInt();
			}
		}
		
		// display to ensure correct
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid.length; col++){
				System.out.println("Num is: " + grid[row][col] + " for row: " + row + " and col: " + col);
			}
			System.out.println();
		}
		
		return grid;
	}
	
	public static int sumTestGrid(int[][] grid){
		int sum = 0;
		
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid.length; j++){
				sum += grid[i][j];
			}
		}
		
		return sum;
	}

}
