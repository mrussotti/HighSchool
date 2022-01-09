/**
 * @author Matt Russotti
 *Date: Apr 7, 2020
 *Assignment: MitemsMerge.java
 */

/**
 * @author Russotti
 *
 */
public class MARMerge {


	public static void main(String[] itemsgs) {
		String [] a=new String [8];
		a[0]="Tom";
		a[1]=("Tommy");
		a[2]=("Bob");
		a[3]=("Joey");
		a[4]=("Mike");
		a[5]=("Michael");
		a[6]=("Ann");
		a[7]=("Anne");
		sort(a,0,a.length-1);
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}
   /**
	 * This method uses merge sort to organize the method in alhabetical order
	 * @param item- list of words that is being organized
	 * @param s- start of the array
	 * @param e- end of the array
	
	 */
	public static void sort(String [] items, int s, int e) {
		if(s<e) {
			int mid = (s+e)/2;
			
			sort(items,s,mid);
			
			sort(items,mid+1,e);
			
			merge(items,s,e,mid);
		}
	}
	
	/**
	 * This method uses merge sort to organize the method in alhabetical order
	 * @param item- list of words that is being organized
	 * @param s- start of the array
	 * @param m- middle of the array
	 * @param e- end of the array
	
	 */
	public static void merge(String [] items, int s, int e, int mid) {
		String [] temp = new String[items.length];
		int pos1 = s;
		int pos2 = mid+1;
		int spot = s;
		
		while(pos1<=mid || pos2<=e) {
			
			
			if(pos1>mid || (pos2<=e && items[pos2].compareToIgnoreCase(items[pos1])<0)) {
				
				temp[spot]=items[pos2];
				
				pos2++;
			}else {
				
				temp[spot]=items[pos1];
				pos1++;
			}
			spot++;
		}
		
		
		for(int i=s; i<=e; i++) {
			items[i]=temp[i];
		}
	}
}

