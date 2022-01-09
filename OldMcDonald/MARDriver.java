/**
 * @author Matt Russotti
 *Date: Dec 17, 2019
 *Assignment: MARDriver.java
 */

/**
 * @author mrussotti20
 *
 */
public class MARDriver {
 public static void main(String []args) {
	 
	 MARAbstractAnimal [] arr=new MARAbstractAnimal [5];
		MARCow a = new MARCow("moo");
		MARChick b= new MARChick("cluck");
		MARPig c=new MARPig("oink");
		MARNamedCow d=new MARNamedCow("rawr", "Nelly");
		MARConfusedChick e=new MARConfusedChick("qwack", "derp");
		
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		arr[3]=d;
		arr[4]=e;
		
		
		MARFarm f=new MARFarm(arr);
		System.out.print(f);


 }
}
