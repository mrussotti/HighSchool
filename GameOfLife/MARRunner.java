/**
 * @author Matt Russotti
 *Date: Feb 10, 2020
 *Assignment: MARRunner.java
 */

/**
 * @author mrussotti20
 *
 */
import java.util.Scanner;

public class MARRunner {


	public static void main(String[] args) {
		Scanner aye=new Scanner(System.in);
		String yn="", ynTwo="";

		MARGame g=new MARGame(getInt("How many rows do you want?", aye),getInt("How many columns do you want?", aye));


		do {
			g.addCells(rowCheck("Enter row of live cell:",g, aye),colCheck("Enter column of live cell",g, aye));
			yn=getString("More Live cells to enter?(y/n): ", aye);
		}while(yn.equals("y")==true);


		do {
			System.out.println(g);
			ynTwo=getString("Would you like to see the next day?(y/n):",aye);
			g.doDay();
		}while (g.isAlive()==true&&ynTwo.equals("y"));
		if (g.isAlive()==false) {
			System.out.println("Oh no, everyone died! :( ");
		}
		System.out.println("Thanks for playing!");


	}	













	/**
	 * This error checks an String input
	 * @param prompt-tells the user what to input
	 * @return- an String that is either y or n
	 */
	public static String getString(String prompt, Scanner p) {
		String ans="";
		while((ans.equals("y")==false)&&(ans.equals("n")==false)) {
			System.out.println(prompt);
			ans=p.nextLine();	
		}
		return ans;
	}



	/**
	 * This error checks an int input
	 * @param prompt-tells the user what to input
	 * @return- an int that is greater than zero
	 */
	public static int getInt(String prompt, Scanner p) {

		int userNum=-1;

		do{
			System.out.println(prompt);
			if (!p.hasNextInt()) {
				System.out.println("Invalid input, try again. ");
				userNum= -1;
				p.next();														
			}else {

				userNum =p.nextInt();
				if (userNum<=0){
					System.out.println("That wasn't right! Try again. ");
				}
			}


		}while (userNum<=0);



		return userNum;
	}
	/**
	 * This error checks an int input
	 * @param prompt-tells the user what to input
	 * @param ggs-the game object
	 * @return-the int showing what row
	 */
	public static int rowCheck(String prompt, MARGame ggs, Scanner p) {

		int userNum=-1;
		do{
			System.out.println(prompt);
			if (!p.hasNextInt()) {
				System.out.println("Invalid input, try again. ");
				userNum= -1;
				p.next();
			}else {
				userNum = p.nextInt();
				if (userNum<0){
					System.out.println("That wasn't right! Try again. ");
					userNum= -1;
				}
				if (userNum>=ggs.getRows()) {
					System.out.println("You must input a lower number");
					userNum= -1;
				}
			}


		}while (userNum<0);

		return userNum;

	}

	/**
	 * This error checks an input
	 * @param prompt-tells the user what to input
	 * @param ggs-the game object
	 * @return-the int showing what column
	 */
	public static int colCheck(String prompt, MARGame ggs, Scanner p) {

		int userNum=-1;
		do{
			System.out.println(prompt);
			if (!p.hasNextInt()) {
				System.out.println("Invalid input, try again. ");
				userNum= -1;
				p.next();
			}else {
				userNum = p.nextInt();
				if (userNum<0){
					System.out.println("That wasn't right! Try again. ");
					userNum= -1;
				}
				if (userNum>=ggs.getCols()) {
					System.out.println("You must input a lower number");
					userNum= -1;
				}
			}


		}while (userNum<0);

		return userNum;

	}

}
