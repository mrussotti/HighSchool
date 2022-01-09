/**
 * @author Matt Russotti
 *Date: Feb 3, 2020
 *Assignment: MARRunner.java
 */

/**
 * @author mrussotti20
 *
 */
import java.util.Scanner;
public class MARRunner {

	
	 
	public static void main(String[] args) {
		MARPenny a=new MARPenny();
		Scanner aye=new Scanner(System.in);
		//System.out.print(a.toString(1,1,0,0,3,3));
		String response="";
		boolean gate=true, gate2=false;
		int one,two,three,four,five,six;
		
do {		
		System.out.println(a);
		one=a.rowToss();
		two=a.colToss();
	do {
		three=a.rowToss();
		four=a.colToss();
	}while(one==three&&two==four);
	do {
		five=a.rowToss();
		six=a.colToss();
	}while((one==five&&two==six)||(three==five&&four==six));
	a.updateScore(one, two);
	
	
	
	
	System.out.println(a.toString(one,two));
	System.out.println(a.getScore());
	a.updateScore(three, four);
		System.out.println(a.toString(one,two,three,four));
		System.out.println(a.getScore());
		a.updateScore(five, six);
		System.out.println(a.toString(one,two,three,four,five,six));
		System.out.println(	a.getScore());
		//System.out.println(one+" "+two+" "+three+" "+four+" "+five+" "+six);
		
		
		do{
			System.out.println("Would you like to play again?");
					response = (aye.nextLine());
					while(!response.equalsIgnoreCase("yes")&&!response.equalsIgnoreCase("no")){
						System.out.println("Invalid input. Try again. ");
					response=aye.nextLine();
					}
						gate=true;
			}while (gate==false);
		
		if (response.equalsIgnoreCase("no")) {
			System.out.print("Thanks for playing!");
			gate2=true;
		}
		}while(gate2==false);
	}
	


}


