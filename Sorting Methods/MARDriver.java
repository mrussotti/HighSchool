import java.util.ArrayList;

/**
 * @author Matt Russotti
 *Date: Mar 20, 2020
 *Assignment: MARDriver.java
 */

/**
 * @author Russotti
 *
 */
public class MARDriver {
	public static void main (String args[]) {
		int [] a=new int [3];
		int [] b=new int [3];
		ArrayList<String> array=new ArrayList<String>();
		 array.add("Tom");
	       array.add("Tommy");
	       array.add("Bob");
		
		array.add("Mary");
	       array.add("Mike");
	       array.add("Michael");
	       array.add("Ann");
	      
	       System.out.println( (array));
	   a= selectionSort(array);
	   for (int i=0;i<a.length;i++) {
		   System.out.println(a[i]);
	   }
	      
	   System.out.println( (array));
	   
	   ///////////////////
	   
		ArrayList<String> array2=new ArrayList<String>();
		 array2.add("Tom");
	       array2.add("Tommy");
	       array2.add("Bob");
		
		array2.add("Mary");
	       array2.add("Mike");
	       array2.add("Michael");
	       array2.add("Ann");
	      
	       System.out.println( (array2));
	   b= insertionSort(array2);
	   for (int i=0;i<b.length;i++) {
		   System.out.println(b[i]);
	   }
	      
	   System.out.println( (array2));
	}



/**
 * This method uses selection sort to organize the method in alhabetical order
 * @param words- arraylist of words that is being organized
 * @return an int array 
 */

	public static int [] selectionSort(ArrayList<String> words) {
		int [] ans=new int [3];
		for (int index=0; index<words.size()-1; index++) {
			int minPos=index;
			ans[0]++;
			for (int subIndex=index+1; subIndex<words.size();subIndex++) {
				if (words.get(subIndex).compareToIgnoreCase(words.get(minPos)) < 0) {													
					minPos=subIndex;
				}
				ans[2]++;
			}
			ans[0]++;
			if (index != minPos) {
				String temp=words.get(index);
				words.set(index,words.get(minPos));
				words.set(minPos,temp);
				ans[1]+=2;
			}

		}
		return ans;
	}
	
	/**
	 * This method uses insertion sort to organize the method in alhabetical order
	 * @param words- arraylist of words that is being organized
	 * @return an int array 
	 */
	public static int [] insertionSort(ArrayList<String> words) {
		int  i;
		int [] ans=new int [3];
		String str;
		for (int index=1; index<words.size();index++) {
			str=words.get(index);
			i=index;
			ans[0]++;
			while(i>0&& 0>str.compareToIgnoreCase(words.get(i-1))) {
				words.add(i-1,words.get(i-1));
				words.remove(i+1);
				ans[1]+=2;
				i--;
				ans[2]++;
			}
			ans[1]+=2;
			words.add(i,str);
			words.remove(i+1);
		}
		return ans;
	}
}

/*
 * Selection sort is more efficient because it performs significantly less assignments
 */



