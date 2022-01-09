/**
 * @author Matt Russotti
 *Date: Feb 5, 2020
 *Assignment: MARGame.java
 */

/**
 * @author mrussotti20
 *
 */
import java.util.Scanner;

public class MARGame {
	private String [][] board;
	private int rows;
	private int cols;

	/**
	 * creates a MARGame object 
	 * @param row-number of rows for the board
	 * @param col-number of columns for the board
	 */
	public MARGame(int row, int col) {
		board=new String [row][col];
		rows=row;
		cols=col;
		for(int a=0;a<row;a++) {
			for(int b=0;b<col;b++) {
				board[a][b]="O";
			}
		}
	}
	/**
	 * Puts a cell at location x, y
	 * @param x- the column where the cell is located
	 * @param y-the column where the cell is located
	 */
	public void addCells(int x, int y) {
		board[x][y]="X";
	}
	/**
	 * returns the number of rows
	 * @return- the number of rows
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * returns the number of columns
	 * @return- the number of columns
	 */
	public int getCols() {
		return cols;
	}

	/**
	 * This determines if there are any living cells left
	 * @return true if there are cells left and false otherwise
	 */
	public boolean isAlive() {
		for(int a=0;a<board.length;a++) {
			for (int b=0; b<board[a].length;b++) {
				if (board[a][b].equals("X")==true) {
					return true;
				}
			}
		}
		return false;
	}
	/**
	 * this method represents a day going by on the board
	 */
	public void doDay() {
	 String [][] ans =new String [rows][cols];
	 for(int c=0;c<rows;c++) {
			for(int d=0;d<cols;d++) {
				ans[c][d]="O";
			}
		}
		int pp=0;
		for(int a=0;a<board.length;a++) {
			for (int b=0;b<board[a].length;b++) {
				pp=doDayHelper(a,b);
				//System.out.println(pp);
				if ((pp==3||pp==4)&&board[a][b].equals("X")) {
					ans[a][b]="X";
				}else if  ((pp==3)&&!(board[a][b].equals("X")))  {
					ans[a][b]="X";
				}else {
					ans[a][b]="O";
				}
				pp=0;




			}
		}
		board=ans;
	}
	/**
	 * Sums the number of living neighbor cells
	 * @param row- the row of the cell in question
	 * @param col-the row of the cell in question
	 * @return- the number of living neighbor cells
	 */
	private int doDayHelper(int row, int col) {
		int center=0, topLeft=0, topCenter=0, topRight=0, left=0, right=0, bottomLeft=0, bottomCenter=0, bottomRight=0, sum=0 ;
		int count=0;
		if (board[row][col].equals("X")==true) {
			center++;
		} 


//		if ((row+1<rows)&&(row-1>0)&&(col+1<cols)&&(col-1>0)) { 
//			
//			if (board[row-1][col].equals("X")==true) {
//				bottomLeft++;
//			}
//			if (board[row][col-1].equals("X")==true) {
//				left++;
//			} 
//			if (board[row][col+1].equals("X")==true) {
//				right++;
//			}	
//			if (board[row+1][col-1].equals("X")==true) {
//				topLeft++;
//			}
//			if (board[row-1][col+1].equals("X")==true) {
//				bottomLeft++;
//			}
//			if (board[row-1][col-1].equals("X")==true) {
//				bottomLeft++;
//			} 
//			
//		}
		
		if (row+1<rows) {
			if (board[row+1][col].equals("X")==true) {
				topCenter++;
			}
		}
		if (row-1>=0) {
			if (board[row-1][col].equals("X")==true) {
				bottomLeft++;
			}
		}
		if ((col+1<cols)) {
			if (board[row][col+1].equals("X")==true) {
				right++;
			}
		}
		if ((col-1>=0)) {
			if (board[row][col-1].equals("X")==true) {
				left++;
			}
		}
		
		if ((row+1<rows)&&(col+1<cols)) {
			if (board[row+1][col+1].equals("X")==true) {
				topRight++;
			} 
		}
		if ((row+1<rows)&&(col-1>=0)) {
			if (board[row+1][col-1].equals("X")==true) {
				topLeft++;
			}
		}
		if ((col+1<cols)&&(row-1>=0)) {
			if (board[row-1][col+1].equals("X")==true) {
				bottomRight++;
			}
		}
		if ((row-1>=0)&&(col-1>=0)) {
			if (board[row-1][col-1].equals("X")==true) {
				bottomLeft++;
			} 
		}
			
		
		
		
	
			sum=center+topLeft+topCenter+topRight+left+right+bottomLeft+bottomCenter+bottomRight;

			return sum;
		}

		/**
		 * returns a string version of board
		 */
	@Override
		public String toString() {
			String ans="";
			for(int a=0;a<board.length;a++) {
				for (int b=0;b<board[a].length;b++) {
					ans+=(board[a][b])+" ";
				}
				ans+="\n";
			}
			return ans;
		}
	}
