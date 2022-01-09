/**
 * @author Matt Russotti
 *Date: Dec 17, 2019
 *Assignment: MARFarm.java
 */

/**
 * @author mrussotti20
 *
 */
public class MARFarm {
	MARAbstractAnimal [] arr;
	
	public MARFarm(MARAbstractAnimal [] a ) {
		arr=a;
		
	}		

	public String toString() {
		String ans="";
		for (int i=0; i<arr.length; i++) {
			if(arr[i] instanceof MARNamedAnimal ) {
				ans+="Name: "+((MARNamedAnimal) arr[i]).getName()+ " ";
			}
			ans += (arr[i].toString()+", ");
		}
		ans=ans.substring(0,ans.length()-2);
		return ans;
	}

}

