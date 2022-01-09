/**
 * @author Matt Russotti
 *Date: Feb 3, 2020
 *Assignment: MARPenny.java
 */

/**
 * @author mrussotti20
 *
 */
public class MARPenny {
	private int [][] board;
	private int score;
	
	
	
	/**
	 * Creates a 5x5 board object 
	 */
	public MARPenny() {
		score=0;
		 board= new int [5][5];
		 for (int a=0;a<(board.length); a++) {
			 for (int b=0;b<(board[a].length);b++) {
				 if (a==0||b==0) {
					 board[a][b]=1;
				 }else if (a==1||b==1) {
					 board[a][b]=2;
				 }else if (a==2||b==2) {
					 board[a][b]=3;
				 }
			 }
		 }
		 for (int a=board.length-1;a>0; a--) {
			 for (int b=board.length-1;b>0;b--) {
				 if (a==board.length-1||b==board.length-1) {
					 board[a][b]=1;
				 }else if (a==board.length-2||b==board.length-2) {
					 board[a][b]=2;
				 }else if (a==board.length-3&&b==board.length-3) {
					 board[a][b]=3;
				 }
			 }
		 }
	}
	
	
	/**
	 * Returns a string object of the board
	 * @return- a string object of the board
	 */
	public String toString() {
		String ans="";
		for (int a=0;a<(board.length); a++) {
			 for (int b=0;b<(board[a].length);b++) {
				 ans+=board[a][b]+" ";
			 }
			 ans+="\n";
		}
			 return ans;
	}
	/**
	 * This program randomly generates a number between one and 5 for the row
	 * @return a random int between one and 5
	 */
	public int rowToss() {
		return (int)(Math.random()*5+.5);
		
	}
	/**
	 * This program randomly generates a number between one and 5 for the collumn
	 * @return a random int between one and 5
	 */
	public int colToss() {
		return (int)(Math.random()*4+.5);

	}
	
	/**
	 * Returns a string object of the board
	 * @param- the points on the array which need to be the letter p
	 * @return- a string object of the board
	 */
	public String toString(int x, int y, int c, int d, int e, int f) {
		String ans="";
		for (int a=0;a<board.length; a++) {
			 for (int b=0;b<(board[a].length);b++) {
				 if ((a==x&&b==y)||(a==c&&b==d)||(a==e&&b==f)){
					 ans+= "P ";
				 }else {
				 
				 ans+=board[a][b]+" ";
			 }}
			 ans+="\n";
		}
			 return ans;
	}
	
	
	/**
	 * Returns a string object of the board
	 * @param- the points on the array which need to be the letter p
	 * @return- a string object of the board
	 */
	public String toString(int x, int y, int c, int d) {
		String ans="";
		for (int a=0;a<(board.length); a++) {
			 for (int b=0;b<(board[a].length);b++) {
				 if ((a==x&&b==y)||(a==c&&b==d)){
					 ans+= "P ";
				 }else {
				 
				 ans+=board[a][b]+" ";
			 }}
			 ans+="\n";
		}
			 return ans;
	}
	
	
	/**
	 * Returns a string object of the board
	 * @param- the points on the array which need to be the letter p
	 * @return- a string object of the board
	 */
	public String toString(int x, int y) {
		String ans="";
		for (int a=0;a<(board.length); a++) {
			 for (int b=0;b<(board[a].length);b++) {
				 if ((a==x&&b==y)){
					 ans+= "P ";
				 }else {
				 
				 ans+=board[a][b]+" ";
			 }}
			 ans+="\n";
		}
			 return ans;
	}
	/**
	 * Gets the score
	 * @return
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * updates the score
	 */
	public void updateScore(int a, int b) {
		score += board[a][b];
	}
	
	
}
		
		
		
		
		
		
		
		
		
		
