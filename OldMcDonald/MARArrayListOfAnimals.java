/**
 * @author Matt Russotti
 *Date: Jan 26, 2020
 *Assignment: MARArrayListOfAnimals.java
 */

/**
 * @author Russotti
 *
 */
import java.util.ArrayList;
import java.util.Scanner;


public class MARArrayListOfAnimals {


	public static void main(String[] args) {
		Scanner aye=new Scanner (System.in);
		ArrayList <MARAbstractAnimal> farm=new ArrayList <MARAbstractAnimal>();
	
		int userNum;
		
		
		do {
				
			
			do{
					System.out.println("(1) Chick \n(2) ConfusedChick \n(3) Cow \n(4) Named Cow \n(5) Pig \n(6) Done adding animals"
						+"\nWhat type of animal would you like to add to the farm? "	);
					if (!aye.hasNextInt()) {
						System.out.println("Invalid input, try again. ");
						userNum= -1;
						aye.next();
					}else {
						userNum = aye.nextInt();
						if (userNum<1||userNum>6){
							System.out.println("That wasn't right! Try again. ");
						}
					}
		
		
				}while (userNum<1||userNum>6);
				
																									
				
		if (userNum==1) {
			farm.add( new MARChick(getAns("What does a chick say: ")));
		}else if (userNum==2) {
		
			farm.add( new MARConfusedChick(getAns("What is the first sound the chick says: "),getAns("What is the second sound the chick says: ")));		
		}else if (userNum==3) {
		
			farm.add( new MARCow(getAns("What does a cow say: ")));
		}else if (userNum==4) {
			
			farm.add( new MARNamedCow(getAns("Enter the cow's name: "),getAns("What does a cow say: ")));
		}else if (userNum==5) {
			
			farm.add( new MARPig(getAns("What sound does a pig make: ")));		
		}
		
				
		}while(userNum!=6);
//		
//		
//		
		System.out.println("Your farm is complete!");
		userNum=0;
		int f=farm.size();
		int otherNum=0;
	//
	//
	//
		
		do {
			do{
				System.out.println("(1) Display all animals \n(2) Ask an animal to speak \n(3) Ask the typpe of an animal \n(4) Ask the name of an animal \n(5) leave the farm"	);
				if (!aye.hasNextInt()) {
					System.out.println("Invalid input, try again. ");
					userNum= -1;
					aye.next();
				}else {
					userNum = aye.nextInt();
					if (userNum<1||userNum>5){
						System.out.println("That wasn't right! Try again. ");
					}
				}
	
	
			}while (userNum<1||userNum>5);
	if (userNum==1) {
		for (MARAbstractAnimal i: farm) {
			System.out.println(i.toString());
		}
	}else if (userNum==2) {
					do{
						System.out.println("Enter a number from 0 to "+(f-1));
						if (!aye.hasNextInt()) {
							System.out.println("Invalid input, try again. ");
							otherNum= -1;
							aye.next();
						}else {
							otherNum = aye.nextInt();
							if (otherNum<0||otherNum>f){
								System.out.println("That wasn't right! Try again. ");
							}
						}
			
			
					}while (otherNum<0||otherNum>f);
		System.out.println((farm.get(otherNum)).getSound());
					
	}else if (userNum==3) {
		do{
			System.out.println("Enter a number from 0 to "+(f-1));
			if (!aye.hasNextInt()) {
				System.out.println("Invalid input, try again. ");
				otherNum= -1;
				aye.next();
			}else {
				otherNum = aye.nextInt();
				if (otherNum<0||otherNum>f){
					System.out.println("That wasn't right! Try again. ");
				}
			}


		}while (otherNum<0||otherNum>f);

		System.out.println((farm.get(otherNum)).getType());
		

	}else if (userNum==4) {
		do{
			System.out.println("Enter a number from 0 to "+f);
			if (!aye.hasNextInt()) {
				System.out.println("Invalid input, try again. ");
				otherNum= -1;
				aye.next();
			}else {
				userNum = aye.nextInt();
				if (otherNum<1||otherNum>f){
					System.out.println("That wasn't right! Try again. ");
				}
			}


		}while (otherNum<1||otherNum>f);
		
	//(farm.get(otherNum)).getName();
		

	}
			
			
	}while(userNum!=5);
		
		aye.close();
		//System.out.println(userNum);
	}
	public static String getAns(String prompt) {
		Scanner a=new Scanner (System.in);
		String ans="";
		System.out.println(prompt);
		ans=a.nextLine();
		a.close();
		return ans;
				
	}
}

